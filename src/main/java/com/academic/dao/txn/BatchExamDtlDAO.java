package com.academic.dao.txn;

import java.util.Date;
import java.util.List;

import com.academic.domain.txn.BatchExamDtlDM;

public interface BatchExamDtlDAO {
	/** Method for save or update BatchExamDtlDM **/
	/**
	 * @param objBatchExamDtlDM
	 *            of BatchExamDtlDM
	 */
	public void saveorUpdatBatchExamDtl(BatchExamDtlDM objBatchExamDtlDM);

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
			Date startTime, Date endTime, String status);
}
