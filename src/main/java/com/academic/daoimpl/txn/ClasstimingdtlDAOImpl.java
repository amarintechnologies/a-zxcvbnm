package com.academic.daoimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.ClasstimingdtlDAO;
import com.academic.domain.txn.AcdbatchDM;
import com.academic.domain.txn.ClasstimingdtlDM;
import com.erputil.util.DateUtils;

@Repository
public class ClasstimingdtlDAOImpl implements ClasstimingdtlDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(ClasstimingdtlDAOImpl.class);

	/** Method for save or update ClasstimingdtlDM **/
	/**
	 * @param classdtlObj
	 *            of ClasstimingdtlDM
	 */

	public void saveorUpdatemacdbatchDetails(ClasstimingdtlDM classdtlObj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(classdtlObj);
	}

	/** Getgetclasstimingdtllist based on batch_id **/
	/**
	 * To get getclasstimingdtllistbased on classtimedtlid and classtimeid
	 * 
	 * @param Long
	 *            classtimedtlid,Long classtimeid,String refname
	 * 
	 * 
	 * @return list of ClasstimingdtlDM
	 */
	public List<ClasstimingdtlDM> getclasstimingdtllist(Long classtimedtlid,
			Long classtimeid, String refname, Date starttime, Date endtime) {
		// TODO Auto-generated method stub
		logger.info("Inside  getclasstimingdtllist >  " + "classtimedtlid "
				+ classtimedtlid + "classtimeid " + classtimeid + " refname"
				+ refname);
		StringBuffer sql = new StringBuffer("select ");
		sql.append(" m.classtimedtlid as classtimedtlid,m.classtimeid as classtimeid,m.refname as refname,m.starttime as starttime,m.endtime as endtime,");
		sql.append(" m.breakyn as breakyn,m.remarks as remarks,m.lastupdateddt as lastupdateddt,m.lastupdatedby as lastupdatedby,c.timingname as timingname");
		sql.append(" from ClasstimingdtlDM m,ClasstimingDM c where 1=1");
		sql.append(" and m.classtimeid = c.classtimeid ");
		Query query = null;
		if (classtimedtlid != null) {
			sql.append(" and m.classtimedtlid =" + classtimedtlid);
		}
		if (classtimeid != null) {
			sql.append(" and m.classtimeid =" + classtimeid);
		}
		if (refname != null && refname.trim().length() > 0) {
			sql.append(" and lower(m.refname)like lower('" + refname + "%')");
		}
		if (starttime != null) {

			sql.append(" and m.starttime between '"
					+ DateUtils.datetostringtimefull(starttime) + "' and '"
					+ DateUtils.datetostringtimefull(endtime) + "'");
		}
		sql.append(" order by m.lastupdateddt desc");
		logger.info("Inside getclasstimingdtllist > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(ClasstimingdtlDM.class));
		return query.list();
	}

}
