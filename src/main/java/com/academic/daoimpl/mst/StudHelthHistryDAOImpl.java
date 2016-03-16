package com.academic.daoimpl.mst;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.mst.StudHelthHistryDAO;
import com.academic.domain.mst.StudHelthHistryDM;

@Repository
public class StudHelthHistryDAOImpl implements StudHelthHistryDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(StudHelthHistryDAOImpl.class);

	/**
	 *    Used to save or update the StudHelthHistryDM data into the database.
	 *       * @param objStudHltHtry         
	 */

	public void saveOrUpdateStudHelthHistry(StudHelthHistryDM objStudHltHtry) {
		sessionfactory.getCurrentSession().saveOrUpdate(objStudHltHtry);
	}

	/**
	 *  Used to Retrieve data from StudHelthHistryDM table based on given
	 * parameters.        
	 * 
	 * @param Long healthHistid, Long studentId, Long deceaseId, Date
	 *             dateOfInfect, String status
	 * @return List<StudHelthHistryDM>         
	 */
	public List<StudHelthHistryDM> getStudHelthHistryyList(Long healthHistid,
			Long studentId, Long deceaseId, Date dateOfInfect, String status) {
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" c.healthHistid as healthHistid,c.studentId as studentId,c.deceaseId as deceaseId,"
				+ " c.deceasedYN as deceasedYN,c.dateOfInfect as dateOfInfect,c.ageOfInfect as ageOfInfect, c.medication as medication, c.remarks as remarks, c. status as status, c.lastUpdatedDt as lastUpdatedDt, "
				+ " c.lastUpdatedBy as lastUpdatedBy,d.deceasename as deceasename");

		sql.append(" from StudHelthHistryDM c,AcdDeceaseDM d    where 1=1 and d.deceaseid=c.deceaseId ");

		Query query = null;

		if (healthHistid != null) {
			sql.append(" and c.healthHistid=" + healthHistid);
		}
		if (studentId != null) {
			sql.append(" and c.studentId=" + studentId);
		}
		if (deceaseId != null) {
			sql.append(" and c.deceaseId=" + deceaseId);
		}
		if (dateOfInfect != null) {
			sql.append(" and c.dateOfInfect = '" + dateOfInfect + "'");
		}

		if (status != null) {
			sql.append(" and c.status = '" + status + "'");
		}

		sql.append(" order by c.lastUpdatedDt desc");
		logger.info("Inside getStudHelthHistryyList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(StudHelthHistryDM.class));
		return query.list();
	}
}
