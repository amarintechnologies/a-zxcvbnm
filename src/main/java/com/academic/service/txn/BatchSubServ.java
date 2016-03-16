package com.academic.service.txn;

import java.util.List;

import com.academic.domain.txn.BatchSubDM;

public interface BatchSubServ {
	/**
	 * Method for return AssetBrandDM list based on user's parameters
	 * 
	 * @param brandName
	 *            ,status,filterType
	 * @return BatchSubDM List
	 */
	public List<BatchSubDM> getBatchSubList(Long batchid, Long subjectid,
			String classpweek, String examyn, String status);

	/**
	 * Method for save and update AssetBrandDM data
	 * 
	 * @param obj
	 */
	public void saveOrUpdate(BatchSubDM obj);

	public List<BatchSubDM> getBatchSubListNoPK(Long batchid,
			String classpweek, String examyn, String status);
	public void deleteBatchSub(Long batchSubjectId);
}
