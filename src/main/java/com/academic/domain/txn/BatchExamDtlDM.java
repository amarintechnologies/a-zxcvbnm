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
@Table(name = "t_acd_batch_exams_subject")
public class BatchExamDtlDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "exam_subjtid")
	private Long examSubjId;
	@Column(name = "batch_examid")
	private Long batchExamId;
	@Column(name = "subject_id")
	private Long subjectId;
	@Column(name = "exam_date")
	private Date examDate;
	@Column(name = "start_time")
	private Date startTime;
	@Column(name = "end_time")
	private Date endTime;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastupdatesdt;
	@Column(name = "last_updated_by")
	private String lastupdatesby;

	@Transient
	private String subjectName;

	public Long getExamSubjId() {
		return examSubjId;
	}

	public void setExamSubjId(Long examSubjId) {
		this.examSubjId = examSubjId;
	}

	public Long getBatchExamId() {
		return batchExamId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public String getExamDate() {

		if (examDate != null) {
			return DateUtils.datetostring(examDate);
		} else {
			return "";
		}
	}

	public Date getExamDateDt() {
		return examDate;
	}

	public String getStatus() {
		return status;
	}

	public String getLastupdatesdt() {

		if (lastupdatesdt != null) {
			return DateUtils.datetostringtime(lastupdatesdt);
		} else {
			return "";
		}

	}

	public String getLastupdatesby() {
		return lastupdatesby;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setBatchExamId(Long batchExamId) {
		this.batchExamId = batchExamId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setLastupdatesdt(Date lastupdatesdt) {
		this.lastupdatesdt = lastupdatesdt;
	}

	public void setLastupdatesby(String lastupdatesby) {
		this.lastupdatesby = lastupdatesby;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getStartTime() {
		if (startTime != null) {
			return DateUtils.datetostringHrsMns(startTime);
		} else {
			return "";
		}
	}

	public Date getStartTimeDt() {
		return startTime;
	}

	public Date getEndTimeDt() {
		return endTime;
	}

	public String getEndTime() {
		if (endTime != null) {
			return DateUtils.datetostringHrsMns(endTime);
		} else {
			return "";
		}
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

}
