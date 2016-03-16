package com.academic.serviceimpl.mst;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.mst.StudHelthHistryDAO;
import com.academic.domain.mst.StudHelthHistryDM;
import com.academic.service.mst.StudHelthHistryService;

public class StudHelthHistryServiceImpl implements StudHelthHistryService {

	@Autowired
	private StudHelthHistryDAO studHelthHistryDAO;
	private Logger logger = Logger.getLogger(StudHelthHistryServiceImpl.class);

	/**
	 *    Used to save or update the StudHelthHistryDM data into the database.
	 *       * @param objStudHltHtry         
	 */
	@Transactional

	public void saveOrUpdateStudHelthHistry(StudHelthHistryDM objStudHltHtry) {
		studHelthHistryDAO.saveOrUpdateStudHelthHistry(objStudHltHtry);
	}

	/**
	 *  Used to Retrieve data from StudHelthHistryDM table based on given
	 * parameters.        
	 * 
	 * @param Long healthHistid, Long studentId, Long deceaseId, Date
	 *             dateOfInfect, String status
	 * @return List<StudHelthHistryDM>         
	 */
	@Transactional
	public List<StudHelthHistryDM> getStudHelthHistryyList(Long healthHistid,
			Long studentId, Long deceaseId, Date dateOfInfect, String status) {
		return studHelthHistryDAO.getStudHelthHistryyList(healthHistid,
				studentId, deceaseId, dateOfInfect, status);
	}
}
