package com.base.domain.mst;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_base_custom_fields")
public class CustomFieldsDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long field_id;
	private String table_name;
	private String column_name;
	private String data_type;
	private String default_value;
	private Long order_by;
	private String cf_status;
	private Date last_updated_dt;
	private String last_updated_by;
	public Long getField_id() {
		return field_id;
	}
	public void setField_id(Long field_id) {
		this.field_id = field_id;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public String getColumn_name() {
		return column_name;
	}
	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}
	public String getData_type() {
		return data_type;
	}
	public void setData_type(String data_type) {
		this.data_type = data_type;
	}
	public String getDefault_value() {
		return default_value;
	}
	public void setDefault_value(String default_value) {
		this.default_value = default_value;
	}
	public Long getOrder_by() {
		return order_by;
	}
	public void setOrder_by(Long order_by) {
		this.order_by = order_by;
	}
	
	public String getCf_status() {
		return cf_status;
	}
	public void setCf_status(String cf_status) {
		this.cf_status = cf_status;
	}
	public String getLast_updated_dt() {
		if (last_updated_dt != null) {
			return DateUtils.datetostringtime(last_updated_dt);
		} else {
			return "";
		}
	}
	public void setLast_updated_dt(Date last_updated_dt) {
		this.last_updated_dt = last_updated_dt;
	}
	public String getLast_updated_by() {
		return last_updated_by;
	}
	public void setLast_updated_by(String last_updated_by) {
		this.last_updated_by = last_updated_by;
	}
	

}
