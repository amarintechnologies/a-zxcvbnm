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
@Table(name = "t_acd_batch_subject")
public class BatchSubDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "batch_subjid")
	private Long batchsubjid;

	@Column(name = "batch_id")
	private Long batchid;

	@Column(name = "subject_id")
	private Long subjectid;

	@Column(name = "class_p_week")
	private String classpweek;

	@Column(name = "exam_yn")
	private String examyn;

	@Column(name = "max_score")
	private Long maxscore;

	@Column(name = "pass_score")
	private Long passscore;

	@Column(name = "status")
	private String status;

	@Column(name = "last_updated_dt")
	private Date lastupdateddt;

	@Column(name = "last_updated_by")
	private String lastupdatedby;

	@Transient
	private String batch_name;

	@Transient
	private String subjectName;

	public Long getMaxscore() {
		return maxscore;
	}

	public void setMaxscore(Long maxscore) {
		this.maxscore = maxscore;
	}

	public Long getPassscore() {
		return passscore;
	}

	public void setPassscore(Long passscore) {
		this.passscore = passscore;
	}

	public String getBatch_name() {
		return batch_name;
	}

	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public BatchSubDM() {
	}

	public Long getBatchsubjid() {
		return batchsubjid;
	}

	public void setBatchsubjid(Long batchsubjid) {
		this.batchsubjid = batchsubjid;
	}

	public Long getBatchid() {
		return batchid;
	}

	public void setBatchid(Long batchid) {
		this.batchid = batchid;
	}

	public Long getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(Long subjectid) {
		this.subjectid = subjectid;
	}

	public String getClasspweek() {
		return classpweek;
	}

	public void setClasspweek(String classpweek) {
		this.classpweek = classpweek;
	}

	public String getExamyn() {
		return examyn;
	}

	public void setExamyn(String examyn) {
		this.examyn = examyn;
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
