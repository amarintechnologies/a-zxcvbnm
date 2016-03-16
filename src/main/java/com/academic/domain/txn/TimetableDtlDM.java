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
@Table(name = "t_acd_timetable_dtl")
public class TimetableDtlDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ttable_dtlid")
	private Long ttabledtlid;
	@Column(name = "timetable_id")
	private Long timetableid;
	@Column(name = "work_date")
	private Date workdate;
	@Column(name = "start_time")
	private Date starttime;
	@Column(name = "end_time")
	private Date endtime;
	@Column(name = "subject_id")
	private Long subjectId;
	@Column(name = "employee_id")
	private Long employeeId;
	@Column(name = "room_id")
	private Long roomId;
	@Column(name = "holiday_yn")
	private String holidayyn;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;
	@Transient
	private String subjectName;
	@Transient
	private String firstname;
	@Transient
	private String roomName;

	public String getRoomName() {
		return roomName;
	}

	public String getfulltime() {
		if (starttime != null) {
			String starttime1 = DateUtils.datetostringHrsMnsconc(starttime);
			String endtime1 = DateUtils.datetostringHrsMnsconc(endtime);

			return starttime1 + " " + endtime1;
		} else {
			return "";
		}
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Long getTtabledtlid() {
		return ttabledtlid;
	}

	public void setTtabledtlid(Long ttabledtlid) {
		this.ttabledtlid = ttabledtlid;
	}

	public Long getTimetableid() {
		return timetableid;
	}

	public void setTimetableid(Long timetableid) {
		this.timetableid = timetableid;
	}

	public Date getWorkdateDt() {
		return workdate;
	}

	public String getWorkdate() {
		if (workdate != null) {
			return DateUtils.datetostring(workdate);
		} else {
			return "";
		}
	}

	public void setWorkdate(Date workdate) {
		this.workdate = workdate;
	}

	public Date getStarttimeDt() {
		return starttime;
	}

	public String getStarttime() {
		if (starttime != null) {
			return DateUtils.datetostringHrsMns(starttime);
		} else {
			return "";
		}
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtimeDt() {
		return endtime;
	}

	public String getEndtime() {
		if (endtime != null) {
			return DateUtils.datetostringHrsMns(endtime);
		} else {
			return "";
		}
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public String getHolidayyn() {
		return holidayyn;
	}

	public void setHolidayyn(String holidayyn) {
		this.holidayyn = holidayyn;
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

	@Override
	public String toString() {
		return "TimetableDtlDM [ttabledtlid=" + ttabledtlid + ", timetableid="
				+ timetableid + ", workdate=" + workdate + ", starttime="
				+ starttime + ", endtime=" + endtime + ", subjectId="
				+ subjectId + ", employeeId=" + employeeId + ", roomId="
				+ roomId + ", holidayyn=" + holidayyn + ", lastupdateddt="
				+ lastupdateddt + ", lastupdatedby=" + lastupdatedby
				+ ", subjectName=" + subjectName + ", firstname=" + firstname
				+ ", roomName=" + roomName + "]";
	}

}
