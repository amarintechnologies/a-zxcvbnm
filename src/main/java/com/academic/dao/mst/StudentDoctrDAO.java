package com.academic.dao.mst;

import java.util.List;

import com.academic.domain.mst.StudentDoctrDM;

public interface StudentDoctrDAO {

	/**
	 *     * Used to save or update the StudentDoctrDM data into the database.
	 *       @param objStudentDoctr         
	 */

	public void saveOrUpdateStudentEduHistory(StudentDoctrDM objStudentDoctr);

	/**
	 *  Used to Retrieve data from StudentDoctrDM table based on given
	 * parameters.        
	 * 
	 * @param  Long studntDoctorid, Long studentId, String doctorName, String
	 *         status   @return List<StudentDoctrDM>         
	 */
	public List<StudentDoctrDM> getStudentEduHistoryList(Long studntDoctorid,
			Long studentId, String doctorName, String status);
}
