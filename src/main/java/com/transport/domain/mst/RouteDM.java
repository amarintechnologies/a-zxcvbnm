package com.transport.domain.mst;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_trns_route")
public class RouteDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "route_id")
	private Long routeid;
	@Column(name = "company_id")
	private Long companyid;
	@Column(name = "route_name")
	private String routename;
	@Column(name = "remarks")
	private String remarks;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;
	public Long getRouteid() {
		return routeid;
	}
	public void setRouteid(Long routeid) {
		this.routeid = routeid;
	}
	public Long getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	public String getRoutename() {
		return routename;
	}
	public void setRoutename(String routename) {
		this.routename = routename;
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
	public String getLastupdateddt() {
		if (lastupdateddt != null){
			return DateUtils.datetostringtime(lastupdateddt);
		}else
		{
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
