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
@Table(name = "m_acd_student_contacts")
public class StudentContactsDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "studnt_contid")
	private Long studContactId;
	@Column(name = "student_id")
	private Long studId;
	@Column(name = "contact_type")
	private String contactType;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "relationship")
	private String relation;
	@Column(name = "dob")
	private Date dateOfBirth;
	@Column(name = "education")
	private String education;
	@Column(name = "occupation")
	private String occupation;
	@Column(name = "income")
	private Long income;
	@Column(name = "email")
	private String email;
	@Column(name = "office_address")
	private String officeAdd;
	@Column(name = "city_id")
	private Long cityId;
	@Column(name = "state_id")
	private Long stateId;
	@Column(name = "country_id")
	private Long countryId;
	@Column(name = "office_no1")
	private String officeNo1;
	@Column(name = "office_no2")
	private String officeNo2;
	@Column(name = "mobile_no")
	private String mobileNo;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date updatedDt;
	@Column(name = "last_updated_by")
	private String updatedBy;
	@Transient
	private String studentNo;

	public Long getStudContactId() {
		return studContactId;
	}

	public void setStudContactId(Long studContactId) {
		this.studContactId = studContactId;
	}

	public Long getStudId() {
		return studId;
	}

	public void setStudId(Long studId) {
		this.studId = studId;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Long getIncome() {
		return income;
	}

	public void setIncome(Long income) {
		this.income = income;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOfficeAdd() {
		return officeAdd;
	}

	public void setOfficeAdd(String officeAdd) {
		this.officeAdd = officeAdd;
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

	public String getOfficeNo1() {
		return officeNo1;
	}

	public void setOfficeNo1(String officeNo1) {
		this.officeNo1 = officeNo1;
	}

	public String getOfficeNo2() {
		return officeNo2;
	}

	public void setOfficeNo2(String officeNo2) {
		this.officeNo2 = officeNo2;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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
