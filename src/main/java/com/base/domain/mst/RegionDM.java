
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
@Table(name = "m_base_region")
public class RegionDM implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "REGION_ID")
	private Long regionId;
	@Column(name = "REGION_NAME")
	private String regionName;
	@Column(name = "COMPANY_ID")
	private Long companyid;
	@Column(name = "COUNTRY_ID")
	private Long countryId;
	@Column(name = "REGION_STATUS")
	private String status;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastUpdatedDt;
	@Column(name = "LAST_UPDATED_BY")
	private String lastUpdatedBy;
	@Transient
	private String countryname;
	
	public RegionDM() {
	}
	
	public RegionDM(Long regionid, String regionname) {
		this.regionId = regionid;
		this.regionName = regionname;
	}
	
	public String getCountryname() {
		return countryname;
	}
	
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	
	public String getRegionId() {
		if (regionId != null) {
			return regionId.toString();
		} else {
			return "";
		}
	}
	
	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}
	
	public String getRegionName() {
		return regionName;
	}
	
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	
	public Long getCompanyid() {
		return companyid;
	}
	
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	
	public Long getCountryId() {
		return countryId;
	}
	
	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
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
}
