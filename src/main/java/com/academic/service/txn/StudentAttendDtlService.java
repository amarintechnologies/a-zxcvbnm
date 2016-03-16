package com.academic.service.txn;

import java.util.List;

import com.academic.domain.txn.StudentAttendDtlDM;

public interface StudentAttendDtlService {
	/** Method for save or update StudentAttendDtlDM**/
	/**
	 * @param studObj
	 *            of StudentAttendDtlDM
	 */
	public void saveStudentDetails(StudentAttendDtlDM studObj);

	/** Get getStudent List based on StudentAttendDtl **/
	/**
	 * To get getStudent List based on studCid and Name
	 * 
	 * @param Long studentid,
			Long attendanceid, Long timetableDtlid, Long subjectid
	 * 
	 * 
	 * @return list of StudentAttendDtlDM
	 */
	public List<StudentAttendDtlDM> getStudentattdtlList(Long studentid,
			Long attendanceid, Long timetableDtlid, Long subjectid,String presentyn);
	public void updatestatus(Long attendancedtlid,String presentyn);

}
