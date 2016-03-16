
package com.base.daoimpl.txn;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.dao.txn.AuditConfigDAO;
import com.base.domain.mst.CityDM;
import com.base.domain.txn.AuditConfigDM;

@Repository
public class AuditConfigDAOImpl implements AuditConfigDAO {
	private Logger logger = Logger.getLogger(AuditConfigDAOImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * get column names based on table name and company id
	 * 
	 * @param String
	 *            tableName
	 * @param Long
	 *            companyId
	 * @param Long
	 *            configId
	 * @return List<MBaseAuditConfig>
	 */
	public List<AuditConfigDM> getColumnNameByTableName(Long screenid,String tableName, Long companyId, Long configId) {
		// TODO Auto-generated method stub
		logger.info("Inside getColumnNameByTableName > " +screenid+","+ tableName + ", " + companyId + "," + configId);
		Query query = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select distinct ac.configId as configId,ac.companyId as companyId ,ac.tableName as tableName,");
		sql.append(" ac.columnName as columnName,ac.auditEvent as auditEvent,ac.onOff as onOff,ac.scrFldName as scrFldName,");
		sql.append("ad.screenId as screenid,ad.screendesc as screendesc  from AuditConfigDM ac,AppScreensDM ad where 1=1");
		sql.append(" and ac.screenid=ad.screenId");
		if (tableName != null) {
			sql.append(" and ac.tableName='" + tableName + "'");
		}
		if (screenid != null) {
		sql.append(" and ac.screenid=" + screenid);
		}
		sql.append(" and ac.companyId=" + companyId);
		if (configId != null) {
		sql.append(" and ac.configId=" + configId);
		}
		logger.info("Inside getColumnNameByTableName > Query > " + sql);
		query = sessionFactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(AuditConfigDM.class));
		return query.list();
	}
	
	/**
	 * Method for save or update AuditConfig details
	 * 
	 * @param AuditConfigDM
	 *            baseAuditConfigObj
	 */
	public void saveAndUpdateDetails(AuditConfigDM baseAuditConfigObj) {
		logger.info("Inside saveAndUpdate > " + baseAuditConfigObj.getTableName() + "'"
				+ baseAuditConfigObj.getCompanyId());
		sessionFactory.getCurrentSession().update(baseAuditConfigObj);
	}
}
