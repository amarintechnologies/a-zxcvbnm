package com.academic.dao.mst;

import java.util.Date;
import java.util.List;

import com.academic.domain.mst.ApplicantDM;

public interface ApplicantDAO {
	/**
	 *     * Used to save or update the ApplicantDM data into the database.    
	 *  * @param objApplicant         
	 */
	public void saveOrUpdateApplicant(ApplicantDM objApplicant);

	/**
	 *  * used to Retrieve data from ApplicantDM table based on given
	 * parameters.
	 * 
	 * @param Long
	 *            applicantId, Long companyId, Date applicantDate, String
	 *            first_name, String lastName, Long batch_id, Date dob, String
	 *            nationality,Long countryId, String status     
	 * 
	 *                @return List<ApplicantDM>         
	 */
	public List<ApplicantDM> getAcdApplicantList(Long applicantId,
			Long companyId, Date applicantDate, String first_name,
			String lastName, Long batchId, Date dob, String nationality,
			Long countryId, String status, String appltnNo, Long courseId,
			Date applTodt);

	public void updatestatus(Long applicantId, String status);

}
