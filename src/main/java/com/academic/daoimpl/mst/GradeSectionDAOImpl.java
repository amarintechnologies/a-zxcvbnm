package com.academic.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.academic.dao.mst.GradeSectionDAO;
import com.academic.domain.mst.GradeSectionDM;

@Repository
public class GradeSectionDAOImpl implements GradeSectionDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(GradeSectionDAOImpl.class);

	/**
	 * Used to save or update the GradeSection data into the database.      
	 * 
	 * @param GradeSectionDM
	 *            gradeSecobj         
	 */
	public void saveOrUpdateGradingSection(GradeSectionDM gradeSecobj) {
		sessionfactory.getCurrentSession().saveOrUpdate(gradeSecobj);

	}

	/**
	 * used to Retrieve data from m_acd_grade_section table based on given
	 * parameters.   
	 * 
	 * @param Long gradeSectnId, Long companyId, String gradeSecName, String
	 *             status
	 * @return GradeSectionDM List         
	 */
	public List<GradeSectionDM> getGradeSectionList(Long gradeSectnId,
			Long companyId, String gradeSecName, String status) {
		logger.info("Inside  getGradeSectionList >  " + "gradeSectnId "
				+ gradeSectnId + "companyId " + companyId + " gradeSecName"
				+ gradeSecName + "status" + status);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" g.gradeSectnId as gradeSectnId,g.companyId as companyId,g.gradeSecName as gradeSecName,g.NoOfSeats as NoOfSeats,");
		sql.append(" g.status as status,g.lastupdateddt as lastupdateddt,g.lastupdatedby as lastupdatedby,g.courseId as courseId,");
		sql.append(" c.course_name as course_name");
		sql.append(" from GradeSectionDM g,AcdCourseDM c where 1=1");
		sql.append(" and c.course_id = g.courseId");
		Query query = null;
		if (gradeSectnId != null) {
			sql.append(" and g.gradeSectnId =" + gradeSectnId);
		}
		if (companyId != null) {
			sql.append(" and g.companyId =" + companyId);
		}
		if (gradeSecName != null && gradeSecName.trim().length() > 0) {
			sql.append(" and lower(g.gradeSecName)like lower('" + gradeSecName
					+ "%')");
		}
		if (status != null && status.trim().length() > 0) {
			sql.append(" and lower(g.status)like lower('" + status + "%')");
		}
		sql.append(" order by g.lastupdateddt desc");
		logger.info("Inside getGradeSectionList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(GradeSectionDM.class));
		return query.list();
	}

}
