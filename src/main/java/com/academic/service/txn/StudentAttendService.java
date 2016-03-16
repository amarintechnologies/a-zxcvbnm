package com.academic.service.txn;

import java.util.Date;
import java.util.List;

import com.academic.domain.txn.StudentAttendenceDM;

public interface StudentAttendService {
	/**
	 * Method for return BatchSubDM list based on user's parameters
	 * 
	 * @param brandName
	 *            ,status,filterType
	 * @return BatchSubDM List
	 */
	public List<StudentAttendenceDM> getStudentAttendenceList(Long companyid,Long timetableid,Long batchid,Long courseid,Long attendanceid,Date workdate);
	/**
	 * Method for save and update AssetBrandDM data
	 * 
	 * @param obj
	 */
	public void saveOrUpdate(StudentAttendenceDM obj);
	public void updatetime(Long attendanceid, Long timetableid);


}
