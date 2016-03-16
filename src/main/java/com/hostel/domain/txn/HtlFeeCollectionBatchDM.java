package com.hostel.domain.txn;

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
@Table(name = "t_hstl_fee_colctn_batch")
public class HtlFeeCollectionBatchDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fee_colbtchid")
	private Long feecolbatchid;
	@Column(name = "fee_colid")
	private Long feecolid;
	@Column(name = "course_id")
	private Long courseid;
	@Column(name = "batch_id")
	private Long batchid;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;
	@Transient
	private String course_name;
	@Transient
	private String batch_name;

	public Long getFeecolbatchid() {
		return feecolbatchid;
	}

	public void setFeecolbatchid(Long feecolbatchid) {
		this.feecolbatchid = feecolbatchid;
	}

	public Long getFeecolid() {
		return feecolid;
	}

	public void setFeecolid(Long feecolid) {
		this.feecolid = feecolid;
	}

	public Long getCourseid() {
		return courseid;
	}

	public void setCourseid(Long courseid) {
		this.courseid = courseid;
	}

	public Long getBatchid() {
		return batchid;
	}

	public void setBatchid(Long batchid) {
		this.batchid = batchid;
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

}
