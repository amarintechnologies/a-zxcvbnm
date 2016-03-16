
package com.base.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.RoleDAO;
import com.base.domain.mst.RoleDM;
import com.base.service.mst.RoleService;

public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDAO roledao;
	private Logger logger = Logger.getLogger(RoleServiceImpl.class);
	
	@Transactional
	@CacheEvict(value = "systemrole", allEntries = true)
	public void saveOrUpdateRole(RoleDM RoleObj) {
		logger.info("Inside saveOrUpdateState > " + RoleObj + "About to save the data ... ");
		roledao.saveOrUpdateRole(RoleObj);
	}
	
	/**
	 *  * used to Retrieve data from M_BASE_ROLE table based on given parameters.         *        
	 * 
	 * @param String rolename
	 * @param String status
	 * @param Long companyId   
	 * @param String filtertype
	 * @return RoleDM List        
	 */
	@Transactional
	@Cacheable(value = "systemrole")
	public List<RoleDM> getRoleList(String rolename, String status, Long companyId, String filtertype) {
		logger.info("Inside getRoleList > " + "About to get Role list for " + rolename + ", " + status + ", "
				+ companyId);
		return roledao.getRoleList(rolename, status, companyId, filtertype);
	}
}
