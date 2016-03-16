package com.transport.domain.mst;

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
@Table(name = "m_trns_route_stops")
public class RouteStopsDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rtstop_id")
	private Long rtstopid;
	@Column(name = "route_id")
	private Long routeid;
	@Column(name = "stop_name")
	private String stopname;
	@Column(name = "student_fee")
	private Double studentfee;
	@Column(name = "staff_fee")
	private Double staffee;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;

	public Double getStudentfee() {
		return studentfee;
	}

	public void setStudentfee(Double studentfee) {
		this.studentfee = studentfee;
	}

	public Double getStaffee() {
		return staffee;
	}

	public void setStaffee(Double staffee) {
		this.staffee = staffee;
	}

	public RouteStopsDM() {
	}

	public Long getRouteid() {
		return routeid;
	}

	public void setRouteid(Long routeid) {
		this.routeid = routeid;
	}

	public Long getRtstopid() {
		return rtstopid;
	}

	public void setRtstopid(Long rtstopid) {
		this.rtstopid = rtstopid;
	}

	public String getStopname() {
		return stopname;
	}

	public void setStopname(String stopname) {
		this.stopname = stopname;
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

}
