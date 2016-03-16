package com.transport.service.txn;

import java.util.List;

import com.transport.domain.txn.FeeCollectionBatchDM;

public interface FeeCollectionBatchService {
	/** Method for save or update FeeCollectionBatchDM **/
	/**
	 * @param feecollectionbatchObj
	 *            of FeeCollectionBatchDM
	 */
	public void saveorUpdatefeecollectionbatch(FeeCollectionBatchDM feecollectionbatchObj);
	
	/** Get getFeecollectionbatchlist  based on feecolbatchid **/
	/**
	 * @param Long feecolbatchid,Long feecolid,Long courseid,Long batchid,String status)
	 * 
	 * @return list of FeeCollectionBatchDM
	 */
	public List<FeeCollectionBatchDM> getFeecollectionbatchlist(Long feecolbatchid,Long feecolid,Long courseid,Long batchid,String status);
}

