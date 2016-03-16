
package com.base.serviceimpl.mst;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.AccessConfigDAO;
import com.base.domain.mst.AccessConfigDM;
import com.base.service.mst.AccessConfigService;

public class AccessConfigServiceImpl implements AccessConfigService {
	@Autowired
	private AccessConfigDAO accdao;
	
	/**
	 * To save access config table details
	 * 
	 * @param accessobj
	 * 
	 */
	@Transactional
	@CacheEvict(value = "accessconfig", allEntries = true)
	public void saveAccessConfigDetails(AccessConfigDM accessobj) {
		accdao.saveAccessConfigDetails(accessobj);
	}
	
	/**
	 * To get details from access config table depends on condition if all arguments are null it returns entire list
	 * 
	 * @param scrID
	 *            configId companyId branchId roleid status
	 * @return list
	 * 
	 */
	@Transactional
	@Cacheable(value = "accessconfig")
	public List<AccessConfigDM> getAccessConfigList(Long scrID, Long configId, Long companyId, Long branchId,
			Long roleid, String status) {
		// TODO Auto-generated method stub
		return accdao.getAccessConfigList(scrID, configId, companyId, branchId, roleid, status);
	}
	
	/**
	 * To check the user authorization based on role returns Y or N
	 * 
	 * @param appscode
	 *            configcode roleid
	 * 
	 * @return string
	 * 
	 */
	@Transactional
	public String checkUserAuthorization(String appscode, String configcode, Long roleid) {
		return accdao.checkUserAuthorization(appscode, configcode, roleid);
	}
	
	/**
	 * To get details of OnOff Status from access config table depends on condition if all arguments are null it returns
	 * entire list
	 * 
	 * @param companyId
	 *            branchId RoleId screenCode
	 * 
	 * @return list
	 * 
	 */
	@Transactional
	public String getOnOFFStatusbasedonScreenCodeandCompanyIdansBranchIdandRoleId(Long companyId, Long branchId,
			Long RoleId, String screenCode) {
		// TODO Auto-generated method stub
		return accdao.getOnOFFStatusbasedonScreenCodeandCompanyIdansBranchIdandRoleId(companyId, branchId, RoleId,
				screenCode);
	}
	
	/**
	 * To delete the specify records from access config table depends on condition
	 * 
	 * @param companyId
	 *            branchId roleId
	 * 
	 * 
	 */
	@Transactional
	public void updateaccessconfigoldrecords(Long companyId, Long branchId, Long roleId) {
		// TODO Auto-generated method stub
		accdao.updateaccessconfigoldrecords(companyId, branchId, roleId);
	}
	
	@Transactional
	public void saveScreenAccessDetail(AccessConfigDM accessobj) {
		// TODO Auto-generated method stub
		accdao.saveScreenAccessDetail(accessobj);
	}
	
	@Transactional
	public List<AccessConfigDM> saveScreenAccessDetail(Long companyId, Long branchId, Long roleId, String pubYN,
			String viewYN, String createYN, String reviewYN, String appYN, String recLVL, String status) {
		// TODO Auto-generated method stub
		return accdao.saveScreenAccessDetail(companyId, branchId, roleId, pubYN, viewYN, createYN, reviewYN, appYN,
				recLVL, status);
	}
}
