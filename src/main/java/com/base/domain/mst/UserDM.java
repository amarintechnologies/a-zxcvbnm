
package com.base.domain.mst;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_base_user")
public class UserDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "USER_ID")
	private Long userid;
	@Column(name = "COMPANY_ID")
	private Long companyid;
	@Column(name = "TIMEZONE_ID")
	private Long timezoneid;
	@Transient
	private String timezonename;
	@Column(name = "LOGIN_ID")
	private String loginid;
	@Column(name = "LOGIN_PASSWORD")
	private String loginpassword;
	@Column(name = "CREATION_DT")
	private Date creationdt;
	@Column(name = "PASSWD_CHNG_DT")
	private Date passwordchangedt;
	@Column(name = "PASSWD_EXP_DT")
	private Date passwordexpiredt;
	@Column(name = "LAST_LOGIN_DT")
	private Date lastlogindt;
	@Column(name = "LOGIN_COUNT")
	private Long logincount;
	@Column(name = "SYSTEM_USR_YN")
	private String systemuseryn;
	@Column(name = "SESSION_ID")
	private String sessionid;
	@Column(name = "USER_STATUS")
	private String userstatus;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastupdateddt;
	@Column(name = "LAST_UPDATED_BY")
	private String lastupdatedby;
	@Transient
	public String errorDescription;
	@Transient
	private String companyName;
	@Transient
	private String companyCode;
	@Transient
	private String timezonedesc;
	@Transient
	private Long branchId;
	@Transient
	private String branchName;

	public UserDM() {
	}

	public UserDM(Long userid) {
		this.userid = userid;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getTimezonedesc() {
		return timezonedesc;
	}

	public void setTimezonedesc(String timezonedesc) {
		this.timezonedesc = timezonedesc;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyobj) {
		this.companyid = companyobj;
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getLoginpassword() {
		return loginpassword;
	}

	public void setLoginpassword(String loginpassword) {
		this.loginpassword = loginpassword;
	}

	public Long getTimezoneid() {
		return timezoneid;
	}

	public void setTimezoneid(Long timezoneid) {
		this.timezoneid = timezoneid;
	}

	public String getCreationdt() {
		if (creationdt != null) {
			return DateUtils.datetostringtime(creationdt);
		} else {
			return null;
		}
	}

	public Date getCreationdtInDt() {
		return creationdt;
	}

	public void setCreationdt(Date creationdt) {
		this.creationdt = creationdt;
	}

	public String getPasswordchangedt() {
		if (passwordchangedt != null) {
			return DateUtils.datetostringtime(passwordchangedt);
		} else {
			return null;
		}
	}

	public Date getPasswordchangedtInDt() {
		return passwordchangedt;
	}

	public void setPasswordchangedt(Date passwordchangedt) {
		this.passwordchangedt = passwordchangedt;
	}

	public String getPasswordexpiredt() {
		if (passwordexpiredt != null) {
			return DateUtils.datetostringtime(passwordexpiredt);
		} else {
			return null;
		}
	}

	public Date getPasswordexpiredtInDt() {
		return passwordexpiredt;
	}

	public void setPasswordexpiredt(Date passwordexpiredt) {
		this.passwordexpiredt = passwordexpiredt;
	}

	public String getLastlogindt() {
		if (lastlogindt != null) {
			return DateUtils.datetostringtime(lastlogindt);
		} else {
			return null;
		}
	}

	public Date getLastlogindtInDt() {
		return lastlogindt;
	}

	public void setLastlogindt(Date lastlogindt) {
		this.lastlogindt = lastlogindt;
	}

	public Long getLogincount() {
		return logincount;
	}

	public void setLogincount(Long logincount) {
		this.logincount = logincount;
	}

	public String getSystemuseryn() {
		return systemuseryn;
	}

	public void setSystemuseryn(String systemuseryn) {
		this.systemuseryn = systemuseryn;
	}

	public String getSessionid() {
		if (sessionid == null) {
			sessionid = "";
		}
		return sessionid;
	}

	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}

	public String getUserstatus() {
		return userstatus;
	}

	public void setUserstatus(String userstatus) {
		this.userstatus = userstatus;
	}

	public String getLastupdateddt() {
		if (lastupdateddt != null) {
			return DateUtils.datetostringtime(lastupdateddt);
		} else {
			return null;
		}
	}

	public void setLastupdateddt(Date lastupdateddt) {
		this.lastupdateddt = lastupdateddt;
	}

	public String getLastupdatedby() {
		return lastupdatedby;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}

	public String getTimezonename() {
		return timezonename;
	}

	public void setTimezonename(String timezonename) {
		this.timezonename = timezonename;
	}

	public Long getBranchId() {
		return branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
}
