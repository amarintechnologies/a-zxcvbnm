
package com.base.domain.mst;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "m_base_module")
public class ModuleDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="module_id")
	private Long moduleId;
	@Column(name="Module_code")
	private String moduleCode="";
	@Column(name="module_name")
	private String moduleName="";
	@Column(name="version_no")
    private String versionNo="";
	@Column(name="module_status")
	private String moduleStatus="";
	@Column(name="last_updated_dt")
	private Date lastUpdatedDt;
	@Column(name="last_updated_by")
	private String lastUpdatedBy;
	
	
	public ModuleDM()
	{
		
	}
	
	public ModuleDM(Long moduleId,String moduleName){
		this.moduleId=moduleId;
		this.moduleName=moduleName;	
	}
	public Long getModuleId() {
		return moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}
	
	public String getModuleCode() {
		return moduleCode;
	}
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	
	public String getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getModuleStatus() {
		return moduleStatus;
	}
	public void setModuleStatus(String moduleStatus) {
		this.moduleStatus = moduleStatus;
	}
	public Date getLastUpdatedDt() {
		return lastUpdatedDt;
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
	
	
	
}
