package com.transport.daoimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erputil.util.DateUtils;
import com.transport.dao.txn.FeePaymentDAO;
import com.transport.domain.txn.FeeCollectionDM;
import com.transport.domain.txn.FeePaymentDM;

@Repository
public class FeePaymentDAOImpl implements FeePaymentDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(FeePaymentDAOImpl.class);

	/** Method for save or update FeePaymentDM **/
	/**
	 * @param feepaymentObj
	 *            of FeePaymentDM
	 */
	public void saveorUpdatefeepayment(FeePaymentDM feepaymentObj) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().saveOrUpdate(feepaymentObj);
	}

	/** Get getFeePaymentList based on feepymtid **/
	/**
	 * @param Long
	 *            feepymtid,Long feecolid,Long companyid,Long studentid, Long
	 *            empid,Long routeid,Long rtstopid,String status);
	 * 
	 * @return list of FeePaymentDM
	 */
	public List<FeePaymentDM> getFeePaymentList(Long feepymtid, Long feecolid,
			Long companyid, Long studentid, Long empid, Long routeid,
			Long rtstopid, String status) {
		logger.info("Inside  getFeePaymentList >  " + "feepymtid " + feepymtid
				+ "feecolid " + feecolid + " companyid" + companyid
				+ "studentid" + studentid + "empid" + empid + "routeid"
				+ routeid + "rtstopid" + rtstopid + "status" + status);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" c.feepymtid as feepymtid,c.feecolid as feecolid,c.companyid as companyid,c.studentid as studentid,c.empid as empid,");
		sql.append(" c.routeid as routeid,c.rtstopid as rtstopid,c.pymtamount as pymtamount,c.duedate as duedate,c.remarks as remarks,");
		sql.append(" c.paiddate as paiddate,c.paidamount as paidamount,c.pymttype as pymttype,c.pymtremarks as pymtremarks,c.status as status,c.lastupdateddt as lastupdateddt,c.lastupdatedby as lastupdatedby,");
		sql.append(" r.routename as routename");
		sql.append(" from FeePaymentDM c,RouteDM r  where 1=1");
		sql.append(" and c.routeid=r.routeid ");

		Query query = null;
		if (feepymtid != null) {
			sql.append(" and c.feepymtid =" + feepymtid);
		}
		if (feecolid != null) {
			sql.append(" and c.feecolid =" + feecolid);
		}
		if (companyid != null) {
			sql.append(" and c.companyid =" + companyid);
		}
		if (studentid != null) {
			sql.append(" and c.studentid =" + studentid);
		}
		if (empid != null) {
			sql.append(" and c.empid =" + empid);
		}
		if (routeid != null) {
			sql.append(" and c.routeid =" + routeid);
		}
		if (rtstopid != null) {
			sql.append(" and c.rtstopid =" + rtstopid);
		}
		if (status != null) {
			sql.append(" and c.status = '" + status + "'");
		}
		sql.append(" order by c.lastupdateddt desc");
		logger.info("Inside getFeePaymentList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(FeePaymentDM.class));
		return query.list();
	}

}
