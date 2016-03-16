

package com.base.dao.txn;

import java.util.List;

import com.base.domain.txn.UserLoginDM;



public interface UserLoginDAO {
	/**
	*Save user Longin list 
	*/
	public void saveMBaseuserLoginList(UserLoginDM mbaseUserLogin);
	/**update log out date in MBaseUserLogin based on user login id
	 * 
	 * @param userLoginId
	 */
	public void updateLogoutDateByMbaseUserLogin(Long userLoginId);
	
	/**
	 * To get details from  MBaseUserLogin table depends on userid
	 * if userId = null it doesnot return any value
	 * else it returns value from MBaseUserLogin based on userid from MBaseUser
	 * 
	 * @param userId
	 * 
	 * @return list
	 * 
	 */
	public List<UserLoginDM> getUserLoginList(Long userId,Long companyId);

}
