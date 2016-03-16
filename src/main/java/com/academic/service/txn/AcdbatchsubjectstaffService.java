package com.academic.service.txn;

import java.util.List;

import com.academic.domain.txn.AcdbatchsubjectstaffDM;

public interface AcdbatchsubjectstaffService {
	/** Method for save or update acdbatchsubjectstaffDM **/
	/**
	 * @param acdbatchstaffObj
	 *            of acdbatchsubjectstaffDM
	 */
	public void saveorUpdatemacdbatchDetails(
			AcdbatchsubjectstaffDM acdbatchstaffObj);

	/** Get getacdbatchsubjectstaffList based on batchsubjectid **/
	/**
	 * To get getacdbatchsubjectstaffList based on batchsubjectid and
	 * batchsubject name
	 * 
	 * @param Long
	 *            batchsubjectid,Long batchid,Long subjectid,String status);
	 * 
	 * @return list of acdbatchsubjectstaffDM
	 */
	public List<AcdbatchsubjectstaffDM> getacdbatchsubjectstaffList(
			Long batchsubjectid, Long batchid, Long subjectid, String status,
			Long deptId, Long empId);
}
