package com.academic.dao.mst;

import java.util.List;

import com.academic.domain.mst.AcdCourseDM;

public interface AcdCourseDAO {
	/**
	 *     * Used to save or update the AcdCourse data into the database.    
	 *  * @param objAcdCourse         
	 */
	public void saveOrUpdateAcdCourse(AcdCourseDM objAcdCourse);

	/**
	 *  * used to Retrieve data from AcdCourseDM table based on given
	 * 
	 * Long course_id, Long company_id, String course_name, String grading_type,
	 * String course_status     
	 * 
	 * @return List<AcdCourseDM>         
	 */

	public List<AcdCourseDM> getAcdCourseList(Long course_id, Long company_id,String course_code,
			String course_name, String grading_type, String section_name,
			String course_status);

}
