package com.hostel.dm.mst;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_hstl_rooms")
public class roomDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long room_id;
	private Long hostel_id;
	private Long company_id;
	private Long floor_no;
	private String room_type;

	private String room_no;
	private Long no_of_beds;
	private Long free_beds;
	private Double rental;

	private String remarks;
	private String status;
	private Date last_updated_dt;
	private String last_updated_by;
	@Transient
	private String hostelName;

	public Long getRoom_id() {
		return room_id;
	}

	public void setRoom_id(Long room_id) {
		this.room_id = room_id;
	}

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

	public Long getFloor_no() {
		return floor_no;
	}

	public void setFloor_no(Long floor_no) {
		this.floor_no = floor_no;
	}

	public String getRoom_type() {
		return room_type;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	public String getRoom_no() {
		return room_no;
	}

	public void setRoom_no(String room_no) {
		this.room_no = room_no;
	}

	public Long getNo_of_beds() {
		return no_of_beds;
	}

	public void setNo_of_beds(Long no_of_beds) {
		this.no_of_beds = no_of_beds;
	}

	public Long getFree_beds() {
		return free_beds;
	}

	public void setFree_beds(Long free_beds) {
		this.free_beds = free_beds;
	}

	public Double getRental() {
		return rental;
	}

	public void setRental(Double rental) {
		this.rental = rental;
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

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

}
