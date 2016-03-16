
package com.base.domain.mst;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_base_user_roles")
public class UserRolesDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "userrole_id")
	private Long userroleid;
	@Column(name = "role_id")
	private Long roleId;
	@Column(name = "user_id")
	private Long userId;
	@Column(name = "COMPANY_ID")
	private Long companyId;
	@Column(name = "role_status")
	private String status;
	
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	@Column(name = "last_updated_dt")
	private Date lastUpdatedDt;
	@Column(name = "last_updated_by")
	private String lastUpdatedBy;
	@Transient
	private String roleName;
	@Transient
	private String loginid;
	
	public UserRolesDM() {
	}
	
	public UserRolesDM(Long userroleid) {
		this.userroleid = userroleid;
	}
	
	public String getRoleName() {
		return roleName;
	}
	
	public String getLoginid() {
		return loginid;
	}
	
	public Long getRoleId() {
		return roleId;
	}
	
	public Long getUserroleid() {
		return userroleid;
	}
	
	public void setUserroleid(Long userroleid) {
		this.userroleid = userroleid;
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
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getLastUpdatedDt() {
		return DateUtils.datetostringtime(lastUpdatedDt);
	}
	
	public void setLastUpdatedDt(Date lastUpdatedDt) {
		this.lastUpdatedDt = lastUpdatedDt;
	}
	
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
}
