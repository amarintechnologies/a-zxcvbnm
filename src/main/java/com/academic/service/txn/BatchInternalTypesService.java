package com.academic.service.txn;

import java.util.List;

import com.academic.domain.txn.BatchInternalTypesDM;

public interface BatchInternalTypesService {
	/**
	 * Used to save or update the BatchInternalTypesDM data into the database.      
	 * 
	 * @param BatchInternalTypesDM of
	 *            objInternalTypesDM         
	 */

	public void saveOrUpdateBatchInternal(
			BatchInternalTypesDM objInternalTypesDM);

	/**
	 * used to Retrieve data from BatchInternalTypesDM  based on given parameters.
	 *   
	 * 
	 * @param Long internalTypeid,
			Long batchId, Long studId, String internlName, String maxScore,
			String status  
	 */
	public List<BatchInternalTypesDM> getBatchInternalList(Long internalTypeid,
			Long batchId, String internlName, Long maxScore,
			String status);

}
