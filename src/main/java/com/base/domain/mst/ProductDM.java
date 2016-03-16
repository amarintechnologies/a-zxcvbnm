
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
@Table(name = "M_BASE_PRODUCT")
public class ProductDM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "PRODUCT_ID")
	private Long prodid;
	@Column(name = "CATEGORY_ID")
	private Long cateid;
	@Column(name = "COMPANY_ID")
	private Long companyid;
    @Column(name = "BRANCH_ID")
	private Long branchid;
    @Column(name = "PRODUCT_NAME")
	private String prodname;
	@Column(name = "PRODUCT_DESC")
	private String proddesc;
	@Column(name = "PRODUCT_IMG")
	private byte[] prodimg;
	@Column(name = "BRAND_NAME")
	private String brandname;
	@Column(name = "PRODUCT_DOC")
	private byte[] proddoc;
	@Column(name = "PRICE")
	private Long price;
	@Column(name = "UOM")
	private String uom;
	@Column(name = "CCY_ID")
	private Long ccyid;
	@Column(name = "VISUALIZER_YN")
	private String visualizeryn;
	@Column(name = "VIEW360_YN")
	private String view360yn;
	@Column(name = "PROD_STATUS")
	private String prodstatus;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastupdateddt;
	@Column(name = "LAST_UPDATED_BY")
	private String lastupdatedby;
	@Column(name = "PARENT_PROD_ID")
	private Long parentprodid;
	@Column(name = "SHORT_DESC")
	private String shortdesc;
	@Column(name = "PRODUCT_CODE")
	private String productcode;
	@Column(name = "CREATED_DT")
	private String createddt;
	@Column(name = "CREATED_BY")
	private String createdby;
	
	public String getCreateddt() {
		return createddt;
	}
	public void setCreateddt(String createddt) {
		this.createddt = createddt;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	@Transient
	private String cateName;
	@Transient
	private String ccyName;
	@Transient
	private String parentprodName;
	@Transient
	private String branchName;
	public ProductDM()
	{
		
	}
	public ProductDM(Long prodid, String prodname) {
		this.prodid=prodid;
		this.prodname=prodname;
		
	}

	public String getShortdesc() {
		return shortdesc;
	}
	
	public Long getBranchid() {
		return branchid;
	}

	public void setBranchid(Long branch) {
		this.branchid = branch;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public void setShortdesc(String shortdesc) {
		this.shortdesc = shortdesc;
	}
	
	public String getCateName() {
		return cateName;
	}
	
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	
	public String getCcyName() {
		if (ccyid != null) {
			return ccyid.toString();
		}
		return null;
	}
	
	public void setCcyName(String ccyName) {
		this.ccyName = ccyName;
	}
	
	public String getParentprodName() {
		if (parentprodid != null) {
			return parentprodid.toString();
		}
		return null;
	}
	
	public void setParentprodName(String parentprodName) {
		this.parentprodName = parentprodName;
	}
	
	public Long getParentprodid() {
		return parentprodid;
	}
	
	public void setParentprodid(Long parentprodid) {
		this.parentprodid = parentprodid;
	}
	
	public Long getProdid() {
		return prodid;
	}
	
	public void setProdid(Long prodid) {
		this.prodid = prodid;
	}
	
	public Long getCateid() {
		return cateid;
	}
	
	public void setCateid(Long cateid) {
		this.cateid = cateid;
	}
	
	public Long getCompanyid() {
		return companyid;
	}
	
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	
	public String getProdname() {
		return prodname;
	}
	
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	
	public String getProddesc() {
		return proddesc;
	}
	
	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}
	
	public byte[] getProdimg() {
		return prodimg;
	}
	
	public void setProdimg(byte[] prodimg) {
		this.prodimg = prodimg;
	}
	
	public String getBrandname() {
		return brandname;
	}
	
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	
	public byte[] getProddoc() {
		return proddoc;
	}
	
	public void setProddoc(byte[] proddoc) {
		this.proddoc = proddoc;
	}
	
	public Long getPrice() {
		return price;
	}
	
	public void setPrice(Long price) {
		this.price = price;
	}
	
	public String getUom() {
		return uom;
	}
	
	public void setUom(String uom) {
		this.uom = uom;
	}
	
	public Long getCcyid() {
		return ccyid;
	}
	
	public void setCcyid(Long ccyid) {
		this.ccyid = ccyid;
	}
	
	public String getVisualizeryn() {
		return visualizeryn;
	}
	
	public void setVisualizeryn(String visualizeryn) {
		this.visualizeryn = visualizeryn;
	}
	
	public String getView360yn() {
		return view360yn;
	}
	
	public void setView360yn(String view360yn) {
		this.view360yn = view360yn;
	}
	
	public String getProdstatus() {
		return prodstatus;
	}
	
	public void setProdstatus(String prodstatus) {
		this.prodstatus = prodstatus;
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
