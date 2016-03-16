package com.academic.dao.txn;

import java.util.List;

import com.academic.domain.txn.AcdbatchworkdaysDM;

public interface AcdbatchworkdayDAO {
	/** Method for save or update AcdbatchworkdaysDM **/
	/**
	 * @param acdbatchworkdayObj
	 *            of AcdbatchworkdaysDM
	 */
	public void saveorUpdateacdbatchworkdayDetails(AcdbatchworkdaysDM acdbatchworkdayObj);
	
	/** Get getacdbatchworkdayList based on workdayid **/
	/**
	 * To get getacdbatchworkdayList based on workdayid and batchname name
	 * 
	 * @param Long workdayid,Long batchid,String batchname,String status;
	 * 
	 * @return list of AcdbatchworkdaysDM
	 */
	public List<AcdbatchworkdaysDM> getacdbatchworkdayList(Long workdayid,Long batchid,String batchname,String status);
}




