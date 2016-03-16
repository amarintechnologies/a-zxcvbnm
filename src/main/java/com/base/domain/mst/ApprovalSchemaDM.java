
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
@Table(name = "m_base_approval_schema")
public class ApprovalSchemaDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "APPRV_SCHMID")
	private Long apprSchmId;
	@Column(name = "COMPANY_ID")
	private Long companyid;
	@Column(name = "SCREEN_ID")
	private Long screenId;
	@Column(name = "BRANCH_ID")
	private Long branchId;
	@Column(name = "ROLE_ID")
	private Long roleId;
	@Column(name = "APPROVE_LVL")
	private String apprLevel;
	@Column(name = "APPROVE_LIMIT")
	private Long apprLimit;
	@Column(name = "APRVSCH_STATUS")
	private String apprStatus;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastUpdatedDate;
	@Column(name = "LAST_UPDATED_BY")
	private String lastUpdatedBy;
	@Transient
	private String screenName;
	@Transient
	private String branchName;
	@Transient
	private String roleName;
	
	public String getApprSchmId() {
		return apprSchmId.toString();
	}
	
	public void setApprSchmId(Long apprSchmId) {
		this.apprSchmId = apprSchmId;
	}
	
	public Long getCompanyid() {
		return companyid;
	}
	
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	
	public Long getScreenId() {
		return screenId;
	}
	
	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}
	
	public Long getBranchId() {
		return branchId;
	}
	
	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}
	
	public Long getRoleId() {
		return roleId;
	}
	
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	public String getApprLevel() {
		return apprLevel;
	}
	
	public void setApprLevel(String apprLevel) {
		this.apprLevel = apprLevel;
	}
	
	public Long getApprLimit() {
		return apprLimit;
	}
	
	public void setApprLimit(Long apprLimit) {
		this.apprLimit = apprLimit;
	}
	
	public String getApprStatus() {
		return apprStatus;
	}
	
	public void setApprStatus(String apprStatus) {
		this.apprStatus = apprStatus;
	}
	
	public String getLastUpdatedDate() {
		if (lastUpdatedDate != null)
		{
		return DateUtils.datetostringtime(lastUpdatedDate);
	}
		return "";
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
	
	public String getScreenName() {
		return screenName;
	}
	
	public void setScreenName(String screenName) {
		this.screenName = screenName;
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
}
