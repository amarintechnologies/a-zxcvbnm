package com.hostel.dm.mst;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_hstl_hostel")
public class hostelDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long hostel_id;
	private Long company_id;

	private String hostel_name;

	private String hostel_type;
	private Long no_of_rooms;

	private String remarks;
	private String status;
	private Date last_updated_dt;
	private String last_updated_by;

	public Long getHostel_id() {
		return hostel_id;
	}

	public void setHostel_id(Long hostel_id) {
		this.hostel_id = hostel_id;
	}

	public Long getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Long company_id) {
		this.company_id = company_id;
	}

	public String getHostel_name() {
		return hostel_name;
	}

	public void setHostel_name(String hostel_name) {
		this.hostel_name = hostel_name;
	}

	public String getHostel_type() {
		return hostel_type;
	}

	public void setHostel_type(String hostel_type) {
		this.hostel_type = hostel_type;
	}

	public Long getNo_of_rooms() {
		return no_of_rooms;
	}

	public void setNo_of_rooms(Long no_of_rooms) {
		this.no_of_rooms = no_of_rooms;
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

	public Date getLast_updated_dt1() {
		return last_updated_dt;
	}

	public String getLast_updated_dt() {
		if (last_updated_dt != null) {
			return DateUtils.datetostringtime(last_updated_dt);
		} else {
			return "";
		}
	}

	public void setLast_updated_dt(Date last_updated_dt) {
		this.last_updated_dt = last_updated_dt;
	}

	public String getLast_updated_by() {
		return last_updated_by;
	}

	public void setLast_updated_by(String last_updated_by) {
		this.last_updated_by = last_updated_by;
	}

}
