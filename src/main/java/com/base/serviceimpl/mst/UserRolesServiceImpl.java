
package com.base.serviceimpl.mst;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.UserRolesDAO;
import com.base.domain.mst.UserRolesDM;
import com.base.service.mst.UserRolesService;

public class UserRolesServiceImpl implements UserRolesService {
	@Autowired
	private UserRolesDAO userRolesdao;
	
	/**
	 * get role id based on user Id and companyId in UserRolesDM
	 * 
	 * @param Long
	 *            userId,Long companyId
	 * @return Long roleId
	 */
	@Transactional
	public Long getRoleIdByUserId(Long userId, Long companyId) {
		return userRolesdao.getRoleIdByUserId(userId, companyId);
	}
	
	/**
	 * Used to save or update the UserRolesDM data into the database.         
	 * 
	 * @param RoleObj
	 *                    
	 */
	@Transactional
	public void saveOrUpdateUserRole(UserRolesDM RoleObj) {
		userRolesdao.saveOrUpdateUserRole(RoleObj);
	}
	
	/**
	 * This Method returns UserRolesDM details based on user's input
	 * 
	 * @param Long
	 *            roleId, Long userId, String status, Long companyId, Long Userroleid, String filtertype
	 * @return List UserRolesDM
	 */
	@Transactional
	public List<UserRolesDM> getRoleList(Long roleId, Long userId, String status, Long companyId, Long userRoleId,
			String filtertype) {
		return userRolesdao.getRoleList(roleId, userId, status, companyId, userRoleId, filtertype);
	}
	
	/**
	 * Method for delete User Role
	 * 
	 * @param Long
	 *            userId
	 * 
	 */
	@Transactional
	public void deleteUserRole(Long userId) {
		userRolesdao.deleteUserRole(userId);
	}
}
