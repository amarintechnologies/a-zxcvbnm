
package com.base.service.mst;

import java.util.List;
import com.base.domain.mst.UserRolesDM;

public interface UserRolesService {
	/**
	 * get role id based on user Id and companyId in UserRolesDM
	 * 
	 * @param Long
	 *            userId,Long companyId
	 * @return Long roleId
	 */
	public Long getRoleIdByUserId(Long userId, Long companyId);
	
	/**
	 * Used to save or update the UserRolesDM data into the database.         
	 * 
	 * @param RoleObj
	 *                    
	 */
	public void saveOrUpdateUserRole(UserRolesDM RoleObj);
	
	/**
	 * This Method returns UserRolesDM details based on user's input
	 * 
	 * @param Long
	 *            roleId, Long userId, String status, Long companyId, Long Userroleid, String filtertype
	 * @return List UserRolesDM
	 */
	public List<UserRolesDM> getRoleList(Long roleId, Long userId, String status, Long companyId, Long Userroleid,
			String filtertype);
	
	/**
	 * Method for delete User Role
	 * 
	 * @param Long
	 *            userId
	 * 
	 */
	public void deleteUserRole(Long userId);
}
