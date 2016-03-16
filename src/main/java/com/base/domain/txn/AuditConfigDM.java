
package com.base.domain.txn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "t_base_audit_config")
public class AuditConfigDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "config_id")
	private Long configId;
	@Column(name = "company_id")
	private Long companyId;
	@Column(name = "table_name")
	private String tableName = "";
	@Column(name = "column_name")
	private String columnName = "";
	@Column(name = "audit_event")
	private String auditEvent = "";
	@Column(name = "on_off")
	private String onOff = "";
	@Column(name = "screen_id")
	private Long screenid;
	@Column(name = "scr_fld_name")
	private String scrFldName;
	@Transient
	private String screendesc;
	
	public String getScrFldName() {
		return scrFldName;
	}
	
	public void setScrFldName(String scrFldName) {
		this.scrFldName = scrFldName;
	}
	
	public Long getScreenid() {
		return screenid;
	}
	
	public void setScreenid(Long screenid) {
		this.screenid = screenid;
	}
	
	public String getScreendesc() {
		return screendesc;
	}
	
	public void setScreendesc(String screendesc) {
		this.screendesc = screendesc;
	}
	
	public Long getConfigId() {
		return configId;
	}
	
	public void setConfigId(Long configId) {
		this.configId = configId;
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
	
	public String getAuditEvent() {
		return auditEvent;
	}
	
	public void setAuditEvent(String auditEvent) {
		this.auditEvent = auditEvent;
	}
	
	public String getOnOff() {
		return onOff;
	}
	
	public void setOnOff(String onOff) {
		this.onOff = onOff;
	}
}
