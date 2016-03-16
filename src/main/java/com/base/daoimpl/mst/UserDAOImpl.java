
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.UserDAO;
import com.base.domain.mst.TimeZoneDM;
import com.base.domain.mst.UserDM;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(UserDAOImpl.class);
	
	/**
	 * Method for saveorUpdateUserDetails
	 * 
	 * @param userObj
	 */
	public void saveorUpdateUserDetails(UserDM userObj) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().saveOrUpdate(userObj);
	}
	/**
	 * To get user list based on login id password and check the company id is Active status
	 * 
	 * @param String employeeName, String employeeCode, String loginId, String status,
			Long userId, Long companyId, String password, String filtertype
	 * 
	 * @return List<UserDM>
	 */
	public List<UserDM> getUserList(String employeeName, String employeeCode, String loginId, String status,
			Long userId, Long companyId, String password, String filtertype) {
		logger.info("Inside getUserList > " + employeeName + ", " + employeeCode + ", " + loginId + ","
				+ companyId + "," + userId+","+ password + "," + filtertype);
		Query query = null;
		StringBuffer sql = new StringBuffer(" select");
		if (filtertype.equals("P")) {
			sql.append(" new UserDM(userid) ");
		} else {
			sql.append(" u.userid as userid,u.companyid as companyid,u.timezoneid as timezoneid,");
			sql.append(" u.loginid as loginid,u.loginpassword as loginpassword,u.creationdt as creationdt,");
			sql.append(" u.passwordchangedt as passwordchangedt,u.passwordexpiredt as passwordexpiredt,u.lastlogindt as lastlogindt,");
			sql.append(" u.logincount as logincount,u.systemuseryn as systemuseryn,u.sessionid as sessionid,u.userstatus as userstatus,");
			sql.append(" u.lastupdateddt as lastupdateddt,u.lastupdatedby as lastupdatedby,c.companycode as companyCode,");
			sql.append(" c.companyname as companyName,t.timezonedesc as timezonedesc");
		}
		sql.append(" from UserDM u,CompanyDM c,TimeZoneDM t where 1=1 ");
		sql.append(" and c.companyid = u.companyid and t.timezoneid = u.timezoneid  ");
		query = null;
		if (employeeName != null && employeeName != "") {
			sql.append(" and u.userid in (Select e.userId from EmployeeDM e where  lower(e.firstname) like lower('"
					+ employeeName + "%'))");
		}
		if (employeeCode != null && employeeCode != "") {
			sql.append(" and u.userid in (Select e.userId from EmployeeDM e where  lower(e.employeecode) like lower('"
					+ employeeCode + "%'))");
		}
		if (loginId != null && loginId.trim().length() > 0) {
			sql.append(" and  lower(u.loginid) like lower('" + loginId + "%')");
		}
		if (status != null) {
			sql.append(" and u.userstatus ='" + status + "'");
		}
		if (userId != null) {
			sql.append(" and u.userid =" + userId);
		}
		if (companyId != null) {
			sql.append(" and u.companyid =" + companyId);
		}
		if (password != null) {
			sql.append(" and u.loginpassword ='" + password + "'");
		}
		sql.append(" order by u.lastupdateddt desc");
		logger.info("Inside getUserList Query>" + sql.toString());
		query = sessionfactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(UserDM.class));
		return query.list();
	}
	
	/**
	 * Method for Validating the existing Email Id. If new user enters existing Email Id,it will show Validate
	 * Notification
	 * 
	 * @param emailId
	 * 
	 * @return count
	 */
	public Long checkEmailId(String emailId) {
		String sql = "Select count(*) from UserDM m where m.loginid like ('" + emailId + "')";
		Query query = sessionfactory.getCurrentSession().createQuery(sql);
		return Long.valueOf(query.list().get(0).toString());
	}
	
	/**
	 * Method for Update existing user's new password
	 * 
	 * @param String
	 *            newPassword,String passwordExpireDate,String passWord,String userName
	 */
	public void getUpdatePasswordDetails(String newPassword, String passwordExpireDt, String passWord, String userName) {
		String sql = "update UserDM m set m.loginpassword='" + newPassword
				+ "', m.passwordchangedt=sysdate,m.passwordexpiredt=to_date('" + passwordExpireDt
				+ "','dd-MM-YYYY') where m.loginid='" + userName + "' and m.loginpassword='" + passWord + "'";
		sessionfactory.getCurrentSession().createQuery(sql).executeUpdate();
	}
	
	/**
	 * Method for Update session Id by user id and session id
	 * 
	 * @param Long
	 *            userId,String sessionId
	 */
	public void updateSessionId(Long userId, String sessionId) {
		sessionfactory.getCurrentSession()
				.createQuery("update UserDM m set m.sessionid=" + sessionId + " where m.userid=" + userId)
				.executeUpdate();
	}
	
	/**
	 * Method for Reset session Id by user id
	 * 
	 * @param Long
	 *            userId
	 */
	public void resetSessionId(Long userId) {
		sessionfactory.getCurrentSession().createQuery("update UserDM m set m.sessionid='' where m.userid=" + userId)
				.executeUpdate();
	}
	
	/**
	 * Method for return the TimeZoneDM of Active TimeZone List
	 * 
	 * @return List<TimeZoneDM>
	 * 
	 */
	public List<TimeZoneDM> gettimezonelist() {
		String sql = "select m from TimeZoneDM m ";
		Query query = sessionfactory.getCurrentSession().createQuery(sql);
		return query.list();
	}
	
	/**
	 * update session id, last logged date and login count in UserDM
	 * 
	 * @param Long
	 *            userId,String sessionId
	 */
	public void updateUserListByUserId(Long userId, String sessionId) {
		sessionfactory
				.getCurrentSession()
				.createQuery(
						"update UserDM m set m.lastlogindt=sysdate , m.sessionid='" + sessionId
								+ "' , m.logincount=logincount+1 where m.userid=" + userId).executeUpdate();
	}
	
	/**
	 * Method for updateTimezonebyUser
	 * 
	 * @param Long
	 *            userId,Long timeZoneId,String userName
	 */
	public void updateTimezonebyUser(Long userId, Long timeZoneId, String userName) {
		String sql = "update m_base_user set timezone_id=" + timeZoneId + " ,last_updated_by='" + userName
				+ "',last_updated_dt=sysdate where user_id=" + userId;
		sessionfactory.getCurrentSession().createSQLQuery(sql).executeUpdate();
	}
}
