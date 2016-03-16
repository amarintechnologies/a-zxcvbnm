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
@Table(name = " m_acd_room")
public class RoomsDM {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "room_id")
	private Long roomId;

	@Column(name = "building_id")
	private Long buildingId;
	@Column(name = "room_name")
	private String roomName;
	@Column(name = "seat_capacity")
	private Long seatCapacity;
	@Column(name = "remarks")
	private String remarks;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastUpdatedDt;

	@Column(name = "last_updated_by")
	private String lastUpdatedBy;

	public Long getRoomId() {
		return roomId;
	}

	public Long getBuildingId() {
		return buildingId;
	}

	public String getRoomName() {
		return roomName;
	}

	public Long getSeatCapacity() {
		return seatCapacity;
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

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public void setBuildingId(Long buildingId) {
		this.buildingId = buildingId;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public void setSeatCapacity(Long seatCapacity) {
		this.seatCapacity = seatCapacity;
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
