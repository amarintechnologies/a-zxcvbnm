package com.academic.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.mst.StudentEduHistoryDAO;
import com.academic.domain.mst.StudentEduHistoryDM;

@Repository
public class StudentEduHistoryDAOImpl implements StudentEduHistoryDAO {

	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(StudentEduHistoryDAOImpl.class);

	/**
	 *     * Used to save or update the StudentEduHistoryDM data into the
	 * database.      * @param objStudEduHtry         
	 */

	public void saveOrUpdateStudentEduHistory(StudentEduHistoryDM objStudEduHtry) {
		sessionfactory.getCurrentSession().saveOrUpdate(objStudEduHtry);
	}

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
			String courseName, String passYear, String grade, String status) {
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" c.studntHistId as studntHistId,c.studentId as studentId,c.institutName as institutName,"
				+ " c.courseName as courseName,c.passYear as passYear,c.grade as"
				+ " grade, c.totalScore as totalScore, c.status as status, c.lastUpdatedDt as lastUpdatedDt, "
				+ " c.lastUpdatedBy as lastUpdatedBy");

		sql.append(" from StudentEduHistoryDM c ,StudentDM st   where 1=1  ");
		sql.append(" and c.studentId = st.studentId ");

		Query query = null;

		if (studntHistId != null) {
			sql.append(" and c.studntHistId=" + studntHistId);
		}
		if (studentId != null) {
			sql.append(" and c.studentId=" + studentId);
		}

		if (institutName != null) {
			sql.append(" and c.institutName = '" + institutName + "'");
		}
		if (courseName != null) {
			sql.append(" and c.courseName = '" + courseName + "'");
		}
		if (passYear != null) {
			sql.append(" and c.passYear = '" + passYear + "'");
		}
		if (grade != null) {
			sql.append(" and c.grade = '" + grade + "'");
		}
		if (status != null) {
			sql.append(" and c.status = '" + status + "'");
		}

		sql.append(" order by c.lastUpdatedDt desc");
		logger.info("Inside getStudentEduHistoryList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(StudentEduHistoryDM.class));
		return query.list();

	}
}
