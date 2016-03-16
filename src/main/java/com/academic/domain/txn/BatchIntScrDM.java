package com.academic.domain.txn;

import java.math.BigDecimal;
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
@Table(name = "t_acd_batch_intrnl_score")
public class BatchIntScrDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "intrnl_scoreid")
	private Long intrnlscoreId;
	@Column(name = "course_id")
	private Long courseId;
	@Column(name = "batch_id")
	private Long batchId;
	@Column(name = "internal_typeid")
	private Long internaltypeId;
	@Column(name = "student_id")
	private Long studentId;
	@Column(name = "score")
	private BigDecimal score;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;
	@Column(name = "quiz_id")
	private Long quizid;
	@Transient
	private String course_name;
	@Transient
	private String batch_name;
	@Transient
	private String firstName;
	@Transient
	private String internlName;
	@Transient
	private String quizName;

	public String getQuizName() {
		return quizName;
	}

	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}

	public Long getQuizid() {
		return quizid;
	}

	public void setQuizid(Long quizid) {
		this.quizid = quizid;
	}

	public String getInternlName() {
		return internlName;
	}

	public void setInternlName(String internlName) {
		this.internlName = internlName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getBatch_name() {
		return batch_name;
	}

	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Long getIntrnlscoreId() {
		return intrnlscoreId;
	}

	public void setIntrnlscoreId(Long intrnlscoreId) {
		this.intrnlscoreId = intrnlscoreId;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public Long getInternaltypeId() {
		return internaltypeId;
	}

	public void setInternaltypeId(Long internaltypeId) {
		this.internaltypeId = internaltypeId;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
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
