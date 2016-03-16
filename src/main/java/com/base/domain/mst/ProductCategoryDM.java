
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
import javax.persistence.Transient;
import com.erputil.util.DateUtils;

@Entity
@Table(name = "M_BASE_PRODUCT_CATEGORY")
public class ProductCategoryDM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CATEGORY_ID")
	private Long cateid;
	@Column(name = "COMPANY_ID")
	private Long companyid;
	@Column(name = "PARENT_CATG_ID")
	private Long parentcateid;
	@Column(name = "CATEGORY_NAME")
	private String catename;
	@Column(name = "CATEGORY_DESC")
	private String catedesc;
	@Column(name = "CATEGORY_IMAGE")
	private byte[] cateimage;
	@Column(name = "CATEGORY_STATUS")
	private String catestatus;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastupdateddt;
	@Column(name = "LAST_UPDATED_BY")
	private String lastupdatedby;
	@Column(name = "SHORT_DESC")
	private String shortdesc;
	@Transient
	private String parentCategoryname;
	public String getShortdesc() {
		return shortdesc;
	}

	public void setShortdesc(String shortdesc) {
		this.shortdesc = shortdesc;
	}
	public Long getCompanyid() {
		return companyid;
	}
	
	public ProductCategoryDM() {
	}
	
	public ProductCategoryDM(Long cateid, String catename) {
		this.cateid = cateid;
		this.catename = catename;
	}
	
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	
	public String getParentCategoryname() {
		return parentCategoryname;
	}
	
	public void setParentCategoryname(String parentCategoryname) {
		this.parentCategoryname = parentCategoryname;
	}
	
	public Long getCateid() {
		return cateid;
	}
	
	public void setCateid(Long cateid) {
		this.cateid = cateid;
	}
	
	public Long getParentcateid() {
		return parentcateid;
	}
	
	public void setParentcateid(Long parentcateid) {
		this.parentcateid = parentcateid;
	}
	
	public String getCatename() {
		return catename;
	}
	
	public void setCatename(String catename) {
		this.catename = catename;
	}
	
	public String getCatedesc() {
		return catedesc;
	}
	
	public void setCatedesc(String catedesc) {
		this.catedesc = catedesc;
	}
	
	public byte[] getCateimage() {
		return cateimage;
	}
	
	public void setCateimage(byte[] cateimage) {
		this.cateimage = cateimage;
	}
	
	public String getCatestatus() {
		return catestatus;
	}
	
	public void setCatestatus(String catestatus) {
		this.catestatus = catestatus;
	}
	
	public String getLastupdateddt() {
		if(lastupdateddt!=null)
		{
		return DateUtils.datetostringtime(lastupdateddt);
		}else{
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