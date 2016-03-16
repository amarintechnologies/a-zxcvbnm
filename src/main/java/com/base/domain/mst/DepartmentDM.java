
package com.base.domain.mst;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_base_department")
public class DepartmentDM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "dept_id")
	private Long deptid;
	@Column(name = "dept_name")
	private String deptname;
	@Column(name = "dept_status")
	private String deptstatus;
	@Column(name = "company_id")
	private Long companyid;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;

	public DepartmentDM() {
	}
	
	public DepartmentDM(Long deptid, String deptname) {
		this.deptid = deptid;
		this.deptname = deptname;
	}
	
	public Long getDeptid() {
		return deptid;
	}
	
	public void setDeptid(Long deptid) {
		this.deptid = deptid;
	}
	
	public String getDeptname() {
		return deptname;
	}
	
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	public String getDeptstatus() {
		return deptstatus;
	}
	
	public void setDeptstatus(String deptstatus) {
		this.deptstatus = deptstatus;
	}
	
	public Long getCompanyid() {
		return companyid;
	}
	
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	
	public String getLastupdateddt() {
		return DateUtils.datetostringtime(lastupdateddt);
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
