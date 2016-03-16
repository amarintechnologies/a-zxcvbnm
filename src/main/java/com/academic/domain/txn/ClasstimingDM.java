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
@Table(name = "t_acd_classtiming")
public class ClasstimingDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "class_timeid")
	private Long classtimeid;
	@Column(name = "company_id")
	private Long companyid;
	@Column(name = "timing_name")
	private String timingname;
	@Column(name = "batch_id")
	private Long batchid;
	@Column(name = "remarks")
	private String remarks;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;
	@Column(name = "course_id")
	private Long courseid;
	
	@Transient
	private String course_name;
	
	
	@Transient
	private String batch_name;


	public Long getClasstimeid() {
		return classtimeid;
	}
	public void setClasstimeid(Long classtimeid) {
		this.classtimeid = classtimeid;
	}
	public Long getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	
	public String getTimingname() {
		return timingname;
	}
	public void setTimingname(String timingname) {
		this.timingname = timingname;
	}
	public Long getBatchid() {
		return batchid;
	}
	public void setBatchid(Long batchid) {
		this.batchid = batchid;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLastupdateddt() {
		if (lastupdateddt != null) {
			return DateUtils.datetostringtime(lastupdateddt);
		} else {
			return "";
		}
	}
	public void setLastupdateddt(Date lastupdateddt) {
		this.lastupdateddt = lastupdateddt;
	}
	public String getLastupdatedby() {
		return lastupdatedby;
	}
	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}
	public String getBatch_name() {
		return batch_name;
	}
	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}
	public Long getCourseid() {
		return courseid;
	}
	public void setCourseid(Long courseid) {
		this.courseid = courseid;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	
	
	
}
