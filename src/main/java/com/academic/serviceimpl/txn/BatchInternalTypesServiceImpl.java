package com.academic.serviceimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.BatchInternalTypesDAO;
import com.academic.domain.txn.BatchInternalTypesDM;
import com.academic.service.txn.BatchInternalTypesService;

public class BatchInternalTypesServiceImpl implements BatchInternalTypesService {
	@Autowired
	private BatchInternalTypesDAO batchInternalTypesDAO;
	private Logger logger = Logger.getLogger(BatchExamStudentServiceImpl.class);

	/**
	 * Used to save or update the BatchInternalTypesDM data into the database.
	 *      
	 * 
	 * @param BatchInternalTypesDM
	 *            of objInternalTypesDM         
	 */

	@Transactional
	public void saveOrUpdateBatchInternal(
			BatchInternalTypesDM objInternalTypesDM) {
		batchInternalTypesDAO.saveOrUpdateBatchInternal(objInternalTypesDM);
	}

	/**
	 * used to Retrieve data from BatchInternalTypesDM based on given
	 * parameters.   
	 * 
	 * @param Long internalTypeid, Long batchId, Long studId, String
	 *             internlName, String maxScore, String status  
	 */
	@Transactional
	public List<BatchInternalTypesDM> getBatchInternalList(Long internalTypeid,
			Long batchId, String internlName, Long maxScore, String status) {
		return batchInternalTypesDAO.getBatchInternalList(internalTypeid,
				batchId, internlName, maxScore, status);
	}

}
