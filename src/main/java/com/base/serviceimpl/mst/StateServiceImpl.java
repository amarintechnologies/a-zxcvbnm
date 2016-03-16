
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.StateDAO;
import com.base.domain.mst.StateDM;
import com.base.service.mst.StateService;

public class StateServiceImpl implements StateService {
	@Autowired
	private StateDAO statedao;
	private Logger logger = Logger.getLogger(StateServiceImpl.class);
	
	/**
	 * Used to save or update the State data into the database.         @param StateDM stateObj         
	 */
	@Transactional
	@CacheEvict(value = "State", allEntries = true)
	public void saveOrUpdateState(StateDM stateObj) {
		logger.info("Inside saveOrUpdateState > " + "About to save the data ... ");
		statedao.saveOrUpdateState(stateObj);
	}
	
	/**
	 *         * used to Retrieve data from M_Base_State table based on given parameters.         *        
	 * 
	 * @param String stateName
	 * @param String status
	 * @param Long countryId
	 * @param Long companyId
 	 * @param String filtertype             
	 * @return StateDM List        
	 */
	@Transactional
	@Cacheable(value = "State")
	public List<StateDM> getStateList(String stateName, String status, Long countryId, Long companyId, String filtertype) {
		logger.info("Inside getStateList > " + "About to get State list for " + stateName + ", " + status + ", "
				+ countryId + "," + companyId);
		return statedao.getStateList(stateName, status, countryId, companyId, filtertype);
	}
}
