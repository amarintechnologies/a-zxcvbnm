package com.academic.daoimpl.txn;

import java.math.BigDecimal;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.BatchIntScrDAO;
import com.academic.domain.txn.BatchIntScrDM;

@Repository
public class BatchIntScrDAOImpl implements BatchIntScrDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(BatchIntScrDAOImpl.class);

	/**
	 * Used to save or update the BatchIntScrDM data into the database.      
	 * 
	 * @param BatchIntScrDM
	 *            of objBatchIntScrDM         
	 */
	public void saveOrUpdateBatchIntScr(BatchIntScrDM objBatchIntScrDM) {
		logger.info("Inside  saveOrUpdateBatchIntScr >  ");
		sessionFactory.getCurrentSession().saveOrUpdate(objBatchIntScrDM);

	}

	/**
	 * used to Retrieve data from BatchIntScrDM based on given parameters.   
	 * 
	 * @param Long intrnlscoreId, Long batchId, Long internaltypeId, Long
	 *             studentId, BigDecimal score, String status
	 */
	public List<BatchIntScrDM> getBatchIntScrList(Long intrnlscoreId,
			Long courseId, Long batchId, String course_name, String batch_name,
			String firstName, String internlName, Long studentId,
			BigDecimal score, String status) {
		logger.info("Inside  getBatchIntScrList >  " + "intrnlscoreId "
				+ intrnlscoreId + "batch_name " + batch_name + " intrnlscoreId"
				+ intrnlscoreId + "studentId" + studentId + "score" + score
				+ "endDate" + "status" + status);

		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" t.courseId as courseId,t.intrnlscoreId as intrnlscoreId,t.batchId as batchId,t.internaltypeId as internaltypeId,t.studentId as studentId,");
		sql.append(" t.score as score,t.status as status,t.lastupdateddt as lastupdateddt,t.lastupdatedby as lastupdatedby,t.quizid as quizid,");
		sql.append(" c.course_name as course_name,b.batch_name as batch_name,s.firstName as firstName");
		sql.append(" from BatchIntScrDM t,AcdCourseDM c,AcdbatchDM b, StudentDM s where 1=1");
		sql.append(" and c.course_id = t.courseId  and b.batch_id = t.batchId and s.studentId = t.studentId ");
		Query query = null;

		if (courseId != null) {
			sql.append("and t.courseId=" + courseId);
		}

		if (batchId != null) {
			sql.append("and t.batchId=" + batchId);
		}

		if (studentId != null) {
			sql.append(" and t.studentId =" + studentId);
		}

		if (status != null && status.trim().length() > 0) {
			sql.append(" and lower(t.status)like lower('" + status + "%')");
		}

		sql.append(" order by t.lastupdateddt desc");
		logger.info("Inside getBatchIntScrList > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(BatchIntScrDM.class));
		return query.list();
	}

}
