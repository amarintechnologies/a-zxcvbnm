package com.academic.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.mst.StudentDoctrDAO;
import com.academic.domain.mst.StudentDoctrDM;
import com.academic.service.mst.StudentDoctrService;

public class StudentDoctrServiceImpl implements StudentDoctrService {

	@Autowired
	private StudentDoctrDAO studentDoctrDAO;
	private Logger logger = Logger.getLogger(StudentDoctrServiceImpl.class);

	/**
	 *     * Used to save or update the StudentDoctrDM data into the database.
	 *       @param objStudentDoctr         
	 */
@Transactional
	public void saveOrUpdateStudentEduHistory(StudentDoctrDM objStudentDoctr) {
		studentDoctrDAO.saveOrUpdateStudentEduHistory(objStudentDoctr);
	}

	/**
	 *  Used to Retrieve data from StudentDoctrDM table based on given
	 * parameters.        
	 * 
	 * @param  Long studntDoctorid, Long studentId, String doctorName, String
	 *         status   @return List<StudentDoctrDM>         
	 */
	@Transactional
	public List<StudentDoctrDM> getStudentEduHistoryList(Long studntDoctorid,
			Long studentId, String doctorName, String status) {
		return studentDoctrDAO.getStudentEduHistoryList(studntDoctorid,
				studentId, doctorName, status);
	}

}
