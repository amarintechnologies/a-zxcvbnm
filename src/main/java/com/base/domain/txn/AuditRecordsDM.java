
package com.base.domain.txn;

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
@Table(name = "t_base_audit_records")
public class AuditRecordsDM {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name = "SCREEN_ID")
		private Long screenId;
	@Column(name="audit_id") 
	private Long auditId;	
	 @Column(name="company_id") 
	private Long companyId;
	 @Column(name="table_name") 
	private String tableName="";	
	 @Column(name="column_name") 
	private String columnName="";
     @Column(name="old_cvalue") 
	private String oldCvalue="";
	 @Column(name="new_cvalue") 
	private String newCvalue="";
	 @Column(name="old_nvalue") 
	private Long oldNvalue;
	 @Column(name="new_nvalue") 
	private Long newNvalue;
	 @Column(name="old_dvalue") 
	private Date oldDtvalue;
	 @Column(name="new_dvalue") 
	private Date newDtvalue;
	 @Column(name="updated_by") 
	private String updatedBy="";
	 @Column(name="updated_dt") 
	private Date updatedDt	;
	 @Column(name="proc_name") 
	private String procName="";
	@Column(name="pk_value")
	private String pkValue="";
	public Long getScreenId() {
		return screenId;
	}
	
	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}
	
	public String getAuditId() {
		if(auditId!=null)
		{
			return auditId.toString();
		}
		else
		{
			return "";
		}
	}
	public void setAuditId(Long auditId) {
		this.auditId = auditId;
	}
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getOldCvalue() {
		return oldCvalue;
	}
	public void setOldCvalue(String oldCvalue) {
		this.oldCvalue = oldCvalue;
	}
	public String getNewCvalue() {
		return newCvalue;
	}
	public void setNewCvalue(String newCvalue) {
		this.newCvalue = newCvalue;
	}
	public Long getOldNvalue() {
		return oldNvalue;
	}
	public void setOldNvalue(Long oldNvalue) {
		this.oldNvalue = oldNvalue;
	}
	public Long getNewNvalue() {
		return newNvalue;
	}
	public void setNewNvalue(Long newNvalue) {
		this.newNvalue = newNvalue;
	}
	public String getOldDtvalue() {
		if(oldDtvalue!=null)
		{
		return DateUtils.datetostring(oldDtvalue);
		}
		else{
			return "";
		}
	}
	public void setOldDtvalue(Date oldDtvalue) {
		this.oldDtvalue = oldDtvalue;
	}
	public String getNewDtvalue() {
		if(newDtvalue!=null)
		{
		return DateUtils.datetostring(newDtvalue);
		}
		else{
			return "";
		}
	}
	public void setNewDtvalue(Date newDtvalue) {
		this.newDtvalue = newDtvalue;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedDt() {
		if(updatedDt!=null)
		{
		return DateUtils.datetostringtime(updatedDt);
		}
		else{
			return "";
		}
	}
	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}
	public String getProcName() {
		return procName;
	}
	public void setProcName(String procName) {
		this.procName = procName;
	}
	public String getPkValue() {
		return pkValue;
	}
	public void setPkValue(String pkValue) {
		this.pkValue = pkValue;
	}
	
	


}
