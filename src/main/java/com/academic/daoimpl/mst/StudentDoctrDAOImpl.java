package com.academic.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.mst.StudentDoctrDAO;
import com.academic.domain.mst.StudentDoctrDM;

@Repository
public class StudentDoctrDAOImpl implements StudentDoctrDAO {

	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(StudentDoctrDAOImpl.class);

	/**
	 *     * Used to save or update the StudentDoctrDM data into the database.
	 *       @param objStudentDoctr         
	 */

	public void saveOrUpdateStudentEduHistory(StudentDoctrDM objStudentDoctr) {
		sessionfactory.getCurrentSession().saveOrUpdate(objStudentDoctr);
	}

	/**
	 *  Used to Retrieve data from StudentDoctrDM table based on given
	 * parameters.        
	 * 
	 * @param  Long studntDoctorid, Long studentId, String doctorName, String
	 *         status   @return List<StudentDoctrDM>         
	 */
	public List<StudentDoctrDM> getStudentEduHistoryList(Long studntDoctorid,
			Long studentId, String doctorName, String status) {
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" c.studntDoctorid as studntDoctorid,c.studentId as studentId,c.doctorName as doctorName,"
				+ " c.doctorAddress as doctorAddress,c.doctorPhone1 as doctorPhone1,c.doctorPhone2 as"
				+ " doctorPhone2, c.doctorMobile as doctorMobile, c.illness_desc as illness_desc,c.remarks as remarks,c.status as status, c.lastUpdatedDt as lastUpdatedDt, "
				+ " c.lastUpdatedBy as lastUpdatedBy");

		sql.append(" from StudentDoctrDM c ,StudentDM st   where 1=1  ");
		sql.append(" and c.studentId = st.studentId ");

		Query query = null;

		if (studntDoctorid != null) {
			sql.append(" and c.studntDoctorid=" + studntDoctorid);
		}
		if (studentId != null) {
			sql.append(" and c.studentId=" + studentId);
		}

		if (doctorName != null) {
			sql.append(" and c.doctorName = '" + doctorName + "'");
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
						Transformers.aliasToBean(StudentDoctrDM.class));
		return query.list();

	}
}
