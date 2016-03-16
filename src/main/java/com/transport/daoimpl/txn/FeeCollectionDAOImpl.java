package com.transport.daoimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.daoimpl.txn.AcdbatchDAOImpl;
import com.academic.domain.mst.AcdCourseDM;
import com.erputil.util.DateUtils;
import com.transport.dao.txn.FeeColloectionDAO;
import com.transport.domain.txn.FeeCollectionDM;

@Repository
public class FeeCollectionDAOImpl implements FeeColloectionDAO {
	
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(FeeCollectionDAOImpl.class);
	
	/** Method for save or update FeeCollectionDM **/
	/**
	 * @param feecollectionObj
	 *            of FeeCollectionDM
	 */
	public void saveorUpdatefeecollection(FeeCollectionDM feecollectionObj) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().saveOrUpdate(feecollectionObj);
	}
	/** Get getFeecollectionlist  based on feecolid **/
	/**
	 * @param Long feecolid,Date startdate,Date enddate,Date duedate,String status);
	 * 
	 * @return list of FeeCollectionDM
	 */
	public List<FeeCollectionDM> getFeecollectionlist(Long feecolid,
			Date startdate, Date enddate, Date duedate, String status) {
		// TODO Auto-generated method stub
		logger.info("Inside  getFeecollectionlist >  " + "feecolid " + feecolid
				+ "startdate " + startdate + " enddate" + enddate
				+ "duedate" + duedate + "status"
				+ status);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" c.feecolid as feecolid,c.startdate as startdate,c.enddate as enddate,c.duedate as duedate,c.includeempyn as includeempyn,");
		sql.append(" c.remarks as remarks,c.status as status,c.lastupdateddt as lastupdateddt,c.lastupdatedby as lastupdatedby");
		sql.append(" from FeeCollectionDM c  where 1=1");
		Query query = null;
		if (feecolid != null) {
			sql.append(" and c.feecolid =" + feecolid);
		}
		if (startdate != null) {
			sql.append(" and c.startdate='" + DateUtils.datetostring(startdate) + "'");
		}
		if (enddate != null) {
			sql.append(" and c.enddate='" + DateUtils.datetostring(enddate) + "'");
		}
		
		if (duedate != null) {
			sql.append(" and c.duedate='" + DateUtils.datetostring(duedate) + "'");
		}
		if (status != null) {
			sql.append(" and c.status = '" + status + "'");
		}
		sql.append(" order by c.lastupdateddt desc");
		logger.info("Inside getFeecollectionlist > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(FeeCollectionDM.class));
		return query.list();
	}

}

		

