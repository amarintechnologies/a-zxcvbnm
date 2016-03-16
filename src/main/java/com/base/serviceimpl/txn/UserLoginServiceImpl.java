


package com.base.serviceimpl.txn;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.txn.UserLoginDAO;
import com.base.domain.txn.UserLoginDM;
import com.base.service.txn.UserLoginService;



public class UserLoginServiceImpl implements UserLoginService{
 
	@Autowired
	private UserLoginDAO userloginDAO;
	
	/**Save user Longin list 
	 * 
	 * @param mbaseUserLogin
	 */
	@Transactional
	public void saveUserLoginList(UserLoginDM UserLoginDM) {
		// TODO Auto-generated method stub
				userloginDAO.saveMBaseuserLoginList(UserLoginDM);
		
	}
		/**
	 * To update the log out date based on userloginid in MBaseUserLogin 
	 * 
	 * @param userloginid
	
	 */
	@Transactional
	
	public void updateLogoutDateByUserLogin(Long userLoginId) {
		// TODO Auto-generated method stub
		userloginDAO.updateLogoutDateByMbaseUserLogin(userLoginId);
	}
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
	@Transactional
	public List<UserLoginDM> getUserLoginList(Long userId,Long companyId)
	{
		return userloginDAO.getUserLoginList(userId,companyId);
	}
	
	


}
