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
@Table(name = "t_acd_batch_exams")
public class BatchExamDM {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "batch_examid")
	private Long batchExamId;
	@Column(name = "batch_id")
	private Long batchId;
	@Column(name = "exam_name")
	private String examName;
	@Column(name = "start_date")
	private Date startDate;
	@Column(name = "end_date")
	private Date endDate;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastupdatesdt;
	@Column(name = "last_updated_by")
	private String lastupdatesby;
	@Column(name = "course_id")
	private Long courseId;

	@Transient
	private String batchname;

	@Transient
	private String course_name;

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public Long getBatchExamId() {
		return batchExamId;
	}

	public Long getBatchId() {
		return batchId;
	}

	public String getExamName() {
		return examName;
	}

	public String getStartDate() {
		if (startDate != null) {
			return DateUtils.datetostring(startDate);
		} else {
			return "";
		}
	}

	public Date getStartDateDt() {
		return startDate;
	}

	public String getEndDate() {
		if (endDate != null) {
			return DateUtils.datetostring(endDate);
		} else {
			return "";
		}
	}

	public Date getEndDateDt() {
		return endDate;
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

	public String getBatchname() {
		return batchname;
	}

	public void setBatchExamId(Long batchExamId) {
		this.batchExamId = batchExamId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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

	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

}
