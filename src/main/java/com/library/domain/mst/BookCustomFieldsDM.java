package com.library.domain.mst;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.erputil.util.DateUtils;

@Entity
@Table(name = "m_lib_book_cfld_value")
public class BookCustomFieldsDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bkcfld_valid;
	private Long book_id;
	private Long field_id;
	private String column_name;
	private String column_tvalue;
	private Date column_dvalue;
	private BigDecimal column_nvalue;
	private String status;
	private Date last_updated_dt;
	private String last_updated_by;

	@Transient
	private String bookName;

	@Transient
	private String feildName;

	public Long getBkcfld_valid() {
		return bkcfld_valid;
	}

	public void setBkcfld_valid(Long bkcfld_valid) {
		this.bkcfld_valid = bkcfld_valid;
	}

	public Long getBook_id() {
		return book_id;
	}

	public void setBook_id(Long book_id) {
		this.book_id = book_id;
	}

	public Long getField_id() {
		return field_id;
	}

	public void setField_id(Long field_id) {
		this.field_id = field_id;
	}

	public String getColumn_name() {
		return column_name;
	}

	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}

	public String getColumn_tvalue() {
		return column_tvalue;
	}

	public void setColumn_tvalue(String column_tvalue) {
		this.column_tvalue = column_tvalue;
	}

	public Date getColumn_dvalue() {
		return column_dvalue;
	}

	public void setColumn_dvalue(Date column_dvalue) {
		this.column_dvalue = column_dvalue;
	}

	public BigDecimal getColumn_nvalue() {
		return column_nvalue;
	}

	public void setColumn_nvalue(BigDecimal column_nvalue) {
		this.column_nvalue = column_nvalue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getFeildName() {
		return feildName;
	}

	public void setFeildName(String feildName) {
		this.feildName = feildName;
	}

}
