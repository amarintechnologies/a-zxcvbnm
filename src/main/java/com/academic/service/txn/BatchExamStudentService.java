package com.academic.service.txn;

import java.util.Date;
import java.util.List;

import com.academic.domain.txn.BatchExamStudentDM;

public interface BatchExamStudentService {
	/**
	 * Used to save or update the Comments data into the database.      
	 * 
	 * @param BatchExamStudentDM
	 *            examStudObj         
	 */

	public void saveOrUpdateBatchExamStud(BatchExamStudentDM examStudObj);

	/**
	 * used to Retrieve data from t_acd_media table based on given parameters.
	 *   
	 * 
	 * @param Long CommentsId, Long StudentId, String commentTitle, String
	 *             status,String filterTyp     
	 */
	public List<BatchExamStudentDM> getExamStudList(Long exStudId,
			Long exsubjId, Long studId, Date examDate, Long gradeId,
			String status, Long courseId, String filterType, Long examId);
}
