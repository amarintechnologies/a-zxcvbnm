

package com.base.daoimpl.rpt;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.dao.rpt.LoggerDAO;
import com.base.domain.txn.LoggerDM;
import com.base.domain.txn.OrgNewsDM;

@Repository
public class LoggerDAOImpl implements LoggerDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(LoggerDAOImpl.class);

	/**
	 * Return List from TBaseLogger, based on user's input
	 * 
	 * @param String
	 *            logRef,logDes,errorCode,logType
	 * @return List of LoggerDM
	 */
	public List<LoggerDM> getLoggerList(Long companyId,String logRef, String logDes,
			String errorCode, String logType, String filtertype) {
		logger.info("Inside getLoggerList > " +companyId+","+logRef + ", " + logDes + ", "
				+ errorCode + "," + logType);
		Query query = null;
		StringBuffer sql = new StringBuffer(" select");
		if (filtertype.equals("P")) {
			sql.append(" new LoggerDM(logid,logref) ");
			sql.append(" from LoggerDM l where 1=1");
		} else {
			sql.append(" l.logid as logid, l.companyid as companyid, l.logref as logref, u.loginid as loginid, ");
			sql.append(" l.logtype as logtype, l.logdescription as logdescription, l.errcode as errcode, ");
			sql.append(" l.clientip as clientip, l.userid as userid, l.lastupdateddate as lastupdateddate, l.lastupdatedby as lastupdatedby ");

			sql.append(" from UserDM u,LoggerDM l where 1=1 ");
			sql.append(" and l.userid= u.userid");
		}

		if (logRef != "" && logRef != null) {
			sql.append(" and lower(l.logref) like lower('" + logRef + "%')");
		}

		if (logDes != "" && logDes != null) {
			sql.append(" and lower(l.logdescription) like lower('" + logDes
					+ "%')");
		}

		if (errorCode != null && errorCode != "") {
			sql.append(" and lower(l.errcode) like lower('" + errorCode + "%')");
		}

		if (logType != null && logType != "") {
			sql.append(" and lower(l.logtype) like lower('" + logType + "')");
		}
		if (companyId != null) {
			sql.append(" and l.companyid = " + companyId);
		}

		sql.append(" order by l.lastupdateddate desc");
		logger.info("Inside getLoggerList > Query > " + sql);
		query = sessionfactory.getCurrentSession().createQuery(sql.toString()).setResultTransformer(Transformers.aliasToBean(LoggerDM.class));

		return query.list();
	}

}
