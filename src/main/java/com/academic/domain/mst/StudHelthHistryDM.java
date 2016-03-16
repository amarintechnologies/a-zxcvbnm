package com.academic.domain.mst;

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
@Table(name = "m_acd_student_health_history")
public class StudHelthHistryDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "health_histid")
	private Long healthHistid;
	@Column(name = "student_id")
	private Long studentId;
	@Column(name = "decease_id")
	private Long deceaseId;
	@Column(name = "deceased_yn")
	private char deceasedYN;
	@Column(name = "date_of_infect")
	private Date dateOfInfect;
	@Column(name = "age_of_infect")
	private Double ageOfInfect;
	@Column(name = "medication")
	private String medication;
	@Column(name = "remarks")
	private String remarks;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastUpdatedDt;
	@Column(name = "last_updated_by")
	private String lastUpdatedBy;
	@Transient
	private String deceasename;

	public String getDeceasename() {
		return deceasename;
	}

	public void setDeceasename(String deceasename) {
		this.deceasename = deceasename;
	}

	public Long getHealthHistid() {
		return healthHistid;
	}

	public Long getStudentId() {
		return studentId;
	}

	public Long getDeceaseId() {
		return deceaseId;
	}

	public char getDeceasedYN() {
		return deceasedYN;
	}

	public Date getDateOfInfect() {
		return dateOfInfect;
	}

	public Double getAgeOfInfect() {
		return ageOfInfect;
	}

	public String getMedication() {
		return medication;
	}

	public String getRemarks() {
		return remarks;
	}

	public String getStatus() {
		return status;
	}

	public String getLastUpdatedDt() {
		if (lastUpdatedDt != null) {
			return DateUtils.datetostringtime(lastUpdatedDt);
		} else {
			return "";
		}
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setHealthHistid(Long healthHistid) {
		this.healthHistid = healthHistid;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public void setDeceaseId(Long deceaseId) {
		this.deceaseId = deceaseId;
	}

	public void setDeceasedYN(char deceasedYN) {
		this.deceasedYN = deceasedYN;
	}

	public void setDateOfInfect(Date dateOfInfect) {
		this.dateOfInfect = dateOfInfect;
	}

	public void setAgeOfInfect(Double ageOfInfect) {
		this.ageOfInfect = ageOfInfect;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setLastUpdatedDt(Date lastUpdatedDt) {
		this.lastUpdatedDt = lastUpdatedDt;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

}
