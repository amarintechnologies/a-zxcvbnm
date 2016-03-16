
package com.base.domain.txn;

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
@Table(name = "t_base_org_news")
public class OrgNewsDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "NEWS_ID")
	private Long newsId;
	@Column(name = "COMPANY_ID")
	private Long companyId;
	@Column(name = "NEWS_TITLE")
	private String newsTitle;
	@Column(name = "NEWS_DESC")
	private String newsDesc;
	@Column(name = "VALID_FROM")
	private Date validFrom;
	@Column(name = "VALID_TO")
	private Date validTo;
	@Column(name = "BRANCH_ID")
	private Long branchId;
	@Column(name = "DEPT_ID")
	private Long deptId;
	@Column(name = "NEWS_STATUS")
	private String newsStatus;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastUpdatedDate;
	@Column(name = "LAST_UPDATED_BY")
	private String lastUpdatedBy;
	@Transient
	private String departmentName;
	@Transient
	private String branchName;
	
	public OrgNewsDM() {
	}
	
	public OrgNewsDM(Long newsId, String newsDesc) {
		this.newsId = newsId;
		this.newsDesc = newsDesc;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String getBranchName() {
		return branchName;
	}
	
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	public String getnewsId() {
		if (newsId != null) {
			return newsId.toString();
		} else {
			return "";
		}
	}
	
	public void setNewsId(Long newsId) {
		this.newsId = newsId;
	}
	
	public String getNewsTitle() {
		return newsTitle;
	}
	
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	
	public String getNewsDesc() {
		return newsDesc;
	}
	
	public void setNewsDesc(String newsDesc) {
		this.newsDesc = newsDesc;
	}
	
	public String getValidFrom() {
		if (validFrom != null) {
			return DateUtils.datetostring(validFrom);
		} else {
			return null;
		}
	}
	
	public Date getValidFromInDt() {
		return validFrom;
	}
	
	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}
	
	public String getvalidTo() {
		if (validTo != null) {
			return DateUtils.datetostring(validTo);
		} else {
			return null;
		}
	}
	
	public Date getValidToInDt() {
		return validTo;
	}
	
	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}
	
	public String getNewsStatus() {
		return newsStatus;
	}
	
	public void setNewsStatus(String newsStatus) {
		this.newsStatus = newsStatus;
	}
	
	public String getLastUpdatedDate() {
		if (lastUpdatedDate != null) {
			return DateUtils.datetostringtime(lastUpdatedDate);
		} else {
			return "";
		}
	}
	
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
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
	
	public Long getDeptId() {
		return deptId;
	}
	
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
}
