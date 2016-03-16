package com.base.daoimpl.mst;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.dao.mst.StudentDAO;
import com.base.domain.mst.StudentDM;
import com.erputil.util.DateUtils;

//import com.sweethome.daoImpl.CityDAOImpl;
@Repository
public class StudentDAOImpl implements StudentDAO {

	/**
	 * @Autowired refers that integrating the spring concepts that is using for
	 *            linking with specified class
	 **/
	/** SessionFactory refers that maintains the session until it gets expired **/
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(StudentDAOImpl.class);

	/**
	 * Method for save or update StudentDM
	 * 
	 * @param studObj
	 *            of studObj
	 */
	public void updateStudentDetails(StudentDM studObj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(studObj);
	}

	public List<StudentDM> getStudentList(Long studentId, Long companyId,
			Long applicantId, Date admissionDate, String studentNo,
			String admissionNo, Long batchId, Long studCid, Long cityId,
			Long stateId, Long countryId, String accessId, String status,
			Long courseid) {
		// TODO Auto-generated method stub
		logger.info("Inside  getStudentList >  " + "studentId " + studentId
				+ "companyId " + companyId + "studentNo" + studentNo);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append("st.studentId as studentId,st.courseid as courseid,st.companyId as companyId,st.applicantId as applicantId,st.studentNo as studentNo,st.middleName as middleName,st.lastName as lastName,st.admissionNo as admissionNo,st.admissionDate as admissionDate,st.batchId as batchId,st.dateOfBirth as dateOfBirth,st.bloodGroup as bloodGroup,st.nationality as nationality,st.priLang as priLang,st.gender as gender,st.religion as religion,st.address as address,st.studCid as studCid,st.cityId as cityId,st.firstName as firstName,");
		sql.append("st.postCode as postCode,st.courseid as courseid,st.phone as phone,b.batch_name as batch_name,c.course_name as course_name, st.applicantDate as applicantDate,st.updatedDt as updatedDt,st.updatedBy as updatedBy,st.emailId as emailId,st.emialOpt as emialOpt,st.studPhoto as studPhoto,st.mobile as mobile,st.birthPlace as birthPlace,st.stateId as stateId,st.countryId as countryId,st.accessId as accessId,st.status as status,st.studPhoto as studPhoto,a.appltnNo as appltnNo");
		sql.append(" from StudentDM st,ApplicantDM a,AcdbatchDM b,AcdCourseDM c where 1=1 and b.batch_id=st.batchId and c.course_id=st.courseid and a.applicantId=st.applicantId");
		Query query = null;
		if (studentId != null) {
			sql.append(" and st.studentId =" + studentId);
		}
		if (companyId != null) {
			sql.append(" and st.companyId =" + companyId);
		}
		if (applicantId != null) {
			sql.append(" and st.applicantId =" + applicantId);
		}
		if (studentNo != null && studentNo.trim().length() > 0) {
			sql.append(" and lower(st.studentNo)like lower('" + studentNo
					+ "%')");
		}
		if (admissionNo != null && admissionNo.trim().length() > 0) {
			sql.append(" and lower(st.admissionNo)like lower('" + admissionNo
					+ "%')");
		}
		if (batchId != null) {
			sql.append(" and st.batchId =" + batchId);
		}

//		if (admissionDate != null) {
//			// sql.append(DateUtils.datetostring(admissionDate));
//
//			sql.append(" and st.admissionDate =" + admissionDate);
//		}

		if (courseid != null) {
			sql.append(" and st.courseid =" + courseid);
		}
		if (studCid != null) {
			sql.append(" and st.studCid =" + studCid);
		}
		if (countryId != null) {
			sql.append(" and st.countryId =" + countryId);
		}
		if (accessId != null && accessId.trim().length() > 0) {
			sql.append(" and lower(st.accessId)like lower('" + accessId + "%')");
		}

		if (status != null && status.trim().length() > 0) {
			sql.append(" and lower(st.status)like lower('" + status + "%')");
		}
		// sql.append("order by st.updatedDt desc");
		logger.info("Inside getCityList > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(StudentDM.class));
		return query.list();
	}

}
