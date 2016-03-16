package com.base.service.mst;

import java.util.List;

import com.base.domain.mst.StudentContactsDM;

public interface StudentContactsService {
	/** Method for save or update Student DM **/
	/**
	 * @param studCatObj of Student DM
	 */
	public void updateStudentContactsDetails(StudentContactsDM studConObj);
	/** Get getStudent List based on studContactId**/
	/**
	 * To get getStudent List based on studContactId and  Name
	 * 
	 * @param Long studContactId,Long studId,Long cityId,Long stateId,Long countryId

	 * 
	 * @return list of StudentContactsDM
	 */
	public List<StudentContactsDM> getStudentContactList(Long studContactId,Long studId,Long cityId,Long stateId,Long countryId,String status);


}
