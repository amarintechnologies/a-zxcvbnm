package com.academic.domain.txn;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "t_acd_batch_internal_types")
public class BatchInternalTypesDM {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "internal_typeid")
	private Long internalTypeid;
	@Column(name = "batch_id")
	private Long batchId;
	@Column(name = "internl_name")
	private String internlName;
	@Column(name = "max_score")
	private Long maxScore;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date updatedDt;
	@Column(name = "last_updated_by")
	private String updatedBy;

	@Transient
	private String batchName;

	public Long getInternalTypeid() {
		return internalTypeid;
	}

	public Long getBatchId() {
		return batchId;
	}

	public String getInternlName() {
		return internlName;
	}

	public Long getMaxScore() {
		return maxScore;
	}

	public String getStatus() {
		return status;
	}

	public Date getUpdatedDt() {
		return updatedDt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setInternalTypeid(Long internalTypeid) {
		this.internalTypeid = internalTypeid;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public void setInternlName(String internlName) {
		this.internlName = internlName;
	}

	public void setMaxScore(Long maxScore) {
		this.maxScore = maxScore;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

}
