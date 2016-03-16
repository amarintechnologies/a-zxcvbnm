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
@Table(name = "t_acd_timetable")
public class TimetableDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "timetable_id")
	private Long timetableId;
	@Column(name = "company_id")
	private Long companyId;
	@Column(name = "batch_id")
	private Long batchId;
	@Column(name = "class_timeid")
	private Long classtimeId;
	@Column(name = "start_date")
	private Date startDate;
	@Column(name = "end_date")
	private Date endDate;
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
	private String batchname;
	@Transient
	private String timingname;
	@Transient
	private String coursename;

	public Long getCourseid() {
		return courseid;
	}

	public void setCourseid(Long courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getBatchname() {
		return batchname;
	}

	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}

	public String getTimingname() {
		return timingname;
	}

	public void setTimingname(String timingname) {
		this.timingname = timingname;
	}

	public Long getTimetableId() {
		return timetableId;
	}

	public void setTimetableId(Long timetableId) {
		this.timetableId = timetableId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public Long getClasstimeId() {
		return classtimeId;
	}

	public void setClasstimeId(Long classtimeId) {
		this.classtimeId = classtimeId;
	}

	public Date getStartDateDt() {
		return startDate;
	}

	public String getStartDate() {

		if (startDate != null) {
			return DateUtils.datetostringtime(startDate);
		} else {
			return "";
		}
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDateDt() {
		return endDate;
	}

	public String getEndDate() {
		if (endDate != null) {
			return DateUtils.datetostringtime(endDate);
		} else {
			return "";
		}
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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

}
