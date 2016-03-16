package com.academic.serviceimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.AcdbatchworkdayDAO;
import com.academic.domain.txn.AcdbatchworkdaysDM;
import com.academic.service.txn.AcdbatchworkdayService;

public class AcdbatchworkdayServiceImpl  implements AcdbatchworkdayService{
	@Autowired
	private AcdbatchworkdayDAO AcdbatchworkdayDAO;
	private Logger logger = Logger.getLogger(AcdbatchworkdayServiceImpl.class);
	/** Method for save or update AcdbatchworkdaysDM **/
	/**
	 * @param acdbatchworkdayObj
	 *            of AcdbatchworkdaysDM
	 */
	@Transactional
	public void saveorUpdateacdbatchworkdayDetails(
			AcdbatchworkdaysDM acdbatchworkdayObj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveAndUpdate > " + "About to save the data ... ");
		AcdbatchworkdayDAO.saveorUpdateacdbatchworkdayDetails(acdbatchworkdayObj);
		
		
	}
	/** Get getacdbatchworkdayList based on workdayid **/
	/**
	 * To get getacdbatchworkdayList based on workdayid and batchname name
	 * 
	 * @param Long workdayid,Long batchid,String batchname,String status;
	 * 
	 * @return list of AcdbatchworkdaysDM
	 */

	@Transactional
	public List<AcdbatchworkdaysDM> getacdbatchworkdayList(Long workdayid,
			Long batchid, String batchname, String status) {
		// TODO Auto-generated method stub
		return AcdbatchworkdayDAO.getacdbatchworkdayList(workdayid, batchid, batchname, status);
	}

}
