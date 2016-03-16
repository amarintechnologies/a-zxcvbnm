
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

@Entity
@Table(name = "m_base_field_access_config")
public class FieldAccessConfigDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "FLDACESID_REF")
	private Long configId;
	@Column(name = "SCR_FLD_REF")
	private Long screenFldRef;
	@Column(name = "COMPANY_ID")
	private Long companyid;
	@Column(name = "BRANCH_ID")
	private Long branchid;
	@Column(name = "ROLE_ID")
	private Long roleId;
	@Column(name = "VIEW_YN")
	private String viewYN;
	@Column(name = "FLDACS_STATUS")
	private String status;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastUpdatedDate;
	@Column(name = "LAST_UPDATED_BY")
	private String lastUpdatedBy;
	@Transient
	private String screeFieldDesc;
	@Transient
	private String branchName;
	@Transient
	private String roleName;
	
	public String getScreeFieldDesc() {
		return screeFieldDesc;
	}
	
	public void setScreeFieldDesc(String screeFieldDesc) {
		this.screeFieldDesc = screeFieldDesc;
	}
	
	public String getBranchName() {
		return branchName;
	}
	
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	public String getRoleName() {
		return roleName;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public Long getConfigId() {
		return configId;
	}
	
	public void setConfigId(Long configId) {
		this.configId = configId;
	}
	
	public Long getScreenFldRef() {
		return screenFldRef;
	}
	
	public void setScreenFldRef(Long screenFldRef) {
		this.screenFldRef = screenFldRef;
	}
	
	public Long getCompanyid() {
		return companyid;
	}
	
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	
	public Long getBranchid() {
		return branchid;
	}
	
	public void setBranchid(Long branchid) {
		this.branchid = branchid;
	}
	
	public Long getRoleId() {
		return roleId;
	}
	
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	public String getViewYN() {
		return viewYN;
	}
	
	public void setViewYN(String viewYN) {
		this.viewYN = viewYN;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
}
