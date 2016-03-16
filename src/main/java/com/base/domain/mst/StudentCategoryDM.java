
package com.base.domain.mst;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.erputil.util.DateUtils;
@Entity
@Table(name = "m_acd_student_category")
public class StudentCategoryDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="stud_catgryid")
	private Long studCid;
	@Column(name ="category_name")
	private String categoryName;
	@Column(name ="company_id")
	private Long companyId;
	@Column(name ="status")
	private String status;
	@Column(name ="last_updated_dt")
	private Date updatedDt;
	@Column(name ="last_updated_by")
	private String updatedBy;
	public Long getStudCid() {
		return studCid;
	}
	public void setStudCid(Long studCid) {
		this.studCid = studCid;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
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
