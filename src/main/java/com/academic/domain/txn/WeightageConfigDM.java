package com.academic.domain.txn;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_acd_batch_weightage_conf")
public class WeightageConfigDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "weightage_id")
	private Long weightage_id;
	@Column(name = "batch_id")
	private Long batchId;
	@Column(name = "exam_wtge")
	private Long weightage;
	@Column(name = "intrnl_wtge")
	private Long internlweghtage;
	@Column(name = "quiz_wtge")
	private Long quizWtge;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;

	public Long getWeightage_id() {
		return weightage_id;
	}

	public Long getBatchId() {
		return batchId;
	}

	public Long getWeightage() {
		return weightage;
	}

	public Long getInternlweghtage() {
		return internlweghtage;
	}

	public Long getQuizWtge() {
		return quizWtge;
	}

	public String getStatus() {
		return status;
	}

	public Date getLastupdateddt() {
		return lastupdateddt;
	}

	public String getLastupdatedby() {
		return lastupdatedby;
	}

	public void setWeightage_id(Long weightage_id) {
		this.weightage_id = weightage_id;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public void setWeightage(Long weightage) {
		this.weightage = weightage;
	}

	public void setInternlweghtage(Long internlweghtage) {
		this.internlweghtage = internlweghtage;
	}

	public void setQuizWtge(Long quizWtge) {
		this.quizWtge = quizWtge;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setLastupdateddt(Date lastupdateddt) {
		this.lastupdateddt = lastupdateddt;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}

}
