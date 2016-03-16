package com.academic.domain.txn;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_acd_batch_group")
public class AcdBatchGroupDM {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "batch_grpid")
	private Long batchGrpid;

	@Column(name = "company_id")
	private Long companyId;

	@Column(name = "group_name")
	private String groupName;

	@Column(name = "batch_grpstatus")
	private String batchGrpstatus;

	@Column(name = "last_updated_dt")
	private Date lastUpdatedDt;
	@Column(name = "last_updated_by")
	private String lastUpdatedBy;

	public Long getBatchGrpid() {
		return batchGrpid;
	}

	public void setBatchGrpid(Long batchGrpid) {
		this.batchGrpid = batchGrpid;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getBatchGrpstatus() {
		return batchGrpstatus;
	}

	public void setBatchGrpstatus(String batchGrpstatus) {
		this.batchGrpstatus = batchGrpstatus;
	}

	public String getLastUpdatedDt() {
		//return lastUpdatedDt;
		if (lastUpdatedDt != null) {
			return DateUtils.datetostringtime(lastUpdatedDt);
		} else {
			return "";
		}
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
