package com.academic.serviceimpl.mst;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.mst.ApplicantDAO;
import com.academic.domain.mst.ApplicantDM;
import com.academic.service.mst.ApplicantService;

public class ApplicantServiceImpl implements ApplicantService {
	@Autowired
	private ApplicantDAO applicantDAO;
	private Logger logger = Logger.getLogger(ApplicantServiceImpl.class);

	/**
	 *     * Used to save or update the ApplicantDM data into the database.    
	 *  * @param objApplicant         
	 */
	@Transactional
	public void saveOrUpdateApplicant(ApplicantDM objApplicant)

	{
		logger.info("Inside saveOrUpdateApplicant  >>>>>>>>>>>>>");
		applicantDAO.saveOrUpdateApplicant(objApplicant);
	}

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
	@Transactional
	public List<ApplicantDM> getAcdApplicantList(Long applicantId,
			Long companyId, Date applicantDate, String first_name,
			String lastName, Long batchId, Date dob, String nationality,
			Long countryId, String status, String appltnNo, Long courseId, Date applTodt) {
		logger.info("Inside getAcdApplicantList  >>>>>>>>>>>>>");

		return applicantDAO.getAcdApplicantList(applicantId, companyId,
				applicantDate, first_name, lastName, batchId, dob, nationality,
				countryId, status, appltnNo,courseId, applTodt);

	}
	@Transactional

	public void updatestatus(Long applicantId, String status) {
applicantDAO.updatestatus(applicantId, status);		
	}
}
