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
@Table(name = "t_acd_batch_exams_students")
public class BatchExamStudentDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "exam_studntid")
	private Long exStudId;
	@Column(name = "exam_subjtid")
	private Long exsubjId;
	@Column(name = "student_id")
	private Long studId;
	@Column(name = "exam_date")
	private Date examDate;
	@Column(name = "present_yn")
	private String presYN;
	@Column(name = "result_date")
	private Date resDate;
	@Column(name = "grading_id")
	private Long gradeId;
	@Column(name = "mark_scored")
	private Long markScore;
	@Column(name = "pass_yn")
	private String passYN;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date updatedDt;
	@Column(name = "last_updated_by")
	private String updatedBy;
	@Column(name = "course_id")
	private Long courseId;
	@Column(name = "grading_dtlid")
	private Long gradingDtlId;

	@Transient
	private String gradeName;
	@Transient
	private String studentName;
	@Transient
	private String courseName;

	@Transient
	private String subjectName;

	public Long getExStudId() {
		return exStudId;
	}

	public void setExStudId(Long exStudId) {
		this.exStudId = exStudId;
	}

	public Long getStudId() {
		return studId;
	}

	public void setStudId(Long studId) {
		this.studId = studId;
	}

	public Date getExamDateDt() {
		return examDate;
	}

	public String getExamDate() {

		if (examDate != null) {
			return DateUtils.datetostring(examDate);
		} else {
			return "";
		}
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public String getPresYN() {
		return presYN;
	}

	public void setPresYN(String presYN) {
		this.presYN = presYN;
	}

	public Date getResDate() {
		return resDate;
	}

	public void setResDate(Date resDate) {
		this.resDate = resDate;
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public Long getMarkScore() {
		return markScore;
	}

	public void setMarkScore(Long markScore) {
		this.markScore = markScore;
	}

	public String getPassYN() {
		return passYN;
	}

	public void setPassYN(String passYN) {
		this.passYN = passYN;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUpdatedDt() {
		if (updatedDt != null) {
			return DateUtils.datetostringtime(updatedDt);
		} else {
			return "";
		}
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Long getExsubjId() {
		return exsubjId;
	}

	public void setExsubjId(Long exsubjId) {
		this.exsubjId = exsubjId;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Long getGradingDtlId() {
		return gradingDtlId;
	}

	public void setGradingDtlId(Long gradingDtlId) {
		this.gradingDtlId = gradingDtlId;
	}

}
