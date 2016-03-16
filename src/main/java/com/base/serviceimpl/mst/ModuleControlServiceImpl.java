
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.ModuleControlDAO;
import com.base.domain.mst.ModuleControlDM;
import com.base.domain.mst.ModuleDM;
import com.base.service.mst.ModuleControlService;

public class ModuleControlServiceImpl implements ModuleControlService {
	/** @Autowired refers that integrating the spring concepts that is using for linking with specified class **/
	/** SessionFactory refers that maintains the session until it gets expired **/
	@Autowired
	private ModuleControlDAO modulecntrldao;
	private Logger logger = Logger.getLogger(ModuleControlServiceImpl.class);
	
	/**
	 * To get MBaseModuleControl list based on moduleCode,moduleName and status
	 * 
	 * @param String
	 *            moduleCode
	 * @param String
	 *            moduleName
	 * @param String
	 *            strStatus
	 * @param Long
	 *            companyId
	 * 
	 * @return ModuleControlDM list
	 */
	@Transactional
	@Cacheable(value = "ModuleControl")
	public List<ModuleControlDM> getModuleControlList(Long moduleCode, String strStatus, Long companyId) {
		logger.info("Inside getModulecontrolList > " + "About to get Module control list for " + moduleCode + ", "
				+ strStatus + ", " + companyId);
		return modulecntrldao.getModuleControlList(moduleCode, strStatus, companyId);
	}
	
	/** Method for get Active List of Module **/
	/**
	 * @return ModuleDM list
	 */
	@Transactional
	public List<ModuleDM> getModuleList() {
		return modulecntrldao.getModuleList();
	}
}
