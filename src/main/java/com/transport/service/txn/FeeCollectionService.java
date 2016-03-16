package com.transport.service.txn;

import java.util.Date;
import java.util.List;

import com.transport.domain.txn.FeeCollectionDM;

public interface FeeCollectionService {
	/** Method for save or update FeeCollectionDM **/
	/**
	 * @param feecollectionObj
	 *            of FeeCollectionDM
	 */
	public void saveorUpdatefeepayment(FeeCollectionDM feecollectionObj);
	
	/** Get getFeecollectionlist  based on feecolid **/
	/**
	 * @param Long feecolid,Date startdate,Date enddate,Date duedate,String status);
	 * 
	 * @return list of FeeCollectionDM
	 */
	public List<FeeCollectionDM> getFeecollectionlist(Long feecolid,Date startdate,Date enddate,Date duedate,String status);
}


