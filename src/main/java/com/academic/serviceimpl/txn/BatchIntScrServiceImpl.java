package com.academic.serviceimpl.txn;

import java.math.BigDecimal;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.BatchIntScrDAO;
import com.academic.domain.txn.BatchIntScrDM;
import com.academic.service.txn.BatchIntScrService;

public class BatchIntScrServiceImpl implements BatchIntScrService {
	@Autowired
	private BatchIntScrDAO batchIntScrDAO;
	private Logger logger = Logger.getLogger(BatchIntScrServiceImpl.class);

	/**
	 * Used to save or update the BatchIntScrDM data into the database.      
	 * 
	 * @param BatchIntScrDM
	 *            of objBatchIntScrDM         
	 */
	@Transactional
	public void saveOrUpdateBatchIntScr(BatchIntScrDM objBatchIntScrDM) {
		logger.info("Inside saveOrUpdateBatchIntScr > "
				+ "About to save the data ... ");
		batchIntScrDAO.saveOrUpdateBatchIntScr(objBatchIntScrDM);

	}

	/**
	 * used to Retrieve data from BatchIntScrDM based on given parameters.   
	 * 
	 * @param Long intrnlscoreId, Long batchId, Long internaltypeId, Long
	 *             studentId, BigDecimal score, String status
	 */
	@Transactional
	public List<BatchIntScrDM> getBatchIntScrList(Long intrnlscoreId,
			Long courseId, Long batchId, String course_name, String batch_name,
			String firstName, String internlName, Long studentId,
			BigDecimal score, String status) {
		// TODO Auto-generated method stub
		return batchIntScrDAO.getBatchIntScrList(intrnlscoreId, courseId,
				batchId, course_name, batch_name, firstName, internlName,
				studentId, score, status);
	}

}
