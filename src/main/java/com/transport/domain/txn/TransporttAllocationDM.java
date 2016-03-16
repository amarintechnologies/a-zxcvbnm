package com.transport.domain.txn;

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
@Table(name = "t_trns_allocation")
public class TransporttAllocationDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "trns_allcid")
	private Long trnsAllcid;

	@Column(name = "route_id")
	private Long routeId;

	@Column(name = "rtstop_id")
	private Long rootStopId;

	@Column(name = "batch_id")
	private Long batchId;

	@Column(name = "student_id")
	private Long studId;

	@Column(name = "employee_id")
	private Long empId;

	@Column(name = "start_date")
	private Date startDt;
	@Column(name = "end_date")
	private Date endDt;
	@Column(name = "remarks")
	private String remarks;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date updatedDt;
	@Column(name = "last_updated_by")
	private String updatedBy;
	@Transient
	private String routename;
	@Transient
	private String batchName;
	@Transient
	private String studentName;
	@Transient
	private String stopName;
	@Transient
	private String firstname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getStopName() {
		return stopName;
	}

	public void setStopName(String stopName) {
		this.stopName = stopName;
	}

	public Long getTrnsAllcid() {
		return trnsAllcid;
	}

	public Long getRouteId() {
		return routeId;
	}

	public Long getRootStopId() {
		return rootStopId;
	}

	public Long getBatchId() {
		return batchId;
	}

	public Long getStudId() {
		return studId;
	}

	public Long getEmpId() {
		return empId;
	}

	public Date getStartDt() {
		return startDt;
	}

	public Date getEndDt() {
		return endDt;
	}

	public String getRemarks() {
		return remarks;
	}

	public String getStatus() {
		return status;
	}

	public String getUpdatedDt() {
		if (updatedDt != null) {
			return DateUtils.datetostringtime(updatedDt);
		} else {
			return "";
		}
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setTrnsAllcid(Long trnsAllcid) {
		this.trnsAllcid = trnsAllcid;
	}

	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}

	public void setRootStopId(Long rootStopId) {
		this.rootStopId = rootStopId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public void setStudId(Long studId) {
		this.studId = studId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	public String getBatchName() {
		return batchName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRoutename() {
		return routename;
	}

	public void setRoutename(String routename) {
		this.routename = routename;
	}

}
