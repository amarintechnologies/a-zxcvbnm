package com.academic.daoimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.BatchExamStudentsDAO;
import com.academic.domain.mst.AcdSubjectDM;
import com.academic.domain.mst.GradingDtlDM;
import com.academic.domain.txn.BatchExamDM;
import com.academic.domain.txn.BatchExamDtlDM;
import com.academic.domain.txn.BatchExamStudentDM;

@Repository
public class BatchExamStudentDAOImpl implements BatchExamStudentsDAO {
	/**
	 * @Autowired refers that integrating the spring concepts that is using for
	 *            linking with specified class
	 **/
	/** SessionFactory refers that maintains the session until it gets expired **/
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(BatchExamStudentDAOImpl.class);

	/**
	 * Method for save or update BatchExamStudentDM
	 * 
	 * @param examStudObj
	 *            of examStudObj
	 */
	public void saveOrUpdateBatchExamStud(BatchExamStudentDM examStudObj) {
		sessionFactory.getCurrentSession().saveOrUpdate(examStudObj);
	}

	public List<BatchExamStudentDM> getExamStudList(Long exStudId,
			Long exsubjId, Long studId, Date examDate, Long gradeId,
			String status, Long courseId, String filterType, Long examId) {
		logger.info("Inside  getExamStudList >  " + "exStudId" + exStudId
				+ "exsubjId " + exsubjId);
		Query query = null;
		StringBuffer sql = new StringBuffer("select ");
		if (filterType.equals("P")) {
			sql.append("mt.exStudId as exStudId,mt.exsubjId as exsubjId,mt.studId as studId,mt.gradeId as gradeId,mt.courseId as courseId from BatchExamStudentDM mt where 1=1");
		} else {

			sql.append("mt.exStudId as exStudId,mt.exsubjId as exsubjId,mt.studId as studId,mt.examDate as examDate,"
					+ "mt.presYN as presYN,mt.resDate as resDate,mt.gradeId as gradeId,mt.markScore as markScore,mt.passYN as passYN,"
					+ "mt.status as status,mt.updatedDt as updatedDt,mt.updatedBy as updatedBy,mt.courseId as courseId,"
					+ " mt.gradingDtlId as gradingDtlId,mt.gradeId as gradeId ,");
			sql.append("st.firstName as studentName ,sub.subjectName as subjectName");

			sql.append(" from BatchExamStudentDM mt, StudentDM st ,BatchExamDtlDM bt, AcdSubjectDM sub "
					+ " where  bt.examSubjId=mt.exsubjId"
					+ " and sub.subjectId=bt.subjectId and st.studentId=mt.studId ");

		}

		if (exStudId != null) {
			sql.append(" and mt.exStudId=" + exStudId);
		}

		if (exsubjId != null) {
			sql.append(" and mt.exsubjId = " + exsubjId);
		}

		if (examId != null) {
			sql.append(" and mt.exsubjId in( select b.examSubjId from  BatchExamDtlDM b where  b.batchExamId = "
					+ examId + ")");
		}
		if (studId != null) {
			sql.append(" and mt.studId=" + studId);
		}
		/*
		 * if (examDate != null) { sql.append(" and mt.examDate=" + examDate); }
		 */
		if (examDate != null) {
			sql.append(" and mt.examDate ='" + examDate + "'");
		}
		if (gradeId != null) {
			sql.append(" and mt.gradeId=" + gradeId);
		}

		if (status != null) {
			sql.append(" and lower(mt.status) like lower('" + status + "%')");
		}

		sql.append(" order by mt.updatedDt desc");
		logger.info("Inside getExamStudList > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(BatchExamStudentDM.class));
		return query.list();
	}

}
