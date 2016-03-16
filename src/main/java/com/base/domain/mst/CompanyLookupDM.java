
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
@Table(name = "m_base_company_lookup")
public class CompanyLookupDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CMPLOOKUP_ID")
	private Long cmplookupid;
	@Column(name = "COMPANY_ID")
	private Long companyid;
	@Column(name = "LOOKUP_ID")
	private Long lookupid;
	@Column(name = "module_id")
	private Long moduleid;
	@Column(name = "LOOKUP_NAME")
	private String lookupname;
	@Column(name = "LOOKUP_STATUS")
	private String lookupstatus;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastupdateddt;
	@Column(name = "LAST_UPDATED_BY")
	private String lastupdatedby;
	@Transient
	private String lookupCode;
	@Transient
	private String lookupDesc;
	@Transient
	private String moduleCode;
	@Transient
	private String moduleName;	
	
	public CompanyLookupDM() {
	}
	
	public CompanyLookupDM(Long cmplookupid, String lookupname) {
		this.cmplookupid = cmplookupid;
		this.lookupname = lookupname;
	}
	
	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getLookupDesc() {
		return lookupDesc;
	}

	public void setLookupDesc(String lookupDesc) {
		this.lookupDesc = lookupDesc;
	}
	
	public Long getModuleid() {
		return moduleid;
	}
	
	public void setModuleid(Long moduleid) {
		this.moduleid = moduleid;
	}
	
	public String getModuleCode() {
		return moduleCode;
	}
	
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	
	public String getLookupCode() {
		return lookupCode;
	}
	
	public void setLookupCode(String lookupCode) {
		this.lookupCode = lookupCode;
	}
	
	public String getCmplookupid() {
		return cmplookupid.toString();
	}
	
	public void setCmplookupid(Long cmplookupid) {
		this.cmplookupid = cmplookupid;
	}
	
	public Long getCompanyid() {
		return companyid;
	}
	
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	
	public Long getLookupid() {
		return lookupid;
	}
	
	public void setLookupid(Long lookupid) {
		this.lookupid = lookupid;
	}
	
	public String getLookupname() {
		return lookupname;
	}
	
	public void setLookupname(String lookupname) {
		this.lookupname = lookupname;
	}
	
	public String getLookupstatus() {
		return lookupstatus;
	}
	
	public void setLookupstatus(String lookupstatus) {
		this.lookupstatus = lookupstatus;
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
