package com.academic.domain.mst;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_acd_grading_dtl")
public class GradingDtlDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "grading_dtlid")
	private Long gradingDtlId;
	@Column(name = "grading_id")
	private Long gradingId;
	@Column(name = "grade_code")
	private String gradeCode;
	@Column(name = "grade_start")
	private Long gradeStart;
	@Column(name = "grade_end")
	private Long gradeEnd;
	@Column(name = "remarks")
	private String remarks;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;

	public Long getGradingDtlId() {
		return gradingDtlId;
	}

	public void setGradingDtlId(Long gradingDtlId) {
		this.gradingDtlId = gradingDtlId;
	}

	public Long getGradingId() {
		return gradingId;
	}

	public void setGradingId(Long gradingId) {
		this.gradingId = gradingId;
	}

	public String getGradeCode() {
		return gradeCode;
	}

	public void setGradeCode(String gradeCode) {
		this.gradeCode = gradeCode;
	}

	public Long getGradeStart() {
		return gradeStart;
	}

	public void setGradeStart(Long gradeStart) {
		this.gradeStart = gradeStart;
	}

	public Long getGradeEnd() {
		return gradeEnd;
	}

	public void setGradeEnd(Long gradeEnd) {
		this.gradeEnd = gradeEnd;
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
