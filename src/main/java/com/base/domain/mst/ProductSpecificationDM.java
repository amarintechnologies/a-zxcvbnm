
package com.base.domain.mst;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "M_BASE_PRODUCT_SPEC")
public class ProductSpecificationDM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "SPEC_ID")
	private Long specid;
	
	@JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
	@ManyToOne(fetch = FetchType.EAGER)
	private ProductDM prodid;
	@Column(name = "SPEC_CODE")
	private String speccode;
	@Column(name = "SPEC_DESC")
	private String specdesc;
	@Column(name = "SPEC_STATUS")
	private String specstatus;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastupdateddt;
	@Column(name = "LAST_UPDATED_BY")
	private String lastupdatedby;
	@Transient
	private String prodName;
	
	public String getProdName() {
		if (prodid != null) {
			return prodid.getProdname();
		}
		return null;
	}
	
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
	public Long getSpecid() {
		return specid;
	}
	
	public void setSpecid(Long specid) {
		this.specid = specid;
	}
	
	public ProductDM getProdid() {
		return prodid;
	}
	
	public void setProdid(ProductDM prodid) {
		this.prodid = prodid;
	}
	
	public String getSpeccode() {
		return speccode;
	}
	
	public void setSpeccode(String speccode) {
		this.speccode = speccode;
	}
	
	public String getSpecdesc() {
		return specdesc;
	}
	
	public void setSpecdesc(String specdesc) {
		this.specdesc = specdesc;
	}
	
	public String getSpecstatus() {
		return specstatus;
	}
	
	public void setSpecstatus(String specstatus) {
		this.specstatus = specstatus;
	}
	
	public Date getLastupdateddt() {
		return lastupdateddt;
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
