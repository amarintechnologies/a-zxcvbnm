package com.base.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.mst.StudentContactsDAO;
import com.base.domain.mst.StudentContactsDM;
import com.base.service.mst.StudentContactsService;

public class StudentContactsServiceImpl implements StudentContactsService{

	@Autowired
	private StudentContactsDAO studentContactsdao;
	private Logger logger = Logger.getLogger(StudentContactsServiceImpl.class);
	
	/**
	 * To save and update StudentContactsDM details.
	 * 
	 * @param StudentContactsDM
	 *            studConObj
	 */
	@Transactional
	//(value = "StudentContact", allEntries = true)
	public void updateStudentContactsDetails(StudentContactsDM studConObj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveAndUpdateCitydetails > " + "About to save the data ... ");
		studentContactsdao.updateStudentContactsDetails(studConObj);
	}
	/**
	 * To get details from StudentDM table depends on condition if all arguments
	 * are null it returns full list
	 * 
	 * @param Long studentId, Long companyId,
			Long applicantId, String student_no
	 * 
	 * @return StudentDM list
	 * 
	 */
	@Transactional
	//@Cacheable(value = "StudentContacts")

	public List<StudentContactsDM> getStudentContactList(Long studContactId,
			Long studId, Long cityId, Long stateId, Long countryId,String status) {
		// TODO Auto-generated method stub
		return studentContactsdao.getStudentContactList(studContactId, studId, cityId, stateId, countryId,status);
	}

}
