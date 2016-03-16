package com.academic.service.txn;

import java.util.List;

import com.academic.domain.txn.ClasstimingDM;

public interface ClasstimingService {
	/** Method for save or update ClasstimingDM **/
	/**
	 * @param classtimingObj
	 *            of ClasstimingDM
	 */
	public void saveorUpdatemacdbatchDetails(ClasstimingDM classtimingObj);
	
	/** Get getclasstiminglist  based on batch_id **/
	/**
	 * To  getclasstiminglist based on classtimeid and batchGrpid
	 * 
	 * @param Long classtimeid,Long batchid,String status
	 * 
	 * @return list of ClasstimingDM
	 */
	public List<ClasstimingDM> getclasstiminglist(Long courseid,Long classtimeid,Long batchid,String timingname,String status,Long companyid);
}




