
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
@Table(name = "m_base_state")
public class StateDM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "STATE_ID")
	private Long stateId;
	@Column(name = "STATE_NAME")
	private String stateName;
	@Column(name = "STATE_CODE")
	private String stateCode;
	@Column(name = "COUNTRY_ID")
	private Long countryId;
	@Column(name = "STATE_STATUS")
	private String stateStatus;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastUpdatedDt;
	@Column(name = "LAST_UPDATED_BY")
	private String lastUpdatedBy;
	@Column(name = "COMPANY_ID")
	private Long companyid;
	@Transient
	private String countryName;
	
	public StateDM() {
	}
	
	public StateDM(Long stateId, String stateName) {
		this.stateId = stateId;
		this.stateName = stateName;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public String getStateId() {
		if (stateId != null) {
			return stateId.toString();
		} else {
			return "";
		}
	}
	
	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}
	
	public String getStateName() {
		return stateName;
	}
	
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	public String getStateCode() {
		return stateCode;
	}
	
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	
	public Long getCountryId() {
		return countryId;
	}
	
	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}
	
	public String getStateStatus() {
		return stateStatus;
	}
	
	public void setStateStatus(String stateStatus) {
		this.stateStatus = stateStatus;
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
	
	public Long getCompanyid() {
		return companyid;
	}
	
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
}
