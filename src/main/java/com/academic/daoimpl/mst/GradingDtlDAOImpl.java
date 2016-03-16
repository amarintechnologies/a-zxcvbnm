package com.academic.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.mst.GradingDtlDAO;
import com.academic.domain.mst.GradingDtlDM;
import com.erputil.util.DateUtils;

@Repository
public class GradingDtlDAOImpl implements GradingDtlDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(GradingDtlDAOImpl.class);

	/**
	 * Used to save or update the Grading data into the database.      
	 * 
	 * @param GradingDtlDM
	 *            gradedtlobj         
	 */
	public void saveOrUpdateGradingDtl(GradingDtlDM gradedtlobj) {
		sessionfactory.getCurrentSession().saveOrUpdate(gradedtlobj);

	}

	/**
	 * used to Retrieve data from m_acd_grading_dtl table based on given
	 * parameters.   
	 * 
	 * @param Long gradingDtlId, Long gradingId, String gradeCode, Long
	 *             gradeStart, Long gradeEnd, String status
	 * @return GradingDtlDM List         
	 */
	public List<GradingDtlDM> getGradingDtlList(Long gradingDtlId,
			Long gradingId, String gradeCode, Long gradeStart, Long gradeEnd,
			String status) {
		logger.info("Inside  getGradingDtlList >  " + "gradingDtlId "
				+ gradingDtlId + "gradingId " + gradingId + " gradeCode"
				+ gradeCode + "gradeStart" + gradeStart + "gradeEnd" + gradeEnd
				+ "status" + status);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" g.gradingDtlId as gradingDtlId,g.gradingId as gradingId,g.gradeCode as gradeCode,g.gradeStart as gradeStart,");
		sql.append(" g.gradeEnd as gradeEnd,g.remarks as remarks,g.status as status,g.lastupdateddt as lastupdateddt,"
				+ " g.lastupdatedby as lastupdatedby");
		sql.append(" from GradingDtlDM g where 1=1 ");
		Query query = null;
		if (gradingDtlId != null) {
			sql.append(" and g.gradingDtlId =" + gradingDtlId);
		}
		if (gradingId != null) {
			sql.append(" and g.gradingId =" + gradingId);
		}
		if (gradeCode != null && gradeCode.trim().length() > 0) {
			sql.append(" and lower(g.gradeCode)like lower('" + gradeCode
					+ "%')");
		}
		if (gradeStart != null) {
			sql.append(" and "+gradeStart + " between g.gradeStart and  g.gradeEnd ");
		}

		// where 80 between grade_start and grade_end
		if (status != null && status.trim().length() > 0) {
			sql.append(" and lower(g.status)like lower('" + status + "%')");
		}
		sql.append(" order by g.lastupdateddt desc");
		logger.info("Inside getGradingDtlList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(GradingDtlDM.class));
		return query.list();
	}
}
