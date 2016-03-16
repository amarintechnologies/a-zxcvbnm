
package com.base.dao.mst;

import java.util.List;


import com.base.domain.mst.RoleDM;

public interface RoleDAO 
{
/**
        * Used to save or update the Role data into the database.
        * @param RoleDAO RoleObj
        */
public void saveOrUpdateRole(RoleDM RoleObj);

/**
 *This Method returns Role details based on user's input
 * @param String rolename 
 * @param String status
 * @param Long companyId 
 * @param String filtertype
 * return RoleDM list
 */
	public List<RoleDM> getRoleList(String rolename, String status, Long companyId, String filtertype);
}