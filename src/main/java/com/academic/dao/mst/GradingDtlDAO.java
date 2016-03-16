package com.academic.dao.mst;


import java.util.List;

import com.academic.domain.mst.GradingDtlDM;

public interface GradingDtlDAO {
	/**
	 * Used to save or update the Grading data into the database.      
	 * 
	 * @param GradingDtlDM
	 *            gradedtlobj         
	 */
	public void saveOrUpdateGradingDtl(GradingDtlDM gradedtlobj);

	/**
	 * used to Retrieve data from m_acd_grading_dtl table based on given
	 * parameters.   
	 * 
	 * @param Long gradingDtlId, Long gradingId, String gradeCode, Long
	 *             gradeStart, Long gradeEnd, String status
	 * @return GradingDtlDM List         
	 */
	public List<GradingDtlDM> getGradingDtlList(Long gradingDtlId,
			Long gradingId, String gradeCode, Long gradeStart, Long gradeEnd,
			String status);
}
