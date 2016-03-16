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
@Table(name = "m_acd_applicant")
public class ApplicantDM {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "applicant_id")
	private Long applicantId;
	@Column(name = "company_id")
	private Long companyId;
	@Column(name = "applicant_date")
	private Date applicantDate;
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "middle_name")
	private String middleName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "batch_id")
	private Long batchId;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "blood_group")
	private String bloodGroup;
	@Column(name = "nationality")
	private Long nationality;
	@Column(name = "pri_language")
	private String priLanguage;
	@Column(name = "gender")
	private String gender;
	@Column(name = "religion")
	private String religion;

	@Column(name = "address")
	private String address;

	@Column(name = "city_id")
	private Long cityId;
	@Column(name = "state_id")
	private Long stateId;
	@Column(name = "country_id")
	private Long countryId;
	@Column(name = "post_code")
	private String postCode;

	@Column(name = "birth_place")
	private String birthPlace;

	@Column(name = "phone")
	private String phone;

	@Column(name = "mobile")
	private String mobile;

	@Column(name = "emailid")
	private String emailid;

	@Column(name = "student_photo")
	private byte[] studentPhoto;

	@Column(name = "permit_no")
	private String permitNo;

	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastUpdatedDt;

	@Column(name = "last_updated_by")
	private String lastUpdatedBy;

	@Column(name = "appltn_no")
	private String appltnNo;

	@Column(name = "course_id")
	private Long courseId;

	@Transient
	private String cityName;
	@Transient
	private String stateName;
	@Transient
	private String countryName;
	@Transient
	private String batchName;
	@Transient
	private String courseName;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Long getApplicantId() {
		return applicantId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public String getApplicantDate() {
		if (applicantDate != null) {
			return DateUtils.datetostring(applicantDate);
		} else {
			return "";
		}

	}

	public Date getApplicantDateDt() {
		return applicantDate;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getDob() {
		return dob;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public Long getNationality() {
		return nationality;
	}

	public String getPriLanguage() {
		return priLanguage;
	}

	public String getGender() {
		return gender;
	}

	public String getReligion() {
		return religion;
	}

	public String getAddress() {
		return address;
	}

	public Long getCityId() {
		return cityId;
	}

	public Long getStateId() {
		return stateId;
	}

	public Long getCountryId() {
		return countryId;
	}

	public String getPostCode() {
		return postCode;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public String getPhone() {
		return phone;
	}

	public String getMobile() {
		return mobile;
	}

	public String getEmailid() {
		return emailid;
	}

	public byte[] getStudentPhoto() {
		return studentPhoto;
	}

	public String getPermitNo() {
		return permitNo;
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

	public String getCityName() {
		return cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public String getCountryName() {

		return countryName;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public void setApplicantDate(Date applicantDate) {
		this.applicantDate = applicantDate;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public void setNationality(Long nationality) {
		this.nationality = nationality;
	}

	public void setPriLanguage(String priLanguage) {
		this.priLanguage = priLanguage;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public void setStudentPhoto(byte[] studentPhoto) {
		this.studentPhoto = studentPhoto;
	}

	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setLastUpdatedDt(Date lastUpdatedDt) {
		this.lastUpdatedDt = lastUpdatedDt;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public String getAppltnNo() {
		return appltnNo;
	}

	public void setAppltnNo(String appltnNo) {
		this.appltnNo = appltnNo;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

}
