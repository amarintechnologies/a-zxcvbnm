package com.erputil.domain;

import java.io.Serializable;

public class StatusDM implements Serializable{

	private String code;
	private String desc;
	
	public StatusDM(){
		
	}
	public StatusDM(String code,String desc){
		this.code = code;
		this.desc = desc;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
