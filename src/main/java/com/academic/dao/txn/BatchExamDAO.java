package com.academic.dao.txn;

import java.util.Date;
import java.util.List;

import com.academic.domain.txn.BatchExamDM;

public interface BatchExamDAO {

	/** Method for save or update BatchExamDM **/
	/**
	 * @param objbatchExamDM
	 *            of BatchExamDM
	 */
	public void saveorUpdatBatchExam(BatchExamDM objbatchExamDM);

	/**
	 * To get BatchExamList based on workdayid and batchname name
	 * 
	 * @param Long
	 *            batchExamId, Long batchid, String examName, Date startDate,
	 *            Date endDate, String status
	 * 
	 * @return list of AcdbatchworkdaysDM
	 */
	public List<BatchExamDM> getBatchExamList(Long batchExamId,
			Long batchid, String examName, Date startDate, Date endDate,
			String status);

}
