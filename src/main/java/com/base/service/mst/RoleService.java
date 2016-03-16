
package com.base.service.mst;

import java.util.List;
import com.base.domain.mst.RoleDM;

public interface RoleService {
	/**
	 *          Used to save or update the RoleDM data into the database.       
	 * 
	 * @param RoleDM
	 *            RoleObj         
	 */
	public void saveOrUpdateRole(RoleDM RoleObj);
	
	/**
	 * This Method returns RoleDM details based on user's input
	 * 
	 * @param String
	 *            rolename
	 * @param String
	 *            status
	 * @param Long
	 *            companyId
	 * @param String
	 *            filtertype return Role list
	 */
	public List<RoleDM> getRoleList(String rolename, String status, Long companyId, String filtertype);
}
