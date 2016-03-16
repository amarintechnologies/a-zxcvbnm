package com.academic.daoimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.AcdbatchDAO;
import com.academic.domain.txn.AcdbatchDM;

@Repository
public class AcdbatchDAOImpl implements AcdbatchDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(AcdbatchDAOImpl.class);

	/** Method for save or update m_acd_batchDM **/
	/**
	 * @param macdbatchObj
	 *            of m_acd_batchDM
	 */
	public void saveorUpdatemacdbatchDetails(AcdbatchDM macdbatchObj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(macdbatchObj);
	}

	/** Get macdbatch List based on batch_id **/
	/**
	 * To get macdbatch list based on batch_id and batch_name
	 * 
	 * @param Long
	 *            batch_id,Long course_id,String batch_name,String batch_status
	 * 
	 * 
	 * @return list of m_acd_batchDM
	 */
	public List<AcdbatchDM> getmacdbatchList(Long batch_id, Long course_id,
			String batch_name, String batch_status, String batchYear,
			Long companyid) {
		// TODO Auto-generated method stub
		logger.info("Inside  getmacdbatchList >  " + "batch_id " + batch_id
				+ "course_id " + course_id + " batch_name" + batch_name
				+ "batch_status" + batch_status);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" m.batch_id as batch_id,m.company_id as company_id,m.course_id as course_id,m.grading_id as grading_id,"
				+ "m.batch_name as batch_name,m.start_date as start_date,m.end_date as end_date,m.batch_year as batch_year,");
		sql.append(" m.prevsubjt_yn as prevsubjt_yn,m.prevfee_yn as prevfee_yn,m.batch_status as batch_status,"
				+ "m.last_updated_dt as last_updated_dt,m.last_updated_by as last_updated_by,c.course_name as course_name");
		sql.append(" from AcdbatchDM m,AcdCourseDM c where 1=1");
		sql.append(" and m.course_id = c.course_id ");
		Query query = null;
		if (batch_id != null) {
			sql.append(" and m.batch_id =" + batch_id);
		}
		if (course_id != null) {
			sql.append(" and m.course_id =" + course_id);
		}
		if (batchYear != null && batchYear.trim().length() > 0) {
			sql.append(" and m.batch_year = '" + batchYear + "'");
		}

		if (companyid != null) {
			sql.append(" and m.company_id =" + companyid);
		}
		if (batch_name != null && batch_name.trim().length() > 0) {
			sql.append(" and lower(m.batch_name)like lower('" + batch_name
					+ "%')");
		}
		if (batch_status != null) {
			sql.append(" and m.batch_status ='" + batch_status + "'");
		}
		sql.append(" order by m.last_updated_dt desc");
		logger.info("Inside getmacdbatchList > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(AcdbatchDM.class));
		return query.list();
	}
}
