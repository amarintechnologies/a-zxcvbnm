package com.erputil.domain;

public class GenderDM {
	private String code;
	private String desc;
	public GenderDM(String code,String desc){
		this.code = code;
		this.desc = desc;
	}
	
	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
