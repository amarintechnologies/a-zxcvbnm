package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.StudentContactsDAO;
import com.base.domain.mst.StudentContactsDM;

@Repository
public class StudentContactsDAOImpl implements StudentContactsDAO {

	/**
	 * @Autowired refers that integrating the spring concepts that is using for
	 *            linking with specified class
	 **/
	/** SessionFactory refers that maintains the session until it gets expired **/
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(StudentContactsDAOImpl.class);

	/**
	 * Method for save or update StudentContactsDM
	 * 
	 * @param studConObj
	 *            of studConObj
	 */
	public void updateStudentContactsDetails(StudentContactsDM studConObj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(studConObj);
	}

	public List<StudentContactsDM> getStudentContactList(Long studContactId,
			Long studId, Long cityId, Long stateId, Long countryId,
			String status) {
		// TODO Auto-generated method stub
		// logger.info("Inside  getStudentList >  " + "studentId " + studentId +
		// "companyId " +companyId+ "student_no" + student_no);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" st.studContactId as studContactId,st.contactType as contactType,st.firstName as firstName,st.studId as studId,st.cityId as cityId,");
		sql.append(" st.stateId as stateId,st.updatedBy as updatedBy,st.updatedDt as updatedDt,st.mobileNo as mobileNo,st.status as status,");
		sql.append(" st.email as email,st.officeNo1 as officeNo1,st.officeNo2 as officeNo2,st.cityId as cityId,st.officeAdd as officeAdd,");
		sql.append(" st.occupation as occupation,st.income as income,st.lastName as lastName,st.education as education,st.relation as relation,");
		sql.append(" st.dateOfBirth as dateOfBirth,st.countryId as countryId,s.studentNo as studentNo");
		sql.append(" from StudentContactsDM st,StudentDM s where st.studId=s.studentId");
		Query query = null;
		if (studContactId != null) {
			sql.append(" and st.studContactId =" + studContactId);
		}
		if (studId != null) {
			sql.append(" and st.studId =" + studId);
		}
		if (cityId != null) {
			sql.append(" and st.cityId =" + cityId);
		}

		if (stateId != null) {
			sql.append(" and st.stateId =" + stateId);
		}

		if (status != null) {
			sql.append(" and st.status = '" + status + "'");
		}
		if (countryId != null) {
			sql.append(" and st.countryId =" + countryId);
		}
		sql.append(" order by st.updatedDt desc");

		logger.info("Inside getCityList > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(StudentContactsDM.class));
		return query.list();
	}
}
