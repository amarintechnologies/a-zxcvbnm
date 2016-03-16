package com.academic.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.academic.dao.mst.GradingDAO;
import com.academic.domain.mst.GradingDM;

@Repository
public class GradingDAOImpl implements GradingDAO {

	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(GradingDAOImpl.class);

	/**
	 * Used to save or update the Grading data into the database.      
	 * 
	 * @param GradingDM
	 *            gradeobj         
	 */
	public void saveOrUpdateGrading(GradingDM gradeobj) {
		sessionfactory.getCurrentSession().saveOrUpdate(gradeobj);

	}

	/**
	 * used to Retrieve data from m_acd_grading table based on given parameters.
	 *   
	 * 
	 * @param Long gradingId,Long companyId,String gradeName,String status      
	 * @return GradingDM List         
	 */
	public List<GradingDM> getGradingList(Long gradingId, Long companyId,
			String gradeName, String status) {
		logger.info("Inside  getGradingList >  " + "gradingId " + gradingId
				+ "companyId " + companyId + " gradeName" + gradeName
				+ "status" + status);

		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" g.gradingId as gradingId,g.companyId as companyId,g.gradeName as gradeName,");
		sql.append(" g.remarks as remarks,g.status as status,g.lastupdateddt as lastupdateddt,g.lastupdatedby as lastupdatedby ");
		sql.append(" from GradingDM g where 1=1");
		Query query = null;
		if (gradingId != null) {
			sql.append(" and g.gradingId =" + gradingId);
		}
		if (companyId != null) {
			sql.append(" and g.companyId =" + companyId);
		}
		if (gradeName != null && gradeName.trim().length() > 0) {
			sql.append(" and lower(g.gradeName)like lower('" + gradeName
					+ "%')");
		}
		if (status != null && status.trim().length() > 0) {
			sql.append(" and lower(g.status)like lower('" + status + "%')");
		}
		sql.append(" order by g.lastupdateddt desc");
		logger.info("Inside getGradingList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(GradingDM.class));
		return query.list();
	}

}
