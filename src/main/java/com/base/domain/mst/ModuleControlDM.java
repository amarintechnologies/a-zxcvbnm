
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
@Table(name = "m_base_module_ctrl")
public class ModuleControlDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "MODULE_CTRLID")
	private Long modulecontrolid;
	@Column(name = "COMPANY_ID")
	private Long companyid;
	@Column(name = "MODULE_ID")
	private Long moduleid;
	@Column(name = "LICENSE_END_DT")
	private Date licenseenddt;
	@Column(name = "CTRL_STATUS")
	private String ctrlstatus;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastupdateddt;
	@Column(name = "LAST_UPDATED_BY")
	private String lastupdatedby;
	@Column(name = "LICENSED_YN")
	private String licensedyn;
	@Column(name = "LICENSE_START_DT")
	private Date licensestartdt;
	@Transient
	private String moduleCode;
	@Transient
	private String moduleName;
	
	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public Long getCompanyid() {
		return companyid;
	}
	
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	
	public String getModuleCode() {
		return moduleCode;
	}
	
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	
	public Long getModuleid() {
		return moduleid;
	}
	
	public void setModuleid(Long moduleid) {
		this.moduleid = moduleid;
	}
	
	public Date getLicensestartdt() {
		return licensestartdt;
	}
	
	public void setLicensestartdt(Date licensestartdt) {
		this.licensestartdt = licensestartdt;
	}
	
	public Long getModulecontrolid() {
		return modulecontrolid;
	}
	
	public void setModulecontrolid(Long modulecontrolid) {
		this.modulecontrolid = modulecontrolid;
	}
	
	public String getLicensedyn() {
		return licensedyn;
	}
	
	public void setLicensedyn(String licensedyn) {
		this.licensedyn = licensedyn;
	}
	
	public Date getLicenseenddt() {
		return licenseenddt;
	}
	
	public void setLicenseenddt(Date licenseenddt) {
		this.licenseenddt = licenseenddt;
	}
	
	public String getCtrlstatus() {
		return ctrlstatus;
	}
	
	public void setCtrlstatus(String ctrlstatus) {
		this.ctrlstatus = ctrlstatus;
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
