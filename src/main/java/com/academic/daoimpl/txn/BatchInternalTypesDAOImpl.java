package com.academic.daoimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.BatchInternalTypesDAO;
import com.academic.domain.txn.BatchInternalTypesDM;

@Repository
public class BatchInternalTypesDAOImpl implements BatchInternalTypesDAO {

	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(BatchInternalTypesDAOImpl.class);

	/**
	 * Used to save or update the BatchInternalTypesDM data into the database.
	 *      
	 * 
	 * @param BatchInternalTypesDM
	 *            of objInternalTypesDM         
	 */

	public void saveOrUpdateBatchInternal(
			BatchInternalTypesDM objInternalTypesDM) {
		logger.info("Inside  saveOrUpdateBatchInternal >  ");

		sessionFactory.getCurrentSession().saveOrUpdate(objInternalTypesDM);
	}

	/**
	 * used to Retrieve data from BatchInternalTypesDM based on given
	 * parameters.   
	 * 
	 * @param Long internalTypeid, Long batchId, Long studId, String
	 *             internlName, String maxScore, String status  
	 */

	public List<BatchInternalTypesDM> getBatchInternalList(Long internalTypeid,
			Long batchId, String internlName, Long maxScore, String status) {
		logger.info("Inside  getBatchInternalList >  ");
		Query query = null;
		StringBuffer sql = new StringBuffer(" select ");

		sql.append("mt.internalTypeid as internalTypeid,mt.batchId as batchId,mt.internlName as internlName,mt.maxScore as maxScore,");
		sql.append("mt.status as status,mt.updatedDt as updatedDt,mt.updatedBy as updatedBy, ");
		sql.append(" bt.batch_name as batchName ");

		sql.append(" from BatchInternalTypesDM mt , AcdbatchDM bt  where 1=1 and bt.batch_id=mt.batchId ");

		if (internalTypeid != null) {
			sql.append(" and mt.internalTypeid=" + internalTypeid);
		}
		if (batchId != null) {
			sql.append(" and mt.batchId=" + batchId);
		}

		if (maxScore != null) {
			sql.append(" and mt.maxScore=" + maxScore);
		}

		if (internlName != null) {
			sql.append(" and mt.internlName ='" + internlName + "'");
		}

		if (status != null) {
			sql.append(" and lower(mt.status) like lower('" + status + "%')");
		}

		sql.append(" order by mt.updatedDt desc");
		logger.info("Inside getExamStudList > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(BatchInternalTypesDM.class));
		return query.list();
	}

}
