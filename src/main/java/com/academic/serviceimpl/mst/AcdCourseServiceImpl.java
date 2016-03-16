package com.academic.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.mst.AcdCourseDAO;
import com.academic.domain.mst.AcdCourseDM;
import com.academic.service.mst.AcdCourseService;

public class AcdCourseServiceImpl implements AcdCourseService {

	@Autowired
	private AcdCourseDAO acdCourseDAO;
	private Logger logger = Logger.getLogger(AcdCourseServiceImpl.class);

	/**
	 *     * Used to save or update the AcdCourse data into the database.    
	 *  * @param objAcdCourse         
	 */
	@Transactional
	public void saveOrUpdateAcdCourse(AcdCourseDM objAcdCourse) {
		// TODO Auto-generated method stub
		acdCourseDAO.saveOrUpdateAcdCourse(objAcdCourse);

	}

	/**
	 *  * used to Retrieve data from AcdCourseDM table based on given
	 * 
	 * Long course_id, Long company_id, String course_name, String grading_type,
	 * String course_status     
	 * 
	 * @return List<AcdCourseDM>         
	 */
	@Transactional
	public List<AcdCourseDM> getAcdCourseList(Long course_id, Long company_id,
			String course_name,String course_code, String grading_type, String section_name,
			String course_status) {
		// TODO Auto-generated method stub
		return acdCourseDAO.getAcdCourseList(course_id, company_id,
				course_name,course_code, grading_type, section_name, course_status);
	}

}
