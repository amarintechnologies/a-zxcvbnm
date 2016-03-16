
package com.base.domain.txn;

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
@Table(name = "t_base_holiday")
public class HolidaysDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "HOLIDAY_ID")
	private Long holidayId;
	@Column(name = "HOLIDAY_NAME")
	private String holidayName;
	@Column(name = "COMPANY_ID")
	private Long companyid;
	@Column(name = "BRANCH_ID")
	private Long branchId;
	@Column(name = "HOLIDAY_DT")
	private Date holidayDate;
	@Column(name = "HOLDY_SESSION")
	private String holidaySession;
	@Column(name = "HOLIDAY_STATUS")
	private String holidayStatus;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastUpdatedDate;
	@Column(name = "LAST_UPDATED_BY")
	private String lastUpdatedBy;
	@Transient
	private String branchName = "";
	
	public HolidaysDM() {
	}
	
	public HolidaysDM(Long holidayId, String holidayName) {
		this.holidayId = holidayId;
		this.holidayName = holidayName;
	}
	
	public String getBranchName() {
		return branchName;
	}
	
	public String getHolidayDate() {
		if (holidayDate != null) {
			return DateUtils.datetostring(holidayDate);
		} else {
			return "";
		}
	}
	
	public Date getHolidayDateInDt() {
		return holidayDate;
	}
	
	public void setHolidayDate(Date holidayDate) {
		this.holidayDate = holidayDate;
	}
	
	public String getHolidaySession() {
		return holidaySession;
	}
	
	public void setHolidaySession(String holidaySession) {
		this.holidaySession = holidaySession;
	}
	
	public Long getHolidayId() {
		return holidayId;
	}
	
	public void setHolidayId(Long holidayId) {
		this.holidayId = holidayId;
	}
	
	public String getHolidayName() {
		return holidayName;
	}
	
	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}
	
	public Long getCompanyid() {
		return companyid;
	}
	
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	public Long getBranchId() {
		return branchId;
	}
	
	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}
	
	public String getHolidayStatus() {
		return holidayStatus;
	}
	
	public void setHolidayStatus(String holidayStatus) {
		this.holidayStatus = holidayStatus;
	}
	
	public String getLastUpdatedDate() {
		if (lastUpdatedDate != null) {
			return DateUtils.datetostringtime(lastUpdatedDate);
		} else {
			return "";
		}
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
