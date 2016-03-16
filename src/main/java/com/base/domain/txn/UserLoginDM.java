
package com.base.domain.txn;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.erputil.util.DateUtils;

@Entity
@Table(name = "T_BASE_USER_LOGIN")
public class UserLoginDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="login_refid")
	private Long loginRefId; 
	@Column(name="user_id")
	private Long userId;
	@Column(name="company_id")
	private Long companyId;
	@Column(name="login_date")
	private Date loginDate;
	@Column(name="logout_date")
	private Date logoutDate;
	@Column(name="client_ip")
	private String clientIp="";
	@Column(name="session_id")
	private String sessionId="";
	@Column(name="remarks")
	private String remarks="";
	
	
	
	public Long getLoginRefId() {
		return loginRefId;
	}
	public void setLoginRefId(Long loginRefId) {
		this.loginRefId = loginRefId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getLoginDate() {
		if (loginDate != null) {
			return DateUtils.datetostringtime(loginDate);
		} else {
			return null;
		}
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	public String getLogoutDate() {
		if (logoutDate != null) {
			return DateUtils.datetostringtime(logoutDate);
		} else {
			return null;
		}
	}
	public void setLogoutDate(Date logoutDate) {
		this.logoutDate = logoutDate;
	}
	public String getClientIp() {
		return clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getremarks() {
		return remarks;
	}
	public void setremarks(String remarks) {
		this.remarks = remarks;
	}


}
