package com.academic.domain.mst;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_acd_course")
public class AcdCourseDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long course_id;
	private Long company_id;
	private String course_name;
	private String section_name;
	private String course_code;
	private String grading_type;
	private String elective_yn;
	private String course_status;
	private Date last_updated_dt;
	private String last_updated_by;

	public Long getCourse_id() {
		return course_id;
	}

	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
	}

	public Long getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Long company_id) {
		this.company_id = company_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getSection_name() {
		return section_name;
	}

	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}

	public String getCourse_code() {
		return course_code;
	}

	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}

	public String getGrading_type() {
		return grading_type;
	}

	public void setGrading_type(String grading_type) {
		this.grading_type = grading_type;
	}

	public String getElective_yn() {
		return elective_yn;
	}

	public void setElective_yn(String elective_yn) {
		this.elective_yn = elective_yn;
	}

	public String getCourse_status() {
		return course_status;
	}

	public void setCourse_status(String course_status) {
		this.course_status = course_status;
	}

	public String getLast_updated_dt() {
		if (last_updated_dt != null) {
			return DateUtils.datetostringtime(last_updated_dt);
		} else {
			return "";
		}
	}

	public void setLast_updated_dt(Date last_updated_dt) {
		this.last_updated_dt = last_updated_dt;
	}

	public String getLast_updated_by() {
		return last_updated_by;
	}

	public void setLast_updated_by(String last_updated_by) {
		this.last_updated_by = last_updated_by;
	}

}
