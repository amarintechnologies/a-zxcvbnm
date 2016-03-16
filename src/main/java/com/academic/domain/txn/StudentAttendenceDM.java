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
@Table(name = "t_acd_student_attendance")
public class StudentAttendenceDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "attendance_id")
	private Long attendanceid;
	@Column(name = "company_id")
	private Long companyid;
	@Column(name = "timetable_id")
	private Long timetableid;
	@Column(name = "batch_id")
	private Long batchid;
	@Column(name = "work_date")
	private Date workdate;
	@Column(name = "work_hours")
	private Long workhours;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;
	@Column(name = "course_id")
	private Long courseid;

	@Transient
	private String batch_name;
	@Transient
	private String course_name;

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

	public StudentAttendenceDM() {
	}

	public Long getAttendanceid() {
		return attendanceid;
	}

	public void setAttendanceid(Long attendanceid) {
		this.attendanceid = attendanceid;
	}

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}

	public Long getTimetableid() {
		return timetableid;
	}

	public void setTimetableid(Long timetableid) {
		this.timetableid = timetableid;
	}

	public Long getBatchid() {
		return batchid;
	}

	public void setBatchid(Long batchid) {
		this.batchid = batchid;
	}

	public Date getWorkdate() {
		return workdate;
	}

	public void setWorkdate(Date workdate) {
		this.workdate = workdate;
	}

	public Long getWorkhours() {
		return workhours;
	}

	public void setWorkhours(Long workhours) {
		this.workhours = workhours;
	}

	public void setLastupdateddt(Date lastupdateddt) {
		this.lastupdateddt = lastupdateddt;
	}

	public String getLastupdateddt() {
		if (lastupdateddt != null) {
			return DateUtils.datetostringtime(lastupdateddt);
		} else {
			return "";
		}
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

}
