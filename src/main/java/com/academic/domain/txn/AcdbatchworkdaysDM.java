package com.academic.domain.txn;

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
@Table(name = "t_acd_batch_workdays")
public class AcdbatchworkdaysDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "workday_id")
	private Long workdayid;
	@Column(name = "batch_id")
	private Long batchid;
	@Column(name = "sunday_yn")
	private String sundayyn;
	@Column(name = "monday_yn ")
	private String mondayyn;
	@Column(name = "tuesday_yn")
	private String tuesdayyn;
	@Column(name = "wednesday_yn")
	private String wedbesdayyn;
	@Column(name = "thursday_yn")
	private String thursdayyn;
	@Column(name = "friday_yn")
	private String fridayyn;
	@Column(name = "saturday_yn")
	private String saturdayYn;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastupdatesdt;
	@Column(name = "last_updated_by")
	private String lastupdatesby;
	@Transient
	private String batchname;

	public Long getWorkdayid() {
		return workdayid;
	}

	public void setWorkdayid(Long workdayid) {
		this.workdayid = workdayid;
	}

	public Long getBatchid() {
		return batchid;
	}

	public void setBatchid(Long batchid) {
		this.batchid = batchid;
	}

	public String getSundayyn() {
		return sundayyn;
	}

	public void setSundayyn(String sundayyn) {
		this.sundayyn = sundayyn;
	}

	public String getMondayyn() {
		return mondayyn;
	}

	public void setMondayyn(String mondayyn) {
		this.mondayyn = mondayyn;
	}

	public String getTuesdayyn() {
		return tuesdayyn;
	}

	public void setTuesdayyn(String tuesdayyn) {
		this.tuesdayyn = tuesdayyn;
	}

	public String getWedbesdayyn() {
		return wedbesdayyn;
	}

	public void setWedbesdayyn(String wedbesdayyn) {
		this.wedbesdayyn = wedbesdayyn;
	}

	public String getThursdayyn() {
		return thursdayyn;
	}

	public void setThursdayyn(String thursdayyn) {
		this.thursdayyn = thursdayyn;
	}

	public String getFridayyn() {
		return fridayyn;
	}

	public void setFridayyn(String fridayyn) {
		this.fridayyn = fridayyn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLastupdatesdt() {
		if (lastupdatesdt != null) {
			return DateUtils.datetostringtime(lastupdatesdt);
		} else {
			return "";
		}
	}

	public void setLastupdatesdt(Date lastupdatesdt) {
		this.lastupdatesdt = lastupdatesdt;
	}

	public String getLastupdatesby() {
		return lastupdatesby;
	}

	public void setLastupdatesby(String lastupdatesby) {
		this.lastupdatesby = lastupdatesby;
	}

	public String getBatchname() {
		return batchname;
	}

	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}

	public String getSaturdayYn() {
		return saturdayYn;
	}

	public void setSaturdayYn(String saturdayYn) {
		this.saturdayYn = saturdayYn;
	}

}
