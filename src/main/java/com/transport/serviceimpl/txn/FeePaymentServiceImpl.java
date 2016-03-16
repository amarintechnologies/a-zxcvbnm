package com.transport.serviceimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.transport.dao.txn.FeePaymentDAO;
import com.transport.domain.txn.FeePaymentDM;
import com.transport.service.txn.FeePaymentService;

public class FeePaymentServiceImpl implements FeePaymentService{
	@Autowired
	private FeePaymentDAO FeePaymentDAO;
	private Logger logger = Logger.getLogger(FeePaymentServiceImpl.class);
	/** Method for save or update FeePaymentDM **/
	/**
	 * @param feepaymentObj
	 *            of FeePaymentDM
	 */
	@Transactional
	public void saveorUpdatefeecollection(FeePaymentDM feepaymentObj) {
		// TODO Auto-generated method stub
		FeePaymentDAO.saveorUpdatefeepayment(feepaymentObj);
	}
	/** Get getFeePaymentList  based on feepymtid **/
	/**
	 * @param Long feepymtid,Long feecolid,Long companyid,Long studentid, Long empid,Long routeid,Long rtstopid,String status);
	 * 
	 * @return list of FeePaymentDM
	 */
	@Transactional
	public List<FeePaymentDM> getFeePaymentList(Long feepymtid, Long feecolid,
			Long companyid, Long studentid, Long empid, Long routeid,
			Long rtstopid, String status) {
		// TODO Auto-generated method stub
		return FeePaymentDAO.getFeePaymentList(feepymtid, feecolid, companyid, studentid, empid, routeid, rtstopid, status);
	}

}
