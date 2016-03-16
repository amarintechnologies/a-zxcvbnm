package com.academic.service.mst;

import java.util.Date;
import java.util.List;

import com.academic.domain.mst.StudHelthHistryDM;

public interface StudHelthHistryService {
	/**
	 *    Used to save or update the StudHelthHistryDM data into the database.
	 *       * @param objStudHltHtry         
	 */

	public void saveOrUpdateStudHelthHistry(StudHelthHistryDM objStudHltHtry);

	/**
	 *  Used to Retrieve data from StudHelthHistryDM table based on given
	 * parameters.        
	 * 
	 * @param Long healthHistid, Long studentId, Long deceaseId, Date
	 *             dateOfInfect, String status
	 * @return List<StudHelthHistryDM>         
	 */
	public List<StudHelthHistryDM> getStudHelthHistryyList(Long healthHistid,
			Long studentId, Long deceaseId, Date dateOfInfect, String status);
}
