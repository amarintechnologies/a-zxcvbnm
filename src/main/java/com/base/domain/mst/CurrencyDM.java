
package com.base.domain.mst;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_base_currency")
public class CurrencyDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "CCY_ID")
	private Long ccyid;
	@Column(name = "CCY_NAME")
	private String ccyname;
	@Column(name = "CCY_CODE")
	private String ccycode;
	@Column(name = "CCY_SYMBOL")
	private String ccysymbol;
	@Column(name = "CCY_STATUS")
	private String ccystatus;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastupdateddt;
	@Column(name = "LAST_UPDATED_BY")
	private String lastupdatedby;
	
	public CurrencyDM() {
	}
	
	public CurrencyDM(Long currencyId, String currencyCode, String currencyName) {
		this.ccyid = currencyId;
		this.ccycode = currencyCode;
		this.ccyname = currencyName;
	}
	
	public Long getCcyid() {
		return ccyid;
	}
	
	public void setCcyid(Long ccyid) {
		this.ccyid = ccyid;
	}
	
	public String getCcyname() {
		return ccyname;
	}
	
	public void setCcyname(String ccyname) {
		this.ccyname = ccyname;
	}
	
	public String getCcycode() {
		return ccycode;
	}
	
	public void setCcycode(String ccycode) {
		this.ccycode = ccycode;
	}
	
	public String getCcysymbol() {
		return ccysymbol;
	}
	
	public void setCcysymbol(String ccysymbol) {
		this.ccysymbol = ccysymbol;
	}
	
	public String getCcystatus() {
		return ccystatus;
	}
	
	public void setCcystatus(String ccystatus) {
		this.ccystatus = ccystatus;
	}
	
	public String getLastupdateddt() {
		if (lastupdateddt != null) {
			return DateUtils.datetostringtime(lastupdateddt);
		} else {
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
