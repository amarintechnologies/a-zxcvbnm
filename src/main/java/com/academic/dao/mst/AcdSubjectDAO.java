package com.academic.dao.mst;


import java.util.List;

import com.academic.domain.mst.AcdSubjectDM;



public interface AcdSubjectDAO {

	/**
	 *     * Used to save or update the AcdSubject data into the database.    
	 *  * @param objAcdSubj         
	 */
	public void saveOrUpdateAcdSubject(AcdSubjectDM objAcdSubj);

	/**
	 *  * used to Retrieve data from AcdSubjectDM table based on given
	 * parameters.          * @param  questionId status       
	 *  * @return List<AcdSubjectDM>         
	 */
	public List<AcdSubjectDM> getAcdSubjectList(Long subjectId,Long companyId,
			String subjectName, String subjectCode, String subjectType,
			String subjectStatus, Long deptId);

}
