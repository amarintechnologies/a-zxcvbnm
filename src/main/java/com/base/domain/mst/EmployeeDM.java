
package com.base.domain.mst;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_base_employee")
public class EmployeeDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "employee_id")
	private Long employeeid;
	@Column(name = "employee_code")
	private String employeecode;
	@Column(name = "first_name")
	private String firstname;
	@Column(name = "last_name")
	private String lastname;
	@Column(name = "COMPANY_ID")
	private Long companyid;
	@Column(name = "USER_ID")
	private Long userId;
	@Column(name = "primary_phone")
	private String primaryphone;
	@Column(name = "primary_email")
	private String primaryemail;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "gender")
	private String gender;
	@Column(name = "dept_id")
	private Long deptid;
	@Column(name = "branch_id")
	private Long branchid;
	@Column(name = "COUNTRY_ID")
	private Long countryid;
	@Column(name = "doj")
	private Date doj;
	@Column(name = "rm_employee_id")
	private Long rmemployeeid;
	@Column(name = "emp_photo")
	private byte[] empphoto;
	@Column(name = "emp_status")
	private String empstatus;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;
	@Column(name = "LOGINACCESS_YN")
	private String loginAccess;
	@Column(name = "SEAT_CODE")
	private String seatCode;
	@Transient
	private String deptname;
	@Transient
	private String branchName;
	@Transient
	private String fullname;
	@Transient
	private String companyname;
	@Transient
	private String countryname;
	@Transient
	private String firstlastname;
	@Transient
	private String Username;
	@Transient
	private String Rmemployeename;
	

	public EmployeeDM() {
	}
	
	
	public String getUsername() {
		return Username;
	}

	public String getRmemployeename() {
		return Rmemployeename;
	}

	
	
	public String getCompanyname() {
		return companyname;
	}

	public EmployeeDM(Long employeeid, String firstname) {
		this.firstname = firstname;
		this.employeeid = employeeid;
	}
	
	public String getFullname() {
		if (lastname != null) {
			return firstname + " " + lastname+ " "+"("+employeecode+")";
		} else {
			return firstname;
		}
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getFirstlastname() {
		if (firstname !=null) {
			
			return firstname + " " + lastname;
		}else{
			return firstname;
		}
		
	}


	public void setFirstlastname(String firstlastname) {
		this.firstlastname = firstlastname;
	}
	
	public String getDeptname() {
		return deptname;
	}
	
	public String getBranchName() {
		return branchName;
	}
	
	public Long getEmployeeid() {
		return employeeid;
	}
	
	public void setEmployeeid(Long employeeid) {
		this.employeeid = employeeid;
	}
	
	public String getEmployeecode() {
		return employeecode;
	}
	
	public void setEmployeecode(String employeecode) {
		this.employeecode = employeecode;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public Long getCompanyid() {
		return companyid;
	}
	
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	
	public String getPrimaryphone() {
		return primaryphone;
	}
	
	public void setPrimaryphone(String primaryphone) {
		this.primaryphone = primaryphone;
	}
	
	public String getPrimaryemail() {
		return primaryemail;
	}
	
	public void setPrimaryemail(String primaryemail) {
		this.primaryemail = primaryemail;
	}
	
	public String getDob() {
		if (dob != null) {
			return DateUtils.datetostringsimple(dob);
		} else {
			return "";
		}
	}
	
	public Date getDobinDt() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Long getDeptid() {
		return deptid;
	}
	
	public void setDeptid(Long deptid) {
		this.deptid = deptid;
	}
	
	public Long getBranchid() {
		return branchid;
	}
	
	public void setBranchid(Long branchid) {
		this.branchid = branchid;
	}
	
	public Long getCountryid() {
		return countryid;
	}
	
	public void setCountryid(Long countryid) {
		this.countryid = countryid;
	}
	
	public String getDoj() {
		if (doj != null) {
			return DateUtils.datetostringsimple(doj);
		} else {
			return "";
		}
	}
	
	public Date getDojInDt() {
		return doj;
	}
	
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	public Long getRmemployeeid() {
		return rmemployeeid;
	}
	
	public void setRmemployeeid(Long rmemployeeid) {
		this.rmemployeeid = rmemployeeid;
	}
	
	public byte[] getEmpphoto() {
		return empphoto;
	}
	
	public void setEmpphoto(byte[] empphoto) {
		this.empphoto = empphoto;
	}
	
	public String getEmpstatus() {
		return empstatus;
	}
	
	public void setEmpstatus(String empstatus) {
		this.empstatus = empstatus;
	}
	
	public String getLastupdateddt() {
		if (lastupdateddt != null) {
			return DateUtils.datetostringtime(lastupdateddt);
		} else {
			return null;
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
	
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getLoginAccess() {
		return loginAccess;
	}
	
	public void setLoginAccess(String loginAccess) {
		this.loginAccess = loginAccess;
	}
	
	public String getSeatCode() {
		return seatCode;
	}
	
	public void setSeatCode(String seatCode) {
		this.seatCode = seatCode;
	}
	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
}
