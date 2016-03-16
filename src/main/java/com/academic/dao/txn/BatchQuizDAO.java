package com.academic.dao.txn;

import java.util.List;

import com.academic.domain.txn.BatchQuizDM;

public interface BatchQuizDAO {
	/**
	 * Used to save or update the BatchInternalTypesDM data into the database.
	 *      
	 * 
	 * @param BatchQuizDM
	 *            of objBatchQuizDM         
	 */

	public void saveOrUpdateBatchQuiz(BatchQuizDM objBatchQuizDM);

	/**
	 * used to Retrieve data from BatchQuizDM based on given parameters.   
	 * 
	 * @param Long quizId, Long batchId,
			String quizName, Double maxScore, String statusF
	 */
	public List<BatchQuizDM> getBatchQuizList(Long quizId, Long batchId,
			String quizName, Long maxScore, String status);

}
