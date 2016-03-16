package com.transport.dao.txn;

import java.util.Date;
import java.util.List;

import com.transport.domain.txn.FeeCollectionDM;

public interface FeeColloectionDAO {
	/** Method for save or update FeeCollectionDM **/
	/**
	 * @param feecollectionObj
	 *            of FeeCollectionDM
	 */
	public void saveorUpdatefeecollection(FeeCollectionDM feecollectionObj);
	
	/** Get getFeecollectionlist  based on feecolid **/
	/**
	 * @param Long feecolid,Date startdate,Date enddate,Date duedate,String status);
	 * 
	 * @return list of FeeCollectionDM
	 */
	public List<FeeCollectionDM> getFeecollectionlist(Long feecolid,Date startdate,Date enddate,Date duedate,String status);
}



