

package com.base.service.txn;

import java.util.List;
import com.base.domain.txn.UserLoginDM;


public interface UserLoginService {
	/**Save user Longin list 
	 * 
	 * @param UserLoginDM
	 */
		public void saveUserLoginList(UserLoginDM UserLoginDM);
		/**update log out date in UserLoginDM based on user login id
		 * 
		 * @param userLoginId
		 */
		public void updateLogoutDateByUserLogin(Long userLoginId);
		
		/**
		 * To get details from  UserLoginDM table depends on userid
		 * if userId = null it doesnot return any value
		 * else it returns value from UserLoginDM based on userid from MBaseUser
		 * 
		 * @param userId
		 * 
		 * @return list
		 * 
		 */
		public List<UserLoginDM> getUserLoginList(Long userId,Long companyId);


}
