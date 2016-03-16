package com.transport.dao.txn;

import java.util.List;

import com.transport.domain.txn.FeePaymentDM;

public interface FeePaymentDAO {
	/** Method for save or update FeePaymentDM **/
	/**
	 * @param feepaymentObj
	 *            of FeePaymentDM
	 */
	public void saveorUpdatefeepayment(FeePaymentDM feepaymentObj);
	
	/** Get getFeePaymentList  based on feepymtid **/
	/**
	 * @param Long feepymtid,Long feecolid,Long companyid,Long studentid, Long empid,Long routeid,Long rtstopid,String status);
	 * 
	 * @return list of FeePaymentDM
	 */
	public List<FeePaymentDM> getFeePaymentList(Long feepymtid,Long feecolid,Long companyid,Long studentid, Long empid,Long routeid,Long rtstopid,String status);
}

