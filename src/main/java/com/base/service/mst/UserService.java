
package com.base.service.mst;

import java.util.List;

import com.base.domain.mst.TimeZoneDM;
import com.base.domain.mst.UserDM;

public interface UserService {
	/**
	 * Method for saveorUpdateUserDetails
	 * 
	 * @param userObj
	 */
	public void saveorUpdateUserDetails(UserDM userObj);
	
	/**
	 * Method for return the UserDM list by loginId and employeeId and status
	 * 
	 * @param String
	 *            employeeName , String employeeCode,String loginId,String status ,Long userId,Long companyId,String
	 *            password,String filtertype
	 * 
	 * @return List<UserDM>
	 * 
	 */
	public List<UserDM> getUserList(String employeeName, String employeeCode, String loginId, String status,
			Long userId, Long companyId, String password, String filtertype);
	
	/**
	 * Method for Validating the existing Email Id. If new user enters existing Email Id,it will show Validate
	 * Notification
	 * 
	 * @param String
	 *            emailId
	 * 
	 */
	public Long checkEmailId(String emailId);
	
	/**
	 * Method for Update existing user's new password
	 * 
	 * @param String
	 *            newPassword,String passwordExpireDate,String passWord,String userName
	 */
	public void getUpdatePasswordDetails(String newPassword, String passwordExpireDate, String passWord, String userName);
	
	/**
	 * Method for Update session Id by user id and session id
	 * 
	 * @param Long
	 *            userId,String sessionId
	 */
	public void updateSessionId(Long userId, String sessionId);
	
	/**
	 * Method for Reset session Id by user id
	 * 
	 * @param Long
	 *            userId
	 */
	public void resetSessionId(Long userId);
	
	/**
	 * Method for return the TimeZoneDM of Active TimeZone List
	 * 
	 * @return List<TimeZoneDM>
	 * 
	 */
	public List<TimeZoneDM> gettimezonelist();
	
	/**
	 * update session id, last logged date and login count in UserDM
	 * 
	 * @param Long
	 *            userId,String sessionId
	 */
	public void updateUserListByUserId(Long userId, String sessionId);
	
	/**
	 * Method for updateTimezonebyUser
	 * 
	 * @param Long
	 *            userId,Long timeZoneId,String userName
	 */
	public void updateTimezonebyUser(Long userId, Long timeZoneId, String userName);

	
}
