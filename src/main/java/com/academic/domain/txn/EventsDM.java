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
@Table(name ="t_acd_events")
public class EventsDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="event_id")
	private Long eventId;
	@Column(name ="company_id")
	private Long compId;
	@Column(name ="employee_id")
	private Long empId;
	@Column(name ="student_id")
	private Long studId;
	@Column(name ="event_date")
	private Date eventDt;
	@Column(name ="event_type")
	private String eventType;
	@Column(name ="event_note")
	private String eventNote;
	@Column(name ="status")
	private String status;
	@Column(name ="last_updated_dt")
	private Date updatedDt;
	@Column(name ="last_updated_by")
	private String updatedBy;
	@Transient
	private String studentName;
	@Transient
	private String empName;
	@Transient
	private String lookupdes;
	public Long getEventId() {
		return eventId;
	}
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
	public Long getCompId() {
		return compId;
	}
	public void setCompId(Long compId) {
		this.compId = compId;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public Long getStudId() {
		return studId;
	}
	public void setStudId(Long studId) {
		this.studId = studId;
	}
	public Date getEventDt() {
		return eventDt;
	}
	public void setEventDt(Date eventDt) {
		this.eventDt = eventDt;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getEventNote() {
		return eventNote;
	}
	public void setEventNote(String eventNote) {
		this.eventNote = eventNote;
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
	/*public Date getUpdatedDt() {
		return updatedDt;
	}*/
	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getLookupdes() {
		return lookupdes;
	}
	public void setLookupdes(String lookupdes) {
		this.lookupdes = lookupdes;
	}
	
	
	
}
