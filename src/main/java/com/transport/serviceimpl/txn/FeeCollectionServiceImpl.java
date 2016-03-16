package com.transport.serviceimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.transport.dao.txn.FeeColloectionDAO;
import com.transport.domain.txn.FeeCollectionDM;
import com.transport.service.txn.FeeCollectionService;

public class FeeCollectionServiceImpl implements FeeCollectionService {
	@Autowired
	private FeeColloectionDAO FeeColloectionDAO;
	private Logger logger = Logger.getLogger(FeeCollectionServiceImpl.class);
	
	/** Method for save or update FeeCollectionDM **/
	/**
	 * @param feecollectionObj
	 *            of FeeCollectionDM
	 */
	@Transactional
	public void saveorUpdatefeepayment(FeeCollectionDM feecollectionObj) {
		// TODO Auto-generated method stub
		FeeColloectionDAO.saveorUpdatefeecollection(feecollectionObj);
		}
	/** Get getFeecollectionlist  based on feecolid **/
	/**
	 * @param Long feecolid,Date startdate,Date enddate,Date duedate,String status);
	 * 
	 * @return list of FeeCollectionDM
	 */
	@Transactional
	public List<FeeCollectionDM> getFeecollectionlist(Long feecolid,
			Date startdate, Date enddate, Date duedate, String status) {
		// TODO Auto-generated method stub
		return FeeColloectionDAO.getFeecollectionlist(feecolid, startdate, enddate, duedate, status);
	}
}
