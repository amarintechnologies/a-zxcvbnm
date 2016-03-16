package com.academic.domain.mst;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.erputil.util.DateUtils;


@Entity
@Table(name = "m_acd_decease")
public class AcdDeceaseDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "decease_id")
	private Long deceaseid;
	@Column(name = "decease_name")
	private String deceasename;
	@Column(name = "company_id")
	private Long companyId;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date updatedDt;
	@Column(name = "last_updated_by")
	private String updatedBy;

	public AcdDeceaseDM() {
	}

	public Long getDeceaseid() {
		return deceaseid;
	}

	public void setDeceaseid(Long deceaseid) {
		this.deceaseid = deceaseid;
	}

	public String getDeceasename() {
		return deceasename;
	}

	public void setDeceasename(String deceasename) {
		this.deceasename = deceasename;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
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

}
