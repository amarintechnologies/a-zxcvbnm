package com.hostel.dao.txn;

import java.util.List;

import com.hostel.domain.txn.HtlFeepaymentDM;
import com.transport.domain.txn.FeePaymentDM;

public interface HtlFeepaymentDAO {
	/** Method for save or update HtlFeepaymentDM **/
	/**
	 * @param feepaymentObj
	 *            of HtlFeepaymentDM
	 */
	public void saveorUpdatefeepayment(HtlFeepaymentDM feepaymentObj);
	
	/** Get getFeePaymentList  based on feepymtid **/
	/**
	 * @param Long feepymtid,Long feecolid,Long companyid,String status);
	 * 
	 * @return list of HtlFeepaymentDM
	 */
	public List<HtlFeepaymentDM> getFeePaymentList(Long feepymtid,Long feecolid,Long companyid,String status,Long studentid);

}
