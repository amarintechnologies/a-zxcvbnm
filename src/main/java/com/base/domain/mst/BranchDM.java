
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
import javax.persistence.Transient;
import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_base_branch")
public class BranchDM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "BRANCH_ID")
	private Long branchId;
	@Column(name = "BRANCH_NAME")
	private String branchName;
	@Column(name = "COMPANY_ID")
	private Long companyid;
	@Column(name = "BRANCH_ADDRESS")
	private String branchAddress;
	@Column(name = "POST_CODE")
	private String postCode;
	@Column(name = "CITY_ID")
	private Long cityId;
	@Column(name = "STATE_ID")
	private Long stateId;
	@Column(name = "COUNTRY_ID")
	private Long countryId;
	@Column(name = "PHONE")
	private String phoneNo;
	@Column(name = "EMAIL_ID")
	private String emailId;
	@Column(name = "REG_NO")
	private String regNo;
	@Column(name = "TAN_NO")
	private String tanNo;
	@Column(name = "ST_NO")
	private String stNo;
	@Column(name = "BRANCH_STATUS")
	private String status;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastUpdatedDt;
	@Column(name = "LAST_UPDATED_BY") 
	private String lastUpdatedBy;
	@Transient
	private String countryName;
	@Transient
	private String stateName;
	@Transient
	private String cityName;
	
	public BranchDM() {
	}
	
	public BranchDM(Long branchId, String branchName) {
		this.branchId = branchId;
		this.branchName = branchName;
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
	
	public Long getCompanyid() {
		return companyid;
	}
	
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	
	public String getBranchAddress() {
		return branchAddress;
	}
	
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	
	public String getPostCode() {
		return postCode;
	}
	
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	public Long getCityId() {
		return cityId;
	}
	
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	
	public Long getStateId() {
		return stateId;
	}
	
	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}
	
	public Long getCountryId() {
		return countryId;
	}
	
	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public String getStateName() {
		return stateName;
	}
	
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getRegNo() {
		return regNo;
	}
	
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	
	public String getTanNo() {
		return tanNo;
	}
	
	public void setTanNo(String tanNo) {
		this.tanNo = tanNo;
	}
	
	public String getStNo() {
		return stNo;
	}
	
	public void setStNo(String stNo) {
		this.stNo = stNo;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getLastUpdatedDt() {
		if (lastUpdatedDt != null) {
			return DateUtils.datetostringtime(lastUpdatedDt);
		} else {
			return "";
		}
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
