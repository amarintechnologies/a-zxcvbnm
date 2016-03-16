package com.hostel.daoimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hostel.dao.txn.HtlFeeCollectionBatchDAO;
import com.hostel.domain.txn.HtlFeeCollectionBatchDM;

@Repository
public class HtlFeeCollectionBatchDAOImpl implements HtlFeeCollectionBatchDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger
			.getLogger(HtlFeeCollectionBatchDAOImpl.class);

	/** Method for save or update HtlFeeCollectionBatchDM **/
	/**
	 * @param feecollectionbatchObj
	 *            of HtlFeeCollectionBatchDM
	 */
	public void saveorUpdatehtlfeecollectionbatch(
			HtlFeeCollectionBatchDM feecollectionbatchObj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(feecollectionbatchObj);

	}

	/** Get getFeecollectionbatchlist based on feecolbatchid **/
	/**
	 * @param Long
	 *            feecolbatchid, Long feecolid, Long courseid, Long batchid,
	 *            String status
	 * 
	 * @return list of HtlFeeCollectionBatchDM
	 */
	public List<HtlFeeCollectionBatchDM> getHtlFeecollectionbatchlist(
			Long feecolbatchid, Long feecolid, Long courseid, Long batchid,
			String status) {
		logger.info("Inside  getHtlFeecollectionbatchlist >  "
				+ "feecolbatchid " + feecolbatchid + "feecolid " + feecolid
				+ " courseid" + courseid + "batchid" + batchid + "status"
				+ status);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" m.feecolbatchid as feecolbatchid,m.feecolid as feecolid,m.courseid as courseid,m.batchid as batchid,m.status as status,");
		sql.append(" m.lastupdateddt as lastupdateddt,m.lastupdatedby as lastupdatedby,c.course_name as course_name,b.batch_name as batch_name");
		sql.append(" from HtlFeeCollectionBatchDM m, AcdCourseDM c,AcdbatchDM b where 1=1");
		sql.append(" and m.courseid = c.course_id and m.batchid=b.batch_id ");
		Query query = null;
		if (feecolbatchid != null) {
			sql.append(" and m.feecolbatchid =" + feecolbatchid);
		}
		if (feecolid != null) {
			sql.append(" and m.feecolid =" + feecolid);
		}
		if (courseid != null) {
			sql.append(" and m.courseid =" + courseid);
		}
		if (batchid != null) {
			sql.append(" and m.batchid =" + batchid);
		}

		if (status != null) {
			sql.append(" and m.status='" + status + "'");
		}
		sql.append(" order by m.lastupdateddt desc");
		logger.info("Inside getFeecollectionbatchlist > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(HtlFeeCollectionBatchDM.class));
		return query.list();
	}

}
