
package com.base.serviceimpl.mst;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.base.dao.mst.UserDAO;
import com.base.domain.mst.TimeZoneDM;
import com.base.domain.mst.UserDM;
import com.base.service.mst.UserService;

@Repository
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO mbaseuserdao;
	
	/**
	 * Method for saveorUpdateUserDetails
	 * 
	 * @param userObj
	 */
	@Transactional
	@CacheEvict(value = "user", allEntries = true)
	public void saveorUpdateUserDetails(UserDM pojo) {
		mbaseuserdao.saveorUpdateUserDetails(pojo);
	}
	
	/**
	 * Method for Update session Id by user id and session id
	 * 
	 * @param Long
	 *            userId,String sessionId
	 */
	@Transactional
	public void updateSessionId(Long userId, String sessionId) {
		mbaseuserdao.updateSessionId(userId, sessionId);
	}
	
	/**
	 * Method for Reset session Id by user id
	 * 
	 * @param Long
	 *            userId
	 */
	@Transactional
	public void resetSessionId(Long userId) {
		mbaseuserdao.resetSessionId(userId);
	}
	
	/**
	 * Method for Validating the existing Email Id. If new user enters existing Email Id,it will show Validate
	 * Notification emailId
	 * 
	 * @param String
	 *            employeeName
	 * @param String
	 *            employeeCode
	 * @param String
	 *            loginId
	 * @param String
	 *            status
	 * @param Long
	 *            userId
	 * @param Long
	 *            companyId
	 * @param String
	 *            password
	 * @param String
	 *            filtertype
	 * 
	 * 
	 */
	@Transactional
	@Cacheable(value = "user")
	public List<UserDM> getUserList(String employeeName, String employeeCode, String loginId, String status,
			Long userId, Long companyId, String password, String filtertype) {
		return mbaseuserdao.getUserList(employeeName, employeeCode, loginId, status, userId, companyId, password,
				filtertype);
	}
	
	/**
	 * Method for Validating the existing Email Id. If new user enters existing Email Id,it will show Validate
	 * Notification
	 * 
	 * @param String
	 *            emailid
	 * 
	 * @return count
	 */
	@Transactional
	public Long checkEmailId(String emailid) {
		return mbaseuserdao.checkEmailId(emailid);
	}
	
	/**
	 * Method for Update existing user's new password
	 * 
	 * @param String
	 *            newPassword,String passwordExpireDate,String passWord,String userName
	 */
	@Transactional
	@CacheEvict(value = "user", allEntries = true)
	public void getUpdatePasswordDetails(String newPassword, String passwordExpireDt, String password, String username) {
		mbaseuserdao.getUpdatePasswordDetails(newPassword, passwordExpireDt, password, username);
	}
	
	/**
	 * Method for return the TimeZoneDM of Active TimeZone List
	 * 
	 * @return List<TimeZoneDM>
	 * 
	 */
	@Transactional
	public List<TimeZoneDM> gettimezonelist() {
		return mbaseuserdao.gettimezonelist();
	}
	
	/**
	 * update session id, last logged date and login count in UserDM
	 * 
	 * @param Long
	 *            userId,String sessionId
	 */
	@Transactional
	public void updateUserListByUserId(Long userId, String sessionId) {
		mbaseuserdao.updateUserListByUserId(userId, sessionId);
	}
	
	/**
	 * Method for updateTimezonebyUser
	 * 
	 * @param Long
	 *            userId,Long timeZoneId,String userName
	 */
	@Transactional
	public void updateTimezonebyUser(Long userId, Long timeZoneId, String userName) {
		mbaseuserdao.updateTimezonebyUser(userId, timeZoneId, userName);
	}
}
