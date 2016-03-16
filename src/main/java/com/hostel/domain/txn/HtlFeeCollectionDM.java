package com.hostel.domain.txn;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.erputil.util.DateUtils;

@Entity
@Table(name = "t_hstl_fee_colctn")
public class HtlFeeCollectionDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fee_colid")
	private Long feecolid;
	@Column(name = "start_date")
	private Date startdate;
	@Column(name = "end_date")
	private Date enddate;
	@Column(name = "due_date")
	private Date duedate;
	@Column(name = "remarks")
	private String remarks;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;

	public Long getFeecolid() {
		return feecolid;
	}

	public void setFeecolid(Long feecolid) {
		this.feecolid = feecolid;
	}

	public String getStartdate() {
		if (startdate != null) {
			return DateUtils.datetostring(startdate);
		} else {
			return "";
		}
	}

	public Date getStartdatedt() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		if (enddate != null) {
			return DateUtils.datetostring(enddate);
		} else {
			return "";
		}
	}

	public Date getEnddatedt() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getDuedate() {
		if (duedate != null) {
			return DateUtils.datetostring(duedate);
		} else {
			return "";
		}
	}

	public Date getDuedatedt() {
		return duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
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
