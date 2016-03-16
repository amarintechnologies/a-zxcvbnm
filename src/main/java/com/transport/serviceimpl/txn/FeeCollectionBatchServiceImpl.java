package com.transport.serviceimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.transport.dao.txn.FeeCollectionBatchDAO;
import com.transport.domain.txn.FeeCollectionBatchDM;
import com.transport.service.txn.FeeCollectionBatchService;

public class FeeCollectionBatchServiceImpl implements  FeeCollectionBatchService{
	@Autowired
	private FeeCollectionBatchDAO FeeColloectionbatchDAO;
	private Logger logger = Logger.getLogger(FeeCollectionBatchServiceImpl.class);
	
	
	/** Method for save or update FeeCollectionBatchDM **/
	/**
	 * @param feecollectionbatchObj
	 *            of FeeCollectionBatchDM
	 */
	@Transactional
	public void saveorUpdatefeecollectionbatch(
			FeeCollectionBatchDM feecollectionbatchObj) {
		// TODO Auto-generated method stub
		
		FeeColloectionbatchDAO.saveorUpdatefeecollectionbatch(feecollectionbatchObj);
	}
	/** Get getFeecollectionbatchlist  based on feecolbatchid **/
	/**
	 * @param Long feecolbatchid,Long feecolid,Long courseid,Long batchid,String status)
	 * 
	 * @return list of FeeCollectionBatchDM
	 */
	@Transactional
	public List<FeeCollectionBatchDM> getFeecollectionbatchlist(
			Long feecolbatchid, Long feecolid, Long courseid, Long batchid,
			String status) {
		// TODO Auto-generated method stub
		return FeeColloectionbatchDAO.getFeecollectionbatchlist(feecolbatchid, feecolid, courseid, batchid, status);
	}
	
}
