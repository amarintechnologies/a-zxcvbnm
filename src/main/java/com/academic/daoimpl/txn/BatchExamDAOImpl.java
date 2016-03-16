package com.academic.daoimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.BatchExamDAO;
import com.academic.domain.txn.BatchExamDM;
import com.erputil.util.DateUtils;

@Repository
public class BatchExamDAOImpl implements BatchExamDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(BatchExamDAOImpl.class);

	/** Method for save or update BatchExamDM **/
	/**
	 * @param objbatchExamDM
	 *            of BatchExamDM
	 */
	public void saveorUpdatBatchExam(BatchExamDM objbatchExamDM) {
		logger.info("Inside  saveorUpdatBatchExam > ");

		sessionFactory.getCurrentSession().saveOrUpdate(objbatchExamDM);
	}

	/**
	 * To get BatchExamList based on workdayid and batchname name
	 * 
	 * @param Long
	 *            batchExamId, Long batchid, String examName, Date startDate,
	 *            Date endDate, String status
	 * 
	 * @return list of AcdbatchworkdaysDM
	 */
	public List<BatchExamDM> getBatchExamList(Long batchExamId, Long batchid,
			String examName, Date startDate, Date endDate, String status) {

		logger.info("Inside  getBatchExamList > ");
		StringBuffer sql = new StringBuffer("select ");
		sql.append(" m.batchExamId as batchExamId,m.batchId as batchId,m.examName as examName,m.startDate as startDate,"
				+ "m.endDate as endDate,m.status as status,");
		sql.append(" m.lastupdatesdt as lastupdatesdt,m.lastupdatesby as lastupdatesby, m.courseId as courseId ,"
				+ " b.batch_name as batchname,c.course_name as course_name ");
		sql.append(" from BatchExamDM m,AcdbatchDM  b, AcdCourseDM c where 1=1");
		sql.append(" and m.batchId = b.batch_id and c.course_id = m.courseId");
		Query query = null;
		if (batchExamId != null) {
			sql.append(" and m.batchExamId =" + batchExamId);
		}
		if (batchid != null) {
			sql.append(" and m.batchId =" + batchid);
		}
		if (startDate != null) {
			sql.append(" and m.startDate ='"
					+ DateUtils.datetostringsimp(startDate) + "'");
		}
		if (endDate != null) {
			sql.append(" and m.endDate =  '"
					+ DateUtils.datetostringsimp(endDate) + "'");
		}
		if (examName != null && examName.trim().length() > 0) {
			sql.append(" and lower(m.examName)like lower('" + examName + "%')");
		}
		if (status != null && status.trim().length() > 0) {
			sql.append(" and lower(m.status)like lower('" + status + "%')");
		}
		sql.append(" order by m.lastupdatesdt desc");
		logger.info("Inside getacdbatchworkdayList > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(BatchExamDM.class));
		return query.list();
	}
}
