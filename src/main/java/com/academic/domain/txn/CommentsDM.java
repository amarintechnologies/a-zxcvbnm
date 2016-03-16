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
@Table(name ="t_acd_comments")
public class CommentsDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="comments_id")
	private Long commentsId;
	@Column(name ="student_id")
	private Long studentId;
	@Column(name ="comment_title")
	private String commentTitle;
	@Column(name ="remarks")
	private String remarks;
	@Column(name ="status")
	private String status;
	@Column(name ="last_updated_dt")
	private Date updatedDt;
	@Column(name ="last_updated_by")
	private String updatedBy;
	@Transient
	private String studentName;
	
	public String getCommentTitle() {
		return commentTitle;
	}
	public void setCommentTitle(String commentTitle) {
		this.commentTitle = commentTitle;
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
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Long getCommentsId() {
		return commentsId;
	}
	public void setCommentsId(Long commentsId) {
		this.commentsId = commentsId;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
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
	
}
