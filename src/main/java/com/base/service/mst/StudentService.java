package com.base.service.mst;

import java.util.Date;
import java.util.List;

import com.base.domain.mst.StudentDM;

public interface StudentService {
	/** Method for save or update Student DM **/
	/**
	 * @param studCatObj of Student DM
	 */
public void updateStudentDetails(StudentDM studObj);
/** Get getStudent List based on studCid**/
/**
 * To get getStudent List based on studCid and  Name
 * 
 * @param Long studCid,String  Name,Long companyId,String status,Date updatedDt,String updatedBy

 * 
 * @return list of Student DM
 */
public List<StudentDM> getStudentList(Long studentId,Long companyId,Long applicantId,Date admissionDate,String studentNo,String admissionNo,Long batchId,Long studCid,Long cityId,Long stateId,Long countryId,String accessId,String status,Long courseid);

}
