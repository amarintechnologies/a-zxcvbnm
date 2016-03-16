package com.academic.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.mst.StudentEduHistoryDAO;
import com.academic.domain.mst.StudentEduHistoryDM;
import com.academic.service.mst.StudentEduHistoryService;

public class StudentEduHistoryServiceImpl implements StudentEduHistoryService {

	@Autowired
	private StudentEduHistoryDAO studentEduHistoryDAO;
	private Logger logger = Logger.getLogger(StudentEduHistoryServiceImpl.class);

	/**
	 *     * Used to save or update the StudentEduHistoryDM data into the
	 * database.      * @param objStudEduHtry         
	 */
	@Transactional
	public void saveOrUpdateStudentEduHistory(StudentEduHistoryDM objStudEduHtry) {
		studentEduHistoryDAO.saveOrUpdateStudentEduHistory(objStudEduHtry);
	}

	/**
	 *  Used to Retrieve data from StudentEduHistoryDM table based on given
	 * parameters.        
	 * 
	 * @param  Long studntHistId, Long studentId, String institutName, String
	 *         courseName, String passYear, String grade, String status       
	 *           @return List<StudentEduHistoryDM>         
	 */
	@Transactional
	public List<StudentEduHistoryDM> getStudentEduHistoryList(
			Long studntHistId, Long studentId, String institutName,
			String courseName, String passYear, String grade, String status) {
		return studentEduHistoryDAO.getStudentEduHistoryList(studntHistId,
				studentId, institutName, courseName, passYear, grade, status);
	}
}
