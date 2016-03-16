package com.hostel.serviceimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.hostel.dao.txn.HtlFeepaymentDAO;
import com.hostel.domain.txn.HtlFeepaymentDM;
import com.hostel.service.txn.HtlFeepaymentService;
import com.transport.dao.txn.FeePaymentDAO;
import com.transport.serviceimpl.txn.FeePaymentServiceImpl;

public class HtlFeepaymentServiceImpl implements HtlFeepaymentService {
	@Autowired
	private HtlFeepaymentDAO hstlFeePaymentDAO;
	private Logger logger = Logger.getLogger(HtlFeepaymentServiceImpl.class);

	/** Method for save or update HtlFeepaymentDM **/
	/**
	 * @param feepaymentObj
	 *            of HtlFeepaymentDM
	 */
	@Transactional
	public void saveorUpdatefeepayment(HtlFeepaymentDM feepaymentObj) {
		// TODO Auto-generated method stub
		hstlFeePaymentDAO.saveorUpdatefeepayment(feepaymentObj);
	}

	/** Get getFeePaymentList based on feepymtid **/
	/**
	 * @param Long
	 *            feepymtid,Long feecolid,Long companyid,String status);
	 * 
	 * @return list of HtlFeepaymentDM
	 */
	@Transactional
	public List<HtlFeepaymentDM> getFeePaymentList(Long feepymtid,
			Long feecolid, Long companyid, String status, Long studentid) {
		// TODO Auto-generated method stub
		return hstlFeePaymentDAO.getFeePaymentList(feepymtid, feecolid,
				companyid, status, studentid);
	}

}
