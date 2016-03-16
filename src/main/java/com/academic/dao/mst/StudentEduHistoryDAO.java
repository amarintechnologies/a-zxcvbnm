package com.academic.dao.mst;

import java.util.List;

import com.academic.domain.mst.StudentEduHistoryDM;

public interface StudentEduHistoryDAO {

	/**
	 *     * Used to save or update the StudentEduHistoryDM data into the
	 * database.      * @param objStudEduHtry         
	 */

	public void saveOrUpdateStudentEduHistory(StudentEduHistoryDM objStudEduHtry);

	/**
	 *  Used to Retrieve data from StudentEduHistoryDM table based on given
	 * parameters.        
	 * 
	 * @param  Long studntHistId, Long studentId, String institutName, String
	 *         courseName, String passYear, String grade, String status       
	 *           @return List<StudentEduHistoryDM>         
	 */
	public List<StudentEduHistoryDM> getStudentEduHistoryList(
			Long studntHistId, Long studentId, String institutName,
			String courseName, String passYear, String grade, String status);
}
