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
@Table(name = "m_acd_grade_section")
public class GradeSectionDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "gradesectn_id")
	private Long gradeSectnId;
	@Column(name = "company_id")
	private Long companyId;
	@Column(name = "gradesectn_name")
	private String gradeSecName;
	@Column(name = "no_of_seats")
	private Long NoOfSeats;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;
	@Column(name = "course_id")
	private Long courseId;
	@Transient
	private String course_name;

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Long getGradeSectnId() {
		return gradeSectnId;
	}

	public void setGradeSectnId(Long gradeSectnId) {
		this.gradeSectnId = gradeSectnId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getGradeSecName() {
		return gradeSecName;
	}

	public void setGradeSecName(String gradeSecName) {
		this.gradeSecName = gradeSecName;
	}

	public Long getNoOfSeats() {
		return NoOfSeats;
	}

	public void setNoOfSeats(Long noOfSeats) {
		NoOfSeats = noOfSeats;
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
			return null;
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
