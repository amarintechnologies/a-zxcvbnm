
package com.base.domain.mst;

import java.io.Serializable;
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
@Table(name = "m_base_role")
public class RoleDM implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "ROLE_ID")
	private Long roleId;
	@Column(name = "ROLE_NAME")
	private String roleName;
	@Column(name = "COMPANY_ID")
	private Long companyid;
	@Column(name = "ROLE_STATUS")
	private String roleStatus;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastUpdatedDt;
	@Column(name = "LAST_UPDATED_BY")
	private String lastupdatedby;
	
	public RoleDM() {
	}
	
	public RoleDM(Long roleid, String rolename) {
		this.roleId = roleid;
		this.roleName = rolename;
	}
	
	public Long getRoleId() {
		return roleId;
	}
	
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	public String getRoleName() {
		return roleName;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public Long getCompanyid() {
		return companyid;
	}
	
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	
	public String getRoleStatus() {
		return roleStatus;
	}
	
	public void setRoleStatus(String roleStatus) {
		this.roleStatus = roleStatus;
	}
	
	public String getLastUpdatedDt() {
		return DateUtils.datetostringtime(lastUpdatedDt);
	}
	
	public void setLastUpdatedDt(Date lastUpdatedDt) {
		this.lastUpdatedDt = lastUpdatedDt;
	}
	
	public String getLastupdatedby() {
		return lastupdatedby;
	}
	
	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}
}
