

package com.base.domain.txn;

import javax.persistence.Transient;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.erputil.util.DateUtils;

@Entity
@Table(name = "t_base_logger")
public class LoggerDM {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LOG_ID")
	private Long logid;

	@Column(name = "COMPANY_ID")
	private Long companyid;

	@Column(name = "LOG_REF")
	private String logref;

	@Column(name = "LOG_TYPE")
	private String logtype;

	@Column(name = "LOG_DESCRIPTION")
	private String logdescription;

	@Column(name = "ERR_CODE")
	private String errcode;

	@Column(name = "CLIENT_IP")
	private String clientip;

	@Column(name = "USER_ID")
	private Long userid;

	@Column(name = "LAST_UPDATED_DT")
	private Date lastupdateddate;

	@Column(name = "LAST_UPDATED_BY")
	private String lastupdatedby;

	@Transient
	private String loginid;

	public String getLogname() {
		return logname;
	}

	public void setLogname(String logname) {
		this.logname = logname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Transient
	private String logname;

	@Transient
	private String username;

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public Long getLogid() {
		return logid;
	}

	public void setLogid(Long logid) {
		this.logid = logid;
	}

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}

	public String getLogref() {
		return logref;
	}

	public void setLogref(String logref) {
		this.logref = logref;
	}

	public String getLogtype() {
		return logtype;
	}

	public void setLogtype(String logtype) {
		this.logtype = logtype;
	}

	public String getLogdescription() {
		return logdescription;
	}

	public void setLogdescription(String logdescription) {
		this.logdescription = logdescription;
	}

	public String getErrcode() {
		return errcode;
	}

	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	public String getClientip() {
		return clientip;
	}

	public void setClientip(String clientip) {
		this.clientip = clientip;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getLastupdateddate() {
		return DateUtils.datetostringtime(lastupdateddate);
	}

	public void setLastupdateddate(Date lastupdateddate) {
		this.lastupdateddate = lastupdateddate;
	}

	public String getLastupdatedby() {
		return lastupdatedby;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}
}