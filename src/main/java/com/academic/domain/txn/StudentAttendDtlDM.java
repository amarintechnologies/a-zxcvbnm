package com.academic.domain.txn;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.transaction.annotation.Transactional;

import com.erputil.util.DateUtils;

@Entity
@Table(name = "t_acd_student_attendance_dtl")
public class StudentAttendDtlDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "attndnce_dtlid")
	private Long attendancedtlid;
	@Column(name = "attendance_id")
	private Long attendanceid;
	@Column(name = "ttable_dtlid")
	private Long timetableDtlid;
	@Column(name = "subject_id")
	private Long subjectid;
	@Column(name = "student_id")
	private Long studentid;
	@Column(name = "present_yn")
	private String presentyn;
	@Column(name = "employee_id")
	private Long teacherid;
	@Column(name = "time")
	private String time;

	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;

	@Transient
	private String subjectname;
	@Transient
	private String firstName;
	@Transient
	private String teachername;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Long getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(Long teacherid) {
		this.teacherid = teacherid;
	}

	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

	public Long getAttendancedtlid() {
		return attendancedtlid;
	}

	public void setAttendancedtlid(Long attendancedtlid) {
		this.attendancedtlid = attendancedtlid;
	}

	public Long getAttendanceid() {
		return attendanceid;
	}

	public void setAttendanceid(Long attendanceid) {
		this.attendanceid = attendanceid;
	}

	public Long getTimetableDtlid() {
		return timetableDtlid;
	}

	public void setTimetableDtlid(Long timetableDtlid) {
		this.timetableDtlid = timetableDtlid;
	}

	public Long getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(Long subjectid) {
		this.subjectid = subjectid;
	}

	public Long getStudentid() {
		return studentid;
	}

	public void setStudentid(Long studentid) {
		this.studentid = studentid;
	}

	public String getPresentyn() {
		return presentyn;
	}

	public void setPresentyn(String presentyn) {
		this.presentyn = presentyn;
	}

	public Date getLastupdateddt1() {
		return lastupdateddt;
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

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
