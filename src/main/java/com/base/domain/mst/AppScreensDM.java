
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
@Table(name = "m_base_app_screens")
public class AppScreensDM implements Serializable {
	private static final long serialVersionUID = 1L;
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
	@Column(name = "target_class")
	private String targetClass;
	@Column(name = "parent_id")
	private Long parentId;
	@Column(name = "screen_status")
	private String status;
	@Column(name = "help_doc")
	private String helpDco;
	@Column(name = "sort_order")
	private Long sortOrder;
	@Column(name = "REVIEW_APL_YN")
	private String reviewAPLYN;
	@Column(name = "APPROVE_APL_YN")
	private String approveAPLYN;
	@Column(name = "RECORD_LVL_YN")
	private String recLvlYN;
	@Transient
	private String moduleName;
	@Transient
	private String parentName;
	@Transient
	private String accessidref;
	
	
	public String getAccessidref() {
		return accessidref;
	}

	public void setAccessidref(String accessidref) {
		this.accessidref = accessidref;
	}

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
	public String getReviewAPLYN() {
		return reviewAPLYN;
	}
	
	public void setReviewAPLYN(String reviewAPLYN) {
		this.reviewAPLYN = reviewAPLYN;
	}
	
	public String getApproveAPLYN() {
		return approveAPLYN;
	}
	
	public void setApproveAPLYN(String approveAPLYN) {
		this.approveAPLYN = approveAPLYN;
	}
	
	public String getRecLvlYN() {
		return recLvlYN;
	}
	
	public void setRecLvlYN(String recLvlYN) {
		this.recLvlYN = recLvlYN;
	}
	
	public String getParentName() {
		return parentName;
	}
	
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	
	public String getModuleName() {
		return moduleName;
		}
	
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
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
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getHelpDco() {
		return helpDco;
	}
	
	public void setHelpDco(String helpDco) {
		this.helpDco = helpDco;
	}
	
	public Long getSortOrder() {
		return sortOrder;
	}
	
	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}
}
