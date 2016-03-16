
package com.base.service.mst;

import java.util.List;
import com.base.domain.mst.AccessConfigDM;

public interface AccessConfigService {
	/**
	 * To save access config table details
	 * 
	 * @param accessobj
	 * 
	 */
	public void saveAccessConfigDetails(AccessConfigDM accessobj);
	
	/**
	 * To get details from access config table depends on condition if all arguments are null it returns entire list
	 * 
	 * @param scrID
	 *            configId companyId branchId roleid status
	 * 
	 * @return list
	 * 
	 */
	public List<AccessConfigDM> getAccessConfigList(Long scrID, Long configId, Long companyId, Long branchId,
			Long roleid, String status);
	
	/**
	 * To check the user authorization based on role returns Y or N
	 * 
	 * @param appscode
	 *            configcode roleid
	 * 
	 * @return string
	 * 
	 */
	public String checkUserAuthorization(String appscode, String configcode, Long roleid);
	
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
	public String getOnOFFStatusbasedonScreenCodeandCompanyIdansBranchIdandRoleId(Long companyId, Long branchId,
			Long RoleId, String screenCode);
	
	/**
	 * To delete the specify records from access config table depends on condition
	 * 
	 * @param companyId
	 *            branchId roleId
	 * 
	 * 
	 */
	public void updateaccessconfigoldrecords(Long companyId, Long branchId, Long roleId);
	
	public void saveScreenAccessDetail(AccessConfigDM accessobj);
	
	public List<AccessConfigDM> saveScreenAccessDetail(Long companyId, Long branchId, Long roleId, String pubYN,
			String viewYN, String createYN, String reviewYN, String appYN, String recLVL, String status);
}
