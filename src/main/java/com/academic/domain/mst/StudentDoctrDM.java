package com.academic.domain.mst;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_acd_student_doctor")
public class StudentDoctrDM {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "studnt_doctorid")
	private Long studntDoctorid;
	@Column(name = "student_id")
	private Long studentId;
	@Column(name = "doctor_name")
	private String doctorName;
	@Column(name = "doctor_address")
	private String doctorAddress;

	@Column(name = "doctor_phone1")
	private String doctorPhone1;

	@Column(name = "doctor_phone2")
	private String doctorPhone2;

	@Column(name = "doctor_mobile")
	private String doctorMobile;
	@Column(name = "illness_desc")
	private String illness_desc;
	@Column(name = "remarks")
	private String remarks;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastUpdatedDt;
	@Column(name = "last_updated_by")
	private String lastUpdatedBy;

	public Long getStudntDoctorid() {
		return studntDoctorid;
	}

	public Long getStudentId() {
		return studentId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public String getDoctorAddress() {
		return doctorAddress;
	}

	public String getDoctorPhone1() {
		return doctorPhone1;
	}

	public String getDoctorPhone2() {
		return doctorPhone2;
	}

	public String getDoctorMobile() {
		return doctorMobile;
	}

	public String getIllness_desc() {
		return illness_desc;
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

	public void setStudntDoctorid(Long studntDoctorid) {
		this.studntDoctorid = studntDoctorid;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}

	public void setDoctorPhone1(String doctorPhone1) {
		this.doctorPhone1 = doctorPhone1;
	}

	public void setDoctorPhone2(String doctorPhone2) {
		this.doctorPhone2 = doctorPhone2;
	}

	public void setDoctorMobile(String doctorMobile) {
		this.doctorMobile = doctorMobile;
	}

	public void setIllness_desc(String illness_desc) {
		this.illness_desc = illness_desc;
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
