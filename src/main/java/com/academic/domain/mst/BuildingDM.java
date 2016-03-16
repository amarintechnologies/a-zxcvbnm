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
@Table(name = "m_acd_building")
public class BuildingDM {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "building_id")
	private Long buildingId;
	@Column(name = "company_id")
	private Long companyId;
	@Column(name = "building_name")
	private String buildingName;
	@Column(name = "no_of_rooms")
	private Long noOfRooms;
	@Column(name = "remarks")
	private String remarks;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastUpdatedDt;

	@Column(name = "last_updated_by")
	private String lastUpdatedBy;

	public Long getBuildingId() {
		return buildingId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public Long getNoOfRooms() {
		return noOfRooms;
	}

	public String getRemarks() {
		return remarks;
	}

	public String getStatus() {
		return status;
	}

	public String getLastUpdatedDt() {
		if (lastUpdatedDt != null) {
			return DateUtils.datetostringtime(lastUpdatedDt);
		} else {
			return "";
		}
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setBuildingId(Long buildingId) {
		this.buildingId = buildingId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public void setNoOfRooms(Long noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setLastUpdatedDt(Date lastUpdatedDt) {
		this.lastUpdatedDt = lastUpdatedDt;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

}
