package com.erputil.domain;

import java.io.Serializable;

public class CreditDebitDM implements Serializable 
{
 
 private static final long serialVersionUID = 1L;
private String code;
 private String desc;
 
 public CreditDebitDM(String code,String desc){
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

