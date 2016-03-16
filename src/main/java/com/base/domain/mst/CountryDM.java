
package com.base.domain.mst;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_base_country")
public class CountryDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "country_id")
	private Long countryID;
	@Column(name = "country_name")
	private String countryName;
	@Column(name = "country_code")
	private String countryCode;
	@Column(name = "isd_code")
	private String isdcode;
	@Column(name = "primary_lang")
	private String primaryLang;
	@Column(name = "country_status")
	private String countyStats;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastUpdateBy;
	@Column(name = "timezone_id")
	private Long timeZoneId;
	@Column(name = "day_light_save")
	private String daylightsave;
	@Transient
	private String clockAdjust;
	@Transient
	private String timeZoneDesc;
	@Transient
	private String timezonename;

	public CountryDM() {
	}

	public CountryDM(Long countryid, String countryname, String countrycode) {
		this.countryID = countryid;
		this.countryName = countryname;
		this.countryCode = countrycode;
	}

	public CountryDM(Long countryid, String countryname, String countrycode,
			Long timezoneId) {
		this.countryID = countryid;
		this.countryName = countryname;
		this.countryCode = countrycode;
		this.timeZoneId = timezoneId;
	}

	public Long getTimeZoneId() {
		return timeZoneId;
	}

	public void setTimeZoneId(Long timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	public String getClockAdjust() {
		return clockAdjust;
	}

	public void setClockAdjust(String clockAdjust) {
		this.clockAdjust = clockAdjust;
	}

	public String getTimeZoneDesc() {
		return timeZoneDesc;
	}

	public void setTimeZoneDesc(String timeZoneDesc) {
		this.timeZoneDesc = timeZoneDesc;
	}

	public Long getCountryID() {
		return countryID;
	}

	public void setCountryID(Long countryID) {
		this.countryID = countryID;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getIsdcode() {
		return isdcode;
	}

	public void setIsdcode(String isdcode) {
		this.isdcode = isdcode;
	}

	public String getPrimaryLang() {
		return primaryLang;
	}

	public void setPrimaryLang(String primaryLang) {
		this.primaryLang = primaryLang;
	}

	public String getCountyStats() {
		return countyStats;
	}

	public void setCountyStats(String countyStats) {
		this.countyStats = countyStats;
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

	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	public String getDaylightsave() {
		return daylightsave;
	}

	public void setDaylightsave(String daylightsave) {
		this.daylightsave = daylightsave;
	}

	public String getTimezonename() {
		return timezonename;
	}

	public void setTimezonename(String timezonename) {
		this.timezonename = timezonename;
	}
}
