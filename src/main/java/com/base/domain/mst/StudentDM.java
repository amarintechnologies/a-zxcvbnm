package com.base.domain.mst;

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
@Table(name = "m_acd_student")
public class StudentDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private Long studentId;
	@Column(name = "company_id")
	private Long companyId;
	@Column(name = "applicant_id")
	private Long applicantId;
	@Column(name = "applicant_date")
	private Date applicantDate;
	@Column(name = "student_no")
	private String studentNo;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "middle_name")
	private String middleName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "admission_no")
	private String admissionNo;
	@Column(name = "admission_dt")
	private Date admissionDate;
	@Column(name = "batch_id")
	private Long batchId;
	@Column(name = "courseid")
	private Long courseid;

	@Column(name = "dob")
	private Date dateOfBirth;
	@Column(name = "blood_group")
	private String bloodGroup;
	@Column(name = "nationality")
	private String nationality;
	@Column(name = "pri_language")
	private String priLang;
	@Column(name = "stud_catgryid")
	private Long studCid;
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
	private String emailId;
	@Column(name = "student_photo")
	private byte[] studPhoto;
	@Column(name = "emailopt_yn")
	private String emialOpt;
	@Column(name = "access_id")
	private String accessId;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date updatedDt;
	@Column(name = "last_updated_by")
	private String updatedBy;
	@Transient
	private String appltnNo;
	@Transient
	private String batch_name;
	@Transient
	private String course_name;

	public Long getCourseid() {
		return courseid;
	}

	public void setCourseid(Long courseid) {
		this.courseid = courseid;
	}

	public String getAppltnNo() {
		return appltnNo;
	}

	public void setAppltnNo(String appltnNo) {
		this.appltnNo = appltnNo;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getApplicantId() {
		return applicantId;
	}

	public String getBatch_name() {
		return batch_name;
	}

	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}

	public Date getApplicantDate1() {
		return applicantDate;
	}
	public String getApplicantDate() {
		if (applicantDate != null) {
			return DateUtils.datetostringtime(applicantDate);
		} else {
			return "";
		}
	}
	public void setApplicantDate(Date applicantDate) {
		this.applicantDate = applicantDate;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(String admissionNo) {
		this.admissionNo = admissionNo;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPriLang() {
		return priLang;
	}

	public void setPriLang(String priLang) {
		this.priLang = priLang;
	}

	public Long getStudCid() {
		return studCid;
	}

	public void setStudCid(Long studCid) {
		this.studCid = studCid;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public byte[] getStudPhoto() {
		return studPhoto;
	}

	public void setStudPhoto(byte[] studPhoto) {
		this.studPhoto = studPhoto;
	}

	public String getEmialOpt() {
		return emialOpt;
	}

	public void setEmialOpt(String emialOpt) {
		this.emialOpt = emialOpt;
	}

	public String getAccessId() {
		return accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
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

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}
