package com.academic.serviceimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.BatchExamDtlDAO;
import com.academic.domain.txn.BatchExamDtlDM;
import com.academic.service.txn.BatchExamDtlService;

public class BatchExamDtlServiceImpl implements BatchExamDtlService {
	@Autowired
	private BatchExamDtlDAO batchExamDtlDAO;
	private Logger logger = Logger.getLogger(BatchExamDtlServiceImpl.class);

	/** Method for save or update BatchExamDtlDM **/
	/**
	 * @param objBatchExamDtlDM
	 *            of BatchExamDtlDM
	 */
	@Transactional
	public void saveorUpdatBatchExamDtl(BatchExamDtlDM objBatchExamDtlDM) {
		logger.info("Inside  saveorUpdatBatchExamDtl service impl > ");

		batchExamDtlDAO.saveorUpdatBatchExamDtl(objBatchExamDtlDM);
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
	@Transactional
	public List<BatchExamDtlDM> getBatchExamDtlList(Long ExamSubjId,
			Long batchExamId, Long subjectId, String examName, Date examDate,
			Date startTime, Date endTime, String status) {
		logger.info("Inside  getBatchExamDtlList service impl > ");

		return batchExamDtlDAO.getBatchExamDtlList(ExamSubjId, batchExamId,
				subjectId, examName, examDate, startTime, endTime, status);
	}
}
