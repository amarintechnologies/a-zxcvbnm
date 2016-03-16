package com.academic.daoimpl.txn;

import java.util.List;

import javax.persistence.Column;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.BatchQuizDAO;
import com.academic.domain.txn.BatchInternalTypesDM;
import com.academic.domain.txn.BatchQuizDM;

@Repository
public class BatchQuizDAOImpl implements BatchQuizDAO {

	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(BatchQuizDAOImpl.class);

	/**
	 * Used to save or update the BatchInternalTypesDM data into the database.
	 *      
	 * 
	 * @param BatchQuizDM
	 *            of objBatchQuizDM         
	 */

	public void saveOrUpdateBatchQuiz(BatchQuizDM objBatchQuizDM) {
		logger.info("Inside  saveOrUpdateBatchInternal >  ");

		sessionFactory.getCurrentSession().saveOrUpdate(objBatchQuizDM);
	}

	/**
	 * used to Retrieve data from BatchQuizDM based on given parameters.   
	 * 
	 * @param Long quizId, Long batchId, String quizName, Double maxScore,
	 *             String statusF
	 */


	public List<BatchQuizDM> getBatchQuizList(Long quizId, Long batchId,
			String quizName, Long maxScore, String status) {
		logger.info("Inside  getBatchInternalList >  ");
		Query query = null;
		StringBuffer sql = new StringBuffer(" select ");

		sql.append(" mt.quizId as quizId,mt.batchId as batchId,mt.quizName as quizName,mt.maxScore as maxScore,");
		sql.append(" mt.status as status,mt.updatedDt as updatedDt,mt.updatedBy as updatedBy,  ");
		sql.append(" bt.batch_name as batchName ");

		sql.append(" from BatchQuizDM mt , AcdbatchDM bt  where 1=1 and bt.batch_id=mt.batchId ");

		if (quizId != null) {
			sql.append(" and mt.quizId=" + quizId);
		}
		if (batchId != null) {
			sql.append(" and mt.batchId=" + batchId);
		}

		if (maxScore != null) {
			sql.append(" and mt.maxScore=" + maxScore);
		}

		if (quizName != null) {
			sql.append(" and mt.quizName ='" + quizName + "'");
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
						Transformers.aliasToBean(BatchQuizDM.class));
		return query.list();
	}
	}


