package com.academic.service.txn;

import java.math.BigDecimal;
import java.util.List;

import com.academic.domain.txn.BatchIntScrDM;

public interface BatchIntScrService {
	/**
	 * Used to save or update the BatchIntScrDM data into the database.      
	 * 
	 * @param BatchIntScrDM
	 *            of objBatchIntScrDM         
	 */

	public void saveOrUpdateBatchIntScr(BatchIntScrDM objBatchIntScrDM);

	/**
	 * used to Retrieve data from BatchIntScrDM based on given parameters.   
	 * 
	 * @param Long intrnlscoreId,String course_name, String batch_name, String
	 *             firstName, String internlName, Long studentId, BigDecimal
	 *             score, String status
	 */
	public List<BatchIntScrDM> getBatchIntScrList(Long intrnlscoreId,Long courseId,Long batchId, String course_name,
			String batch_name, String firstName, String internlName,
			Long studentId, BigDecimal score, String status);
}
