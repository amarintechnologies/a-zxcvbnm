package com.hostel.daoimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hostel.dao.txn.HtlFeepaymentDAO;
import com.hostel.domain.txn.HtlFeepaymentDM;
import com.transport.daoimpl.txn.FeePaymentDAOImpl;
import com.transport.domain.txn.FeePaymentDM;

@Repository
public class HtlFeepaymentDAOImpl implements HtlFeepaymentDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(HtlFeepaymentDAOImpl.class);

	/** Method for save or update HtlFeepaymentDM **/
	/**
	 * @param feepaymentObj
	 *            of HtlFeepaymentDM
	 */
	public void saveorUpdatefeepayment(HtlFeepaymentDM feepaymentObj) {
		sessionfactory.getCurrentSession().saveOrUpdate(feepaymentObj);

	}

	/** Get getFeePaymentList based on feepymtid **/
	/**
	 * @param Long
	 *            feepymtid,Long feecolid,Long companyid,String status);
	 * 
	 * @return list of HtlFeepaymentDM
	 */
	public List<HtlFeepaymentDM> getFeePaymentList(Long feepymtid,
			Long feecolid, Long companyid, String status,Long studentid) {
		logger.info("Inside  getFeePaymentList >  " + "feepymtid " + feepymtid
				+ "feecolid " + feecolid + " companyid" + companyid
				+ "studentid" + "status" + status);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" c.feepymtid as feepymtid,c.feecolid as feecolid,c.studentid as studentid,c.companyid as companyid,");
		sql.append(" c.pymtamount as pymtamount,c.duedate as duedate,c.remarks as remarks,");
		sql.append(" c.paiddate as paiddate,c.paidamount as paidamount,c.pymttype as pymttype,c.pymtremarks as pymtremarks,c.status as status,c.lastupdateddt as lastupdateddt,c.lastupdatedby as lastupdatedby,st.firstName as studentName");
		sql.append(" from HtlFeepaymentDM c,StudentDM st where 1=1 and st.studentId=c.studentid");

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

		if (status != null) {
			sql.append(" and c.status = '" + status + "'");
		}
		sql.append(" order by c.lastupdateddt desc");
		logger.info("Inside getFeePaymentList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(HtlFeepaymentDM.class));
		return query.list();
	}

}
