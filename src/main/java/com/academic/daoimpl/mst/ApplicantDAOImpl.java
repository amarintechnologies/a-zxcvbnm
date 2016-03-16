package com.academic.daoimpl.mst;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Transient;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.mst.ApplicantDAO;
import com.academic.domain.mst.AcdCourseDM;
import com.academic.domain.mst.ApplicantDM;
import com.erputil.util.DateUtils;

@Repository
public class ApplicantDAOImpl implements ApplicantDAO {

	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(ApplicantDAOImpl.class);

	/**
	 *     * Used to save or update the ApplicantDM data into the database.    
	 *  * @param objApplicant         
	 */
	public void saveOrUpdateApplicant(ApplicantDM objApplicant) {
		logger.info("Inside  saveOrUpdateApplicant >>>>>>>>>>>  ");

		sessionfactory.getCurrentSession().saveOrUpdate(objApplicant);
	}

	/**
	 *  * used to Retrieve data from ApplicantDM table based on given
	 * parameters.
	 * 
	 * @param Long
	 *            applicantId, Long companyId, Date applicantDate, String
	 *            first_name, String lastName, Long batch_id, Date dob, String
	 *            nationality,Long countryId, String status     
	 * 
	 *                @return List<ApplicantDM>         
	 */

	public List<ApplicantDM> getAcdApplicantList(Long applicantId,
			Long companyId, Date applicantDate, String first_name,
			String lastName, Long batchId, Date dob, String nationality,
			Long countryId, String status, String appltnNo, Long courseId,
			Date applTodt) {
		logger.info("Inside  getAcdApplicantList >  " + "applicantId "
				+ applicantId);

		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" g.applicantId as applicantId,g.companyId as companyId,g.applicantDate as applicantDate,");
		sql.append(" g.first_name as first_name,g.middleName as middleName,g.lastName as lastName, g.batchId as batchId,"
				+ "  g.dob as dob,g.bloodGroup as bloodGroup, ");
		sql.append(" g.nationality as nationality,g.priLanguage as priLanguage,g.gender as gender,g.religion as religion ,");
		sql.append(" g.address as address,g.cityId as cityId,g.stateId as stateId,g.countryId as countryId ,");
		sql.append(" g.countryId as countryId,g.postCode as postCode,g.birthPlace as birthPlace,g.phone as phone, ");
		sql.append(" g.mobile as mobile,g.emailid as emailid,g.studentPhoto as studentPhoto,g.permitNo as permitNo,g.status as status ,");
		sql.append(" g.lastUpdatedDt as lastUpdatedDt,g.lastUpdatedBy as lastUpdatedBy,g.courseId as courseId,");
		sql.append(" cu.countryName as countryName,bt.batch_name as batchName, g.appltnNo as appltnNo , cr.course_name as courseName");
		sql.append(" from ApplicantDM g ,  CountryDM cu, AcdbatchDM bt , AcdCourseDM cr where 1=1 ");
		sql.append(" and cu.countryID =g.countryId and g.batchId =bt.batch_id "
				+ " and cr.course_id = g.courseId");

		Query query = null;
		if (applicantId != null) {
			sql.append(" and g.applicantId =" + applicantId);
		}
		if (companyId != null) {
			sql.append(" and g.companyId =" + companyId);
		}
		if (batchId != null) {
			sql.append(" and g.batchId =" + batchId);
		}
		if (courseId != null) {
			sql.append(" and g.courseId =" + courseId);
		}
		if (applicantDate != null) {

			sql.append(" and g.applicantDate between '"
					+ DateUtils.datetostringsimp(applicantDate) + "' and '"
					+ DateUtils.datetostringsimp(applTodt) + "'");
		}

		if (countryId != null) {
			sql.append(" and g.countryId=" + countryId);
		}

		if (nationality != null) {
			sql.append("and g.nationality= '" + nationality + "'");
		}
		if (lastName != null && lastName.trim().length() > 0) {
			sql.append(" and lower(g.lastName)like lower('" + lastName + "%')");
		}
		if (first_name != null && first_name.trim().length() > 0) {
			sql.append(" and lower(g.first_name)like lower('" + first_name
					+ "%')");
		}
		if (appltnNo != null && appltnNo.trim().length() > 0) {
			sql.append(" and lower(g.appltnNo)like lower('" + appltnNo + "%')");
		}

		if (status != null) {
			sql.append(" and g.status= '" + status + "'");
		}
		sql.append(" order by g.lastUpdatedDt desc");
		logger.info("Inside getAcdApplicantList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(ApplicantDM.class));
		return query.list();

	}

	public void updatestatus(Long applicantId, String status) {
		String query = "update ApplicantDM u set  u.status='" + status
				+ "' where u.applicantId=" + applicantId;
		sessionfactory.getCurrentSession().createQuery(query).executeUpdate();
	}
}
