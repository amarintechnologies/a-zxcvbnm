package com.academic.serviceimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.BatchExamDAO;
import com.academic.domain.txn.BatchExamDM;
import com.academic.service.txn.BatchExamService;

public class BatchExamServiceImpl implements BatchExamService {
	@Autowired
	private BatchExamDAO batchExamDAO;
	private Logger logger = Logger.getLogger(BatchExamServiceImpl.class);

	/** Method for save or update BatchExamDM **/
	/**
	 * @param objbatchExamDM
	 *            of BatchExamDM
	 */
	@Transactional
	public void saveorUpdatBatchExam(BatchExamDM objbatchExamDM) {
		logger.info("Inside  saveorUpdatBatchExam Seviceimpl > ");

		batchExamDAO.saveorUpdatBatchExam(objbatchExamDM);
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
	@Transactional
	public List<BatchExamDM> getBatchExamList(Long batchExamId,
			Long batchid, String examName, Date startDate, Date endDate,
			String status) {
		logger.info("Inside  getBatchExamList serviceimpl > ");

		return batchExamDAO.getBatchExamList(batchExamId, batchid, examName,
				startDate, endDate, status);
	}
}
