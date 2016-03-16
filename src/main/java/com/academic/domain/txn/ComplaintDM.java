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
@Table(name = "t_acd_complaint")
public class ComplaintDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "complaint_id")
	private Long complaintId;
	@Column(name = "company_id")
	private Long companyId;
	@Column(name = "complned_by")
	private Long complnedby;
	@Column(name = "complned_agnst")
	private Long complnedagnst;
	@Column(name = "complned_date")
	private Date complneddt;
	@Column(name = "complain_type")
	private String complaintype;
	@Column(name = "title")
	private String title;
	@Column(name = "remarks")
	private String remarks;
	@Column(name = "assigned_to")
	private Long assignedto;
	@Column(name = "jury")
	private Long jury;
	@Column(name = "trial_date")
	private Date traildt;
	@Column(name = "event_note")
	private String eventnote;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;

	@Transient
	private String firstName;

	@Transient
	private String firstname;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Long getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(Long complaintId) {
		this.complaintId = complaintId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getComplnedby() {
		return complnedby;
	}

	public void setComplnedby(Long complnedby) {
		this.complnedby = complnedby;
	}

	public Long getComplnedagnst() {
		return complnedagnst;
	}

	public void setComplnedagnst(Long complnedagnst) {
		this.complnedagnst = complnedagnst;
	}

	public String getComplneddt() {
		if (complneddt != null) {
			return DateUtils.datetostring(complneddt);
		} else {
			return "";
		}

	}

	public Date getComplneddtdt() {
		return complneddt;
	}

	public void setComplneddt(Date complneddt) {
		this.complneddt = complneddt;
	}

	public String getComplaintype() {
		return complaintype;
	}

	public void setComplaintype(String complaintype) {
		this.complaintype = complaintype;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getAssignedto() {
		return assignedto;
	}

	public void setAssignedto(Long assignedto) {
		this.assignedto = assignedto;
	}

	public Long getJury() {
		return jury;
	}

	public void setJury(Long jury) {
		this.jury = jury;
	}

	public String getTraildt() {
		if (traildt != null) {
			return DateUtils.datetostring(traildt);
		} else {
			return "";
		}
	}

	public Date getTraildtdt() {
		return traildt;
	}

	public void setTraildt(Date traildt) {
		this.traildt = traildt;
	}

	public String getEventnote() {
		return eventnote;
	}

	public void setEventnote(String eventnote) {
		this.eventnote = eventnote;
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
