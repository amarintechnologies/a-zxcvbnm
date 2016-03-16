package com.library.domain.mst;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.erputil.util.DateUtils;
@Entity
@Table(name = "m_lib_book_category")
public class BookCategoryDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="category_id")
	private Long  bkCategoryid;
	@Column(name ="category_name")
	private String categoryName;
	@Column(name ="company_id")
	private Long companyId;
	@Column(name ="status")
	private String status;
	@Column(name ="last_updated_dt")
	private Date lastupdatedDt;
	@Column(name ="last_updated_by")
	private String lastupdatedBy;
	
	public BookCategoryDM(){
	}

public Long getBkCategoryid() {
		return bkCategoryid;
	}
public void setBkCategoryid(Long bkCategoryid) {
		this.bkCategoryid = bkCategoryid;
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

	public String getLastupdatedDt() {
		if (lastupdatedDt != null) {
			return DateUtils.datetostringtime(lastupdatedDt);
		} else {
			return "";
		}
	}

	public void setLastupdatedDt(Date lastupdatedDt) {
		this.lastupdatedDt = lastupdatedDt;
	}

	public String getLastupdatedBy() {
		return lastupdatedBy;
	}

	public void setLastupdatedBy(String lastupdatedBy) {
		this.lastupdatedBy = lastupdatedBy;
	}
	
}
