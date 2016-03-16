
package com.base.domain.mst;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_base_static_codes")
public class StaticCodesDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "TABLE_NAME")
	private String tblName;
	@Column(name = "COLUMN_NAME")
	private String columnName;
	@Column(name = "STATIC_KEY")
	private String staticKey;
	@Column(name = "STATIC_VALUE")
	private String staticValue;
	@Column(name = "ORDER_BY")
	private Long orderBy;

	public StaticCodesDM(){
		
	}
	public String getTblName() {
		return tblName;
	}

	public void setTblName(String tblName) {
		this.tblName = tblName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getStaticKey() {
		return staticKey;
	}

	public void setStaticKey(String staticKey) {
		this.staticKey = staticKey;
	}

	public String getStaticValue() {
		return staticValue;
	}

	public void setStaticValue(String staticValue) {
		this.staticValue = staticValue;
	}

	public Long getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(Long orderBy) {
		this.orderBy = orderBy;
	}
}
