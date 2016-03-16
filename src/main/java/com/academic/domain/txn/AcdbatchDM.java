package com.academic.domain.txn;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.erputil.util.DateUtils;

@Entity
@Table(name = "t_acd_batch")
public class AcdbatchDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long batch_id;
	private Long company_id;
	private Long course_id;

	private Long grading_id;

	private String batch_name;
	private Date start_date;
	private Date end_date;
	private String batch_year;
	private String prevsubjt_yn;
	private String prevfee_yn;
	private String batch_status;
	private Date last_updated_dt;
	private String last_updated_by;
	@Transient
	private String course_name;
	@Transient
	private String gradeName;

	public Long getGrading_id() {
		return grading_id;
	}

	public void setGrading_id(Long grading_id) {
		this.grading_id = grading_id;
	}

	public String getBatch_year() {
		return batch_year;
	}

	public void setBatch_year(String batch_year) {
		this.batch_year = batch_year;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public Long getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(Long batch_id) {
		this.batch_id = batch_id;
	}

	public Long getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Long company_id) {
		this.company_id = company_id;
	}

	public Long getCourse_id() {
		return course_id;
	}

	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
	}

	public String getBatch_name() {
		return batch_name;
	}

	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public String getPrevsubjt_yn() {
		return prevsubjt_yn;
	}

	public void setPrevsubjt_yn(String prevsubjt_yn) {
		this.prevsubjt_yn = prevsubjt_yn;
	}

	public String getPrevfee_yn() {
		return prevfee_yn;
	}

	public void setPrevfee_yn(String prevfee_yn) {
		this.prevfee_yn = prevfee_yn;
	}

	public String getBatch_status() {
		return batch_status;
	}

	public void setBatch_status(String batch_status) {
		this.batch_status = batch_status;
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
