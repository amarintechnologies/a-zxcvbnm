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
@Table(name = "m_trns_vehicle")
public class VehicleDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "vehicle_id")
	private Long vehiclid;
	@Column(name = "company_id")
	private Long companyid;
	@Column(name = "vehicle_no")
	private String vehicleno;
	@Column(name = "route_id")
	private Long routeid;
	@Column(name = "no_of_seats")
	private Long noofseats;
	@Column(name = "status")
	private String status;
	@Column(name = "available_seats")
	private Long availableseats;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;

	@Transient
	private String routename;

	public Long getAvailableseats() {
		return availableseats;
	}

	public void setAvailableseats(Long availableseats) {
		this.availableseats = availableseats;
	}

	public Long getVehiclid() {
		return vehiclid;
	}

	public void setVehiclid(Long vehiclid) {
		this.vehiclid = vehiclid;
	}

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}

	public String getVehicleno() {
		return vehicleno;
	}

	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}

	public Long getRouteid() {
		return routeid;
	}

	public void setRouteid(Long routeid) {
		this.routeid = routeid;
	}

	public Long getNoofseats() {
		return noofseats;
	}

	public void setNoofseats(Long noofseats) {
		this.noofseats = noofseats;
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

	public String getRoutename() {
		return routename;
	}

	public void setRoutename(String routename) {
		this.routename = routename;
	}

}
