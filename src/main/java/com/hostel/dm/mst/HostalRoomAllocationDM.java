package com.hostel.dm.mst;

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
@Table(name ="t_hstl_room_allocation")
public class HostalRoomAllocationDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="room_allcid")
	private Long rmAllId;
	@Column(name ="hostel_id")
	private Long hostId;
	@Column(name ="room_id")
	private Long roomId;
	@Column(name ="batch_id")
	private Long batchId;
	@Column(name ="student_id")
	private Long studId;
	@Column(name ="start_date")
	private Date startDt;
	@Column(name ="end_date")
	private Date endDt;
	@Column(name ="remarks")
	private String remarks;
	@Column(name ="status")
	private String status;
	@Column(name ="last_updated_dt")
	private Date updatedDt;
	@Column(name ="last_updated_by")
	private String updatedBy;
	@Transient
	private String hostalName;
	@Transient
	private String roomNo;
	@Transient
	private String batchName;
	@Transient
	private String studentName;
	public Long getRmAllId() {
		return rmAllId;
	}
	public void setRmAllId(Long rmAllId) {
		this.rmAllId = rmAllId;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Long getHostId() {
		return hostId;
	}
	public void setHostId(Long hostId) {
		this.hostId = hostId;
	}
	public Long getRoomId() {
		return roomId;
	}
	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}
	public Long getBatchId() {
		return batchId;
	}
	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}
	public Long getStudId() {
		return studId;
	}
	public void setStudId(Long studId) {
		this.studId = studId;
	}
	public Date getStartDt() {
		return startDt;
	}
	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}
	public Date getEndDt() {
		return endDt;
	}
	public void setEndDt(Date endDt) {
		this.endDt = endDt;
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
	public String getHostalName() {
		return hostalName;
	}
	public void setHostalName(String hostalName) {
		this.hostalName = hostalName;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	
}
