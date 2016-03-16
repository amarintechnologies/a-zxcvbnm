package com.academic.domain.txn;

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
@Table(name = "t_acd_classtiming_dtl")
public class ClasstimingdtlDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "class_timedtlid")
	private Long classtimedtlid;
	@Column(name = "class_timeid")
	private Long classtimeid;
	@Column(name = "ref_name")
	private String refname;
	@Column(name = "start_time")
	private Date starttime;
	@Column(name = "end_time")
	private Date endtime;
	@Column(name = "break_yn")
	private String breakyn;
	@Column(name = "remarks")
	private String remarks;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;

	@Transient
	private String timingname;
	
	@Transient
	private String startStringtime;
	
	@Transient
	private String endStringtime;

	
	public String getStartStringtime() {
		if (starttime != null) {
			return DateUtils.datetostringHrsMns(starttime);
		} else {
			return "";
		}
	}

	public void setStartStringtime(String startStringtime) {
		this.startStringtime = startStringtime;
	}

	public String getEndStringtime() {
		if (endtime != null) {
			return DateUtils.datetostringHrsMns(endtime);
		} else {
			return "";
		}
	}

	public void setEndStringtime(String endStringtime) {
		this.endStringtime = endStringtime;
	}

	public Long getClasstimedtlid() {
		return classtimedtlid;
	}

	public void setClasstimedtlid(Long classtimedtlid) {
		this.classtimedtlid = classtimedtlid;
	}

	public Long getClasstimeid() {
		return classtimeid;
	}

	public void setClasstimeid(Long classtimeid) {
		this.classtimeid = classtimeid;
	}

	public String getRefname() {
		return refname;
	}

	public void setRefname(String refname) {
		this.refname = refname;
	}

	public Date getStarttime() {

		/*if (starttime != null) {
			return DateUtils.datetostringHrsMns(starttime);
		} else {
			return "";
		}*/

		 return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public String getStarttime1() {
		if (starttime != null) {
			return DateUtils.datetostringHrsMns(starttime);
		} else {
			return "";
		}
	}

	public Date getEndtime() {

		/*if (endtime != null) {
			return DateUtils.datetostringHrsMns(endtime);
		} else {
			return "";
		}*/

		 return endtime;
	}

	public String getEndtime1() {
		if (endtime != null) {
			return DateUtils.datetostringHrsMns(endtime);
		} else {
			return "";
		}
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getBreakyn() {
		return breakyn;
	}

	public void setBreakyn(String breakyn) {
		this.breakyn = breakyn;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	public String getTimingname() {
		return timingname;
	}

	public void setTimingname(String timingname) {
		this.timingname = timingname;
	}

}