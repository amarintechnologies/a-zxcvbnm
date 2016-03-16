//Class : SettingsDM.java

package com.library.domain.mst;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_lib_settings")
public class SettingsDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "setting_id")
	private Long settingid;
	@Column(name = "company_id")
	private Long companyid;
	@Column(name = "course_id")
	private Long courseid;
	@Column(name = "batch_id")
	private Long batchid;
	@Column(name = "category_id")
	private Long categoryid;
	@Column(name = "time_period")
	private Long timeperiod;
	@Column(name = "grace_period")
	private Long graceperiod;
	@Column(name = "extn_yn")
	private String extnyn;
	@Column(name = "fine_yn")
	private String fineyn;
	@Column(name = "fine_pday")
	private Double finepday;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastupdatedDt;
	@Column(name = "last_updated_by")
	private String lastupdatedBy;

	@Transient
	private String batchName;
	@Transient
	private String course_name;
	@Transient
	private String categoryName;

	@Column(name = "ccy_id")
	private Long currencyId;

	public SettingsDM() {

	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Long getSettingid() {
		return settingid;
	}

	public void setSettingid(Long settingid) {
		this.settingid = settingid;
	}

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}

	public Long getCourseid() {
		return courseid;
	}

	public void setCourseid(Long courseid) {
		this.courseid = courseid;
	}

	public Long getBatchid() {
		return batchid;
	}

	public void setBatchid(Long batchid) {
		this.batchid = batchid;
	}

	public Long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}

	public Long getTimeperiod() {
		return timeperiod;
	}

	public void setTimeperiod(Long timeperiod) {
		this.timeperiod = timeperiod;
	}

	public Long getGraceperiod() {
		return graceperiod;
	}

	public void setGraceperiod(Long graceperiod) {
		this.graceperiod = graceperiod;
	}

	public String getExtnyn() {
		return extnyn;
	}

	public void setExtnyn(String extnyn) {
		this.extnyn = extnyn;
	}

	public String getFineyn() {
		return fineyn;
	}

	public void setFineyn(String fineyn) {
		this.fineyn = fineyn;
	}

	public Double getFinepday() {
		return finepday;
	}

	public void setFinepday(Double finepday) {
		this.finepday = finepday;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLastupdatedDt() {
		if (lastupdatedDt != null) {
			return DateUtils.datetostringtime(lastupdatedDt);
		} else {
			return "";
		}

	}

	public void setLastupdatedDt(Date lastupdatedDt) {
		this.lastupdatedDt = lastupdatedDt;
	}

	public String getLastupdatedBy() {
		return lastupdatedBy;
	}

	public void setLastupdatedBy(String lastupdatedBy) {
		this.lastupdatedBy = lastupdatedBy;
	}

	public Long getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}

}
