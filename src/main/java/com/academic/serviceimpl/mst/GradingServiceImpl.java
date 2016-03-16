package com.academic.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.academic.dao.mst.GradingDAO;
import com.academic.domain.mst.GradingDM;
import com.academic.service.mst.GradingService;

public class GradingServiceImpl implements GradingService {
	@Autowired
	private GradingDAO gradingDAO;
	private Logger logger = Logger.getLogger(GradingServiceImpl.class);

	/**
	 * Used to save or update the Grading data into the database.      
	 * 
	 * @param GradingDM
	 *            gradeobj         
	 */
	@Transactional
	public void saveOrUpdateGrading(GradingDM gradeobj) {
		logger.info("Inside saveOrUpdateGrading > "
				+ "About to save the data ... ");
		gradingDAO.saveOrUpdateGrading(gradeobj);

	}

	/**
	 * used to Retrieve data from m_acd_grading table based on given parameters.
	 *   
	 * 
	 * @param Long gradingId,Long companyId,String gradeName,String status      
	 * @return GradingDM List         
	 */
	@Transactional
	public List<GradingDM> getGradingList(Long gradingId, Long companyId,
			String gradeName, String status) {

		return gradingDAO.getGradingList(gradingId, companyId, gradeName,
				status);
	}
}
