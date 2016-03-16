
package com.base.domain.mst;

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
@Table(name = "m_base_city")
public class CityDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CITY_ID")
	private Long cityid;
	@Column(name = "CITY_NAME")
	private String cityname;
	@Column(name = "TIER")
	private String tier;
	@Column(name = "CITY_STATUS")
	private String status;
	@Column(name = "STATE_ID")
	private Long stateId;
	@Column(name = "REGION_ID")
	private Long regionId;
	@Column(name = "COMPANY_ID")
	private Long companyid;
	@Column(name = "LAST_UPDATED_DT")
	private Date lastupdateddt;
	@Column(name = "LAST_UPDATED_BY")
	private String lastupdatedby;
	@Column(name = "COUNTRY_ID")
	private Long countryid;
	@Column(name = "TIMEZONE_ID")
	private Long timezoneid;
	@Transient
	private String statename;
	@Transient
	private String regionname;
	@Transient
	private String countryname;
	@Transient
	private String timezonename;
	public String getTimezonename() {
		return timezonename;
	}

	public void setTimezonename(String timezonename) {
		this.timezonename = timezonename;
	}

	@Transient
	private String timezonedesc;
	
	public CityDM() {
	}
	
	public CityDM(Long cityid, String cityname, String statename) {
		this.cityid = cityid;
		this.cityname = cityname;
		this.statename = statename;
	}
	
	public void setRegionname(String regionname) {
		this.regionname = regionname;
	}
	
	public void setStatename(String statename) {
		this.statename = statename;
	}
	
	public Long getStateId() {
		return stateId;
	}
	
	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}
	
	public Long getRegionId() {
		return regionId;
	}
	
	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}
	
	public String getStatename() {
		return statename;
	}
	
	public String getRegionname() {
		return regionname;
	}
	
	public String getCityid() {
		if (cityid != null) {
			return cityid.toString();
		} else {
			return "";
		}
	}
	
	public void setCityid(Long cityid) {
		this.cityid = cityid;
	}
	
	public String getCountryname() {
		return countryname;
	}
	
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	
	public String getTimezonedesc() {
		return timezonedesc;
	}
	
	public void setTimezonedesc(String timezonedesc) {
		this.timezonedesc = timezonedesc;
	}
	
	public Long getCountryid() {
		return countryid;
	}
	
	public void setCountryid(Long countryid) {
		this.countryid = countryid;
	}
	
	public Long getTimezoneid() {
		return timezoneid;
	}
	
	public void setTimezoneid(Long timezoneid) {
		this.timezoneid = timezoneid;
	}
	
	public String getTier() {
		return tier;
	}
	
	public void setTier(String tier) {
		this.tier = tier;
	}
	
	public Long getCompanyid() {
		return companyid;
	}
	
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	
	public String getCityname() {
		return cityname;
	}
	
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
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
