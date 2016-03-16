package com.base.serviceimpl.mst;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.mst.StudentCategoryDAO;
import com.base.domain.mst.StudentCategoryDM;
import com.base.service.mst.StudentCategoryService;


public class StudentCategoryServiceImpl implements StudentCategoryService {


	@Autowired
	private StudentCategoryDAO studentCatDAO;
	private Logger logger = Logger.getLogger(StudentCategoryServiceImpl.class);
	/**
	 * To save StudentCategoryDM details
	 * 
	 * @param StudentCategoryDM
	 *            studentCatDAO
	 * 
	 */
	@Transactional
	public void updateStudentCategoryDetails(StudentCategoryDM studCatObj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveAndUpdate > " + "About to save the data ... ");
		studentCatDAO.updateStudentCategoryDetails(studCatObj);
	}
	/**
	 * To get details from StudentCategoryDM table depends on condition if all arguments
	 * are null it returns full list
	 * 
	 * @param Long studCid, String categoryName, String status
	 * 
	 * @return StudentCategoryDM list
	 * 
	 */
	@Transactional
	//@Cacheable(value = "Student")
	public List<StudentCategoryDM> getStudentCategoryList(Long studCid,
			String categoryName, Long companyId, String status) {
		// TODO Auto-generated method stub
		return studentCatDAO.getStudentCategoryList(studCid, categoryName, companyId, status);
	}

}
