package com.academic.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.mst.AcdCourseDAO;
import com.academic.daoimpl.txn.AcdbatchDAOImpl;
import com.academic.domain.mst.AcdCourseDM;

@Repository
public class AcdCourseDAOImpl implements AcdCourseDAO {

	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(AcdbatchDAOImpl.class);

	/**
	 * @param objAcdCourse
	 *            of AcdCourseDM
	 */
	public void saveOrUpdateAcdCourse(AcdCourseDM objAcdCourse) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().saveOrUpdate(objAcdCourse);

	}

	/**
	 *  * used to Retrieve data from AcdCourseDM table based on given
	 * 
	 * Long course_id, Long company_id, String course_name, String grading_type,
	 * String course_status     
	 * 
	 * @return List<AcdCourseDM>         
	 */
	public List<AcdCourseDM> getAcdCourseList(Long course_id, Long company_id,
			String course_code, String course_name, String grading_type,
			String section_name, String course_status) {

		logger.info("Inside  getmacdbatchList >  " + "course_id " + course_id
				+ "company_id " + company_id + " course_name" + course_name
				+ "grading_type" + grading_type + "course_status"
				+ course_status);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" c.course_id as course_id,c.company_id as company_id,c.course_name as course_name,c.section_name as section_name,c.course_code as course_code,");
		sql.append(" c.grading_type as grading_type,c.elective_yn as elective_yn,c.course_status as course_status,c.last_updated_dt as last_updated_dt,c.last_updated_by as last_updated_by");
		sql.append(" from AcdCourseDM c  where 1=1");
		Query query = null;
		if (course_id != null) {
			sql.append(" and c.course_id =" + course_id);
		}
		if (company_id != null) {
			sql.append(" and c.company_id =" + company_id);
		}
		if (course_name != null && course_name.trim().length() > 0) {
			sql.append(" and lower(c.course_name)like lower('" + course_name
					+ "%')");
		}
		if (course_status != null && course_status.trim().length() > 0) {
			sql.append(" and lower(c.course_status)like lower('"
					+ course_status + "%')");
		}
		if (grading_type != null && grading_type.trim().length() > 0) {
			sql.append(" and lower(c.grading_type)like lower('"
					+ grading_type + "%')");
		}
		if (course_code != null && course_code.trim().length() > 0) {
			sql.append(" and lower(c.course_code)like lower('" + course_code
					+ "%')");
		}
		sql.append(" order by c.last_updated_dt desc");
		logger.info("Inside getAcdCourseList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(AcdCourseDM.class));
		return query.list();
	}

}
