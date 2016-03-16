package com.academic.serviceimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.BatchQuizDAO;
import com.academic.domain.txn.BatchQuizDM;
import com.academic.service.txn.BatchQuizService;

public class BatchQuizServiceImpl implements BatchQuizService {
	@Autowired
	private BatchQuizDAO batchQuizDAO;
	private Logger logger = Logger.getLogger(BatchQuizServiceImpl.class);

	/**
	 * Used to save or update the BatchInternalTypesDM data into the database.
	 *      
	 * 
	 * @param BatchQuizDM
	 *            of objBatchQuizDM         
	 */
	@Transactional
	public void saveOrUpdateBatchQuiz(BatchQuizDM objBatchQuizDM) {
		batchQuizDAO.saveOrUpdateBatchQuiz(objBatchQuizDM);
	}

	/**
	 * used to Retrieve data from BatchQuizDM based on given parameters.   
	 * 
	 * @param Long quizId, Long batchId, String quizName, Double maxScore,
	 *             String statusF
	 */
	@Transactional
	public List<BatchQuizDM> getBatchQuizList(Long quizId, Long batchId,
			String quizName, Long maxScore, String status) {
		// TODO Auto-generated method stub
		return batchQuizDAO.getBatchQuizList(quizId, batchId, quizName,
				maxScore, status);
	}

}
