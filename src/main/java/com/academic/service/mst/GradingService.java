package com.academic.service.mst;

import java.util.List;
import com.academic.domain.mst.GradingDM;

public interface GradingService {
	/**
	 * Used to save or update the Grading data into the database.      
	 * 
	 * @param GradingDM
	 *            gradeobj         
	 */
	public void saveOrUpdateGrading(GradingDM gradeobj);

	/**
	 * used to Retrieve data from m_acd_grading table based on given parameters.
	 *   
	 * 
	 * @param Long gradingId,Long companyId,String gradeName,String status      
	 * @return GradingDM List         
	 */
	public List<GradingDM> getGradingList(Long gradingId, Long companyId,
			String gradeName, String status);
}
