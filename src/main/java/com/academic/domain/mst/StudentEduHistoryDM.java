package com.academic.domain.mst;

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
@Table(name = "m_acd_student_edu_history")
public class StudentEduHistoryDM {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "studnt_histid")
	private Long studntHistId;
	@Column(name = "student_id")
	private Long studentId;
	@Column(name = "institut_name")
	private String institutName;

	@Column(name = "course_name")
	private String courseName;

	@Column(name = "pass_year")
	private String passYear;

	@Column(name = "grade")
	private String grade;

	@Column(name = "total_score")
	private String totalScore;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastUpdatedDt;

	@Column(name = "last_updated_by")
	private String lastUpdatedBy;

	@Transient
	private String StudName;

	public Long getStudntHistId() {
		return studntHistId;
	}

	public Long getStudentId() {
		return studentId;
	}

	public String getInstitutName() {
		return institutName;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getPassYear() {
		return passYear;
	}

	public String getGrade() {
		return grade;
	}

	public String getTotalScore() {
		return totalScore;
	}

	public String getStatus() {
		return status;
	}

	public String getLastUpdatedDt() {
		if (lastUpdatedDt != null) {
			return DateUtils.datetostringtime(lastUpdatedDt);
		} else {
			return "";
		}
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public String getStudName() {
		return StudName;
	}

	public void setStudntHistId(Long studntHistId) {
		this.studntHistId = studntHistId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public void setInstitutName(String institutName) {
		this.institutName = institutName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setPassYear(String passYear) {
		this.passYear = passYear;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setTotalScore(String totalScore) {
		this.totalScore = totalScore;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setLastUpdatedDt(Date lastUpdatedDt) {
		this.lastUpdatedDt = lastUpdatedDt;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public void setStudName(String studName) {
		StudName = studName;
	}

}
