
package com.base.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.mst.ParameterDAO;
import com.base.domain.mst.ParameterDM;
import com.base.service.mst.ParameterService;

public class ParameterServiceImpl implements ParameterService {
	@Autowired
	private ParameterDAO paramDao;
	private Logger logger = Logger.getLogger(ParameterServiceImpl.class);
	
	/**
	 * getting the parameter value based on parameter reference in Parameter
	 * 
	 * @param String
	 *            paramRef Long companyId String moduleCode 
	 * @return String
	 */
	@Transactional
	public String getParameterValue(String paramRef, Long companyId, Long moduleCode) {
		logger.info(" getParameterValue > " + "About to save the data ... ");
		return paramDao.getParameterValue(paramRef, companyId, moduleCode);
	}
	
	/**
	 * To search details on Parameter table
	 * 
	 * @param Long
	 *            paramId String paramRef status Long companyId
	 * 
	 * @return list of ParameterDM
	 * 
	 */
	@Transactional
	public List<ParameterDM> getParameterList(Long moduleCode,Long paramId, String paramRef, String status, Long companyId) {
		logger.info("getParameterList > "+moduleCode+"," + companyId + ", " + paramId + "," + paramRef + ", " + status);
		return paramDao.getParameterList(moduleCode,paramId, paramRef, status, companyId);
	}
	
	/** Method for update Parameter **/
	/**
	 * @param paramObj
	 *            of ParameterDM
	 */
	@Transactional
	public void updateDetails(ParameterDM paramObj) {
		paramDao.updateDetails(paramObj);
		logger.info("updateDetails > " + "About to save the data ... ");
	}
}
