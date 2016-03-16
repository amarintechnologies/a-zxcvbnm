
package com.base.domain.mst;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "VW_BASE_MENU_ACCESS")
public class AppScreensMenuDM implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3193301617438349345L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "screen_id")
	private Long screenId;
	@Column(name = "screen_code")
	private String screencode;
	@Column(name = "module_id")
	private Long moduleId;
	@Column(name = "screen_desc")
	private String screendesc;
	@Column(name = "sort_order")
	private Long sortOrder;
	@Column(name = "target_class")
	private String targetClass;
	@Column(name = "parent_id")
	private Long parentId;
	@Column(name = "parent_desc")
	private String parentName;
	@Column(name = "company_id")
	private Long companyId;
	@Column(name = "branch_id")
	private Long branchId;
	@Column(name = "role_id")
	private Long roleId;
	
	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	
	public String getParentName() {
		return parentName;
	}
	
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
		
	public Long getScreenId() {
		return screenId;
	}
	
	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}
	
	public String getScreencode() {
		return screencode;
	}
	
	public void setScreencode(String screencode) {
		this.screencode = screencode;
	}
	
	public String getScreendesc() {
		return screendesc;
	}
	
	public void setScreendesc(String screendesc) {
		this.screendesc = screendesc;
	}
	
	public String getTargetClass() {
		return targetClass;
	}
	
	public void setTargetClass(String targetClass) {
		this.targetClass = targetClass;
	}
	
	public Long getSortOrder() {
		return sortOrder;
	}
	
	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getBranchId() {
		return branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
}
