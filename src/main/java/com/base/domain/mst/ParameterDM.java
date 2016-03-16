
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
@Table(name = "m_base_parameter")
public class ParameterDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "param_id")
	private Long paramId;
	@Column(name = "company_id")
	private Long companyId;
	@Column(name = "module_id")
	private String moduleCode = "";
	@Column(name = "param_ref")
	private String paramRef = "";
	@Column(name = "param_desc")
	private String paramDesc = "";
	@Column(name = "param_value")
	private String paramValue = "";
	@Column(name = "show_yn")
	private String showYn = "";
	@Column(name = "edit_yn")
	private String editYn = "";
	@Column(name = "param_st_date")
	private Date paramStDate;
	@Column(name = "param_end_date")
	private Date paramEndDate;
	@Column(name = "param_status")
	private String paramStatus = "";
	@Column(name = "last_updated_dt")
	private Date lastUpdatedDt;
	@Column(name = "last_updated_by")
	private String lastUpdatedBy;
	@Transient
	private String paramName;
	@Transient
	private String moduleName;

	public Long getParamId() {
		return paramId;
	}

	public void setParamId(Long paramId) {
		this.paramId = paramId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getModuleCode() {
		return moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public String getParamRef() {
		return paramRef;
	}

	public void setParamRef(String paramRef) {
		this.paramRef = paramRef;
	}

	public String getParamDesc() {
		return paramDesc;
	}

	public void setParamDesc(String paramDesc) {
		this.paramDesc = paramDesc;
	}

	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public String getShownYn() {
		return showYn;
	}

	public void setShownYn(String showYn) {
		this.showYn = showYn;
	}

	public String getEditYn() {
		return editYn;
	}

	public void setEditYn(String editYn) {
		this.editYn = editYn;
	}

	public Date getParamStDate() {
		return paramStDate;
	}

	public void setParamStDate(Date paramStDate) {
		this.paramStDate = paramStDate;
	}

	public Date getParamEndDate() {
		return paramEndDate;
	}

	public void setParamEndDate(Date paramEndDate) {
		this.paramEndDate = paramEndDate;
	}

	public String getParamStatus() {
		return paramStatus;
	}

	public void setParamStatus(String paramStatus) {
		this.paramStatus = paramStatus;
	}

	public String getLastUpdatedDt() {
		if (lastUpdatedDt != null) {
			return DateUtils.datetostringtime(lastUpdatedDt);
		} else {
			return "";
		}
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

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

}
