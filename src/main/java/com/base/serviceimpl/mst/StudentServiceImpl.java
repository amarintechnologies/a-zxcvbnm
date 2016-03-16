package com.base.serviceimpl.mst;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.mst.CityDAO;
import com.base.dao.mst.StudentDAO;
import com.base.domain.mst.StudentDM;
import com.base.service.mst.StudentService;

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentdao;
	private Logger logger = Logger.getLogger(StudentServiceImpl.class);
	
	/**
	 * To save and update StudentDM details.
	 * 
	 * @param StudentDM
	 *            studObj
	 */
	@Transactional
	public void updateStudentDetails(StudentDM studObj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveAndUpdateCitydetails > " + "About to save the data ... ");
		studentdao.updateStudentDetails(studObj);
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
	//@Cacheable(value = "Student")

	public List<StudentDM> getStudentList(Long studentId, Long companyId,
			Long applicantId,Date admissionDate, String studentNo, String admissionNo,
			Long batchId, Long studCid, Long cityId, Long stateId,
			Long countryId, String accessId,String status,Long courseid) {
		// TODO Auto-generated method stub
		return studentdao.getStudentList(studentId, companyId, applicantId,admissionDate, studentNo, admissionNo, batchId, studCid, cityId, stateId, countryId, accessId,status,courseid);
	}

}
