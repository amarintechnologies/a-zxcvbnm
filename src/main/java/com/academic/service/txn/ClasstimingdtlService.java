package com.academic.service.txn;

import java.util.Date;
import java.util.List;

import com.academic.domain.txn.ClasstimingdtlDM;

public interface ClasstimingdtlService {
	/** Method for save or update ClasstimingdtlDM **/
	/**
	 * @param classdtlObj
	 *            of ClasstimingdtlDM
	 */
	public void saveorUpdatemacdbatchDetails(ClasstimingdtlDM classdtlObj);
	
	/** Getgetclasstimingdtllist based on batch_id **/
	/**
	 * To get getclasstimingdtllistbased on classtimedtlid and classtimeid
	 * 
	 * @param Long classtimedtlid,Long classtimeid,String refname
	 * 
	 * 
	 * @return list of ClasstimingdtlDM
	 */
	public List<ClasstimingdtlDM> getclasstimingdtllist(Long classtimedtlid,Long classtimeid,String refname,Date starttime,Date endtime);
}

