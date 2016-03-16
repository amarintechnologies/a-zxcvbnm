package com.base.domain.mst;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "m_base_timezone")
public class TimeZoneDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "TIMEZONE_ID")
	private Long timezoneid;
	@Column(name = "TIMEZONE_CODE")
	private String timezonecode;
	@Column(name = "TIMEZONE_DESC")
	private String timezonedesc;
	@Column(name = "CLOCK_ADJUST")
	private String clockadjust;
	
	public TimeZoneDM() {
	}
	
	public TimeZoneDM(Long timeZoneId, String timeZoneCode, String timeZoneDesc) {
		this.timezoneid = timeZoneId;
		this.timezonecode = timeZoneCode;
		this.timezonedesc = timeZoneDesc;
	}
	
	public Long getTimezoneid() {
		return timezoneid;
	}
	
	public void setTimezoneid(Long timezoneid) {
		this.timezoneid = timezoneid;
	}
	
	public String getTimezonecode() {
		return timezonecode;
	}
	
	public void setTimezonecode(String timezonecode) {
		this.timezonecode = timezonecode;
	}
	
	public String getTimezonedesc() {
		return timezonedesc;
	}
	
	public void setTimezonedesc(String timezonedesc) {
		this.timezonedesc = timezonedesc;
	}
	
	public String getClockadjust() {
		return clockadjust;
	}
	
	public void setClockadjust(String clockadjust) {
		this.clockadjust = clockadjust;
	}
}
