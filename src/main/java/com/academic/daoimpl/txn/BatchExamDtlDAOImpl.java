package com.academic.daoimpl.txn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.BatchExamDtlDAO;
import com.academic.domain.txn.BatchExamDM;
import com.academic.domain.txn.BatchExamDtlDM;
import com.erputil.util.DateUtils;

@Repository
public class BatchExamDtlDAOImpl implements BatchExamDtlDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(BatchExamDtlDAOImpl.class);

	/** Method for save or update BatchExamDtlDM **/
	/**
	 * @param objBatchExamDtlDM
	 *            of BatchExamDtlDM
	 */
	public void saveorUpdatBatchExamDtl(BatchExamDtlDM objBatchExamDtlDM) {
		sessionFactory.getCurrentSession().saveOrUpdate(objBatchExamDtlDM);
	}

	/**
	 * To get BatchExamDtlDM based on workdayid and batchname name
	 * 
	 * @param Long
	 *            batchExamId, Long batchid, String examName, Date startDate,
	 *            Date endDate, String status
	 * 
	 * @return list of BatchExamDtlDM
	 */
	public List<BatchExamDtlDM> getBatchExamDtlList(Long ExamSubjId,
			Long batchExamId, Long subjectId, String examName, Date examDate,
			Date startTime, Date endTime, String status) {
		logger.info("Inside  getBatchExamDtlList > ");
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" m.examSubjId as examSubjId,m.batchExamId as batchExamId,m.subjectId as subjectId, m.examDate as examDate,"
				+ "m.startTime as startTime,"
				+ "m.endTime as endTime,m.status as status,");
		sql.append(" m.lastupdatesdt as lastupdatesdt,m.lastupdatesby as lastupdatesby,"
				+ " b.subjectName as subjectName");
		sql.append(" from BatchExamDtlDM m,BatchExamDM ex, AcdSubjectDM  b where 1=1");
		sql.append(" and ex.batchExamId= m.batchExamId and m.subjectId = b.subjectId");
		Query query = null;
		if (batchExamId != null) {
			sql.append(" and m.batchExamId =" + batchExamId);
		}
		if (ExamSubjId != null) {
			sql.append(" and m.examSubjId =" + ExamSubjId);
		}
		if (subjectId != null) {
			sql.append(" and m.subjectId =" + subjectId);
		}

		if (examDate != null) {
			sql.append(" and m.examDate = '"
					+ DateUtils.datetostringsimp(examDate) + "'");

		}

		if (status != null) {
			sql.append(" and m.status='" + status + "'");
		}
		if (startTime != null) {

			sql.append(" and m.startTime between '"
					+ DateUtils.datetostringtimefull(startTime) + "' and '"
					+ DateUtils.datetostringtimefull(endTime) + "'");
		}

		sql.append(" order by m.lastupdatesdt desc");
		logger.info("Inside getBatchExamDtlList > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(BatchExamDtlDM.class));
		return query.list();
	}
}
