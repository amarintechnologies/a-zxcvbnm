
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


@Entity 
@Table(name="M_BASE_SCRN_ACCESS_CONFIG")
public class AccessConfigDM implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ACCESS_ID_REF")
	private Long configId;

	@Column(name="SCREEN_ID")
	private Long scrID;
	
	
	
	@Column(name = "COMPANY_ID")
	private Long companyid;
	
	@Column(name = "BRANCH_ID")
	private Long branchid;
	
	@Column(name="ROLE_ID")
	private Long roleId;
		
	@Column(name="PUBLIC_YN")
	private String publicYN;
	
	@Column(name="VIEW_YN")
	private String viewYN;
	
	@Column(name="CREATE_YN")
	private String createYN;
	
	@Column(name="REVIEW_YN")
	private String reviewYN;
	
	@Column(name="APPROVE_YN")
	private String approYN;
	
	@Column(name="RECORD_LVL")
	private String recLVL;
	
	/*@Column(name="ON_OFF")
	private String onOFFStatus;*/
	@Column(name="access_status")
	private String status;
		
	@Column(name="LAST_UPDATED_DT")
	private  Date lastUpdatedDate;
	
	@Column(name="LAST_UPDATED_BY")
	private String lastUpdatedBy;

	public Long getScrID() {
		return scrID;
	}

	public void setScrID(Long scrID) {
		this.scrID = scrID;
	}

	public String getPublicYN() {
		return publicYN;
	}

	public void setPublicYN(String publicYN) {
		this.publicYN = publicYN;
	}

	public String getViewYN() {
		return viewYN;
	}

	public void setViewYN(String viewYN) {
		this.viewYN = viewYN;
	}

	public String getCreateYN() {
		return createYN;
	}

	public void setCreateYN(String createYN) {
		this.createYN = createYN;
	}

	public String getReviewYN() {
		return reviewYN;
	}

	public void setReviewYN(String reviewYN) {
		this.reviewYN = reviewYN;
	}

	public String getApproYN() {
		return approYN;
	}

	public void setApproYN(String approYN) {
		this.approYN = approYN;
	}

	public String getRecLVL() {
		return recLVL;
	}

	public void setRecLVL(String recLVL) {
		this.recLVL = recLVL;
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

	public Long getConfigId() {
		return configId;
	}

	public void setConfigId(Long configId) {
		this.configId = configId;
	}

/*	public MBaseAppScreenFields getScreenCode() {
		return screenCode;
	}

	public void setScreenCode(MBaseAppScreenFields screenCode) {
		this.screenCode = screenCode;
	}*/

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/*public String getOnOFFStatus() {
		return onOFFStatus;
	}

	public void setOnOFFStatus(String onOFFStatus) {
		this.onOFFStatus = onOFFStatus;
	}*/

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
