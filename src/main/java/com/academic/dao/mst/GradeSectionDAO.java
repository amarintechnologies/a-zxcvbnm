package com.academic.dao.mst;

import java.util.List;
import com.academic.domain.mst.GradeSectionDM;

public interface GradeSectionDAO {
	/**
	 * Used to save or update the GradeSection data into the database.      
	 * 
	 * @param GradeSectionDM
	 *            gradeSecobj         
	 */
	public void saveOrUpdateGradingSection(GradeSectionDM gradeSecobj);

	/**
	 * used to Retrieve data from m_acd_grade_section table based on given
	 * parameters.   
	 * 
	 * @param Long gradeSectnId, Long companyId, String gradeSecName, String
	 *             status
	 * @return GradeSectionDM List         
	 */
	public List<GradeSectionDM> getGradeSectionList(Long gradeSectnId,
			Long companyId, String gradeSecName, String status);
}
