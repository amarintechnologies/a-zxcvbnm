package com.academic.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.academic.dao.mst.GradingDtlDAO;
import com.academic.domain.mst.GradingDtlDM;
import com.academic.service.mst.GradingDtlService;

public class GradingDtlServiceImpl implements GradingDtlService {
	@Autowired
	private GradingDtlDAO gradingdtlDAO;
	private Logger logger = Logger.getLogger(GradingDtlServiceImpl.class);

	/**
	 * Used to save or update the Grading data into the database.      
	 * 
	 * @param GradingDtlDM
	 *            gradedtlobj         
	 */
	@Transactional
	public void saveOrUpdateGradingDtl(GradingDtlDM gradedtlobj) {
		logger.info("Inside saveOrUpdateGradingDtl > "
				+ "About to save the data ... ");
		gradingdtlDAO.saveOrUpdateGradingDtl(gradedtlobj);

	}

	/**
	 * used to Retrieve data from m_acd_grading_dtl table based on given
	 * parameters.   
	 * 
	 * @param Long gradingDtlId, Long gradingId, String gradeCode, Long
	 *             gradeStart, Long gradeEnd, String status
	 * @return GradingDtlDM List         
	 */
	@Transactional
	public List<GradingDtlDM> getGradingDtlList(Long gradingDtlId,
			Long gradingId, String gradeCode, Long gradeStart, Long gradeEnd,
			String status) {

		return gradingdtlDAO.getGradingDtlList(gradingDtlId, gradingId,
				gradeCode, gradeStart, gradeEnd, status);
	}

}
