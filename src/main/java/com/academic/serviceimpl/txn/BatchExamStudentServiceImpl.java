package com.academic.serviceimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.BatchExamStudentsDAO;
import com.academic.dao.txn.CommentsDAO;
import com.academic.domain.txn.BatchExamStudentDM;
import com.academic.service.txn.BatchExamStudentService;

public class BatchExamStudentServiceImpl implements BatchExamStudentService {
	@Autowired
	private BatchExamStudentsDAO batchexamstudDao;
	private Logger logger = Logger.getLogger(BatchExamStudentServiceImpl.class);

	/**
	 * Used to save or update the Comments data into the database.              
	 */
	@Transactional
	public void saveOrUpdateBatchExamStud(BatchExamStudentDM examStudObj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveOrUpdateState > "
				+ "About to save the data ... ");
		batchexamstudDao.saveOrUpdateBatchExamStud(examStudObj);
	}

	@Transactional
	public List<BatchExamStudentDM> getExamStudList(Long exStudId,
			Long exsubjId, Long studId, Date examDate, Long gradeId,
			String status, Long courseId, String filterType, Long examId) {
		// TODO Auto-generated method stub
		logger.info("Inside getStateList > " + "About to get State list for "
				+ exStudId + ", " + exsubjId + ", " + studId + "," + examDate);
		// return commentsDao.getCommnetsList(commentsId, studentId,
		// commentTitle, status, filterType);
		return batchexamstudDao.getExamStudList(exStudId, exsubjId, studId,
				examDate, gradeId, status, courseId, filterType, examId);
	}

}
