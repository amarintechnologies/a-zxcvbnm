package com.academic.domain.txn;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_acd_batch_group_dtl")
public class AcdBatchGroupDtlDM {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "batch_grpdtlid")
	private Long batchGrpdtlId;

	@Column(name = "batch_grpid")
	private Long batchGrpid;

	@Column(name = "batch_id")
	private Long batchId;

	@Column(name = "batch_grpdtlsts")
	private String batchGrpDtlStatus;

	@Column(name = "last_updated_dt")
	private Date lastUpdatedDt;

	@Column(name = "last_updated_by")
	private String lastUpdatedBy;

	public Long getBatchGrpdtlId() {
		return batchGrpdtlId;
	}

	public void setBatchGrpdtlId(Long batchGrpdtlId) {
		this.batchGrpdtlId = batchGrpdtlId;
	}

	public Long getBatchGrpid() {
		return batchGrpid;
	}

	public void setBatchGrpid(Long batchGrpid) {
		this.batchGrpid = batchGrpid;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public String getBatchGrpDtlStatus() {
		return batchGrpDtlStatus;
	}

	public void setBatchGrpDtlStatus(String batchGrpDtlStatus) {
		this.batchGrpDtlStatus = batchGrpDtlStatus;
	}

	public Date getLastUpdatedDt() {
		return lastUpdatedDt;
	}

	public void setLastUpdatedDt(Date lastUpdatedDt) {
		this.lastUpdatedDt = lastUpdatedDt;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

}
