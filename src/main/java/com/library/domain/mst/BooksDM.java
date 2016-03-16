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

/**
 * @author gangaraj
 * 
 */
@Entity
@Table(name = "m_lib_book")
public class BooksDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long book_id;
	private Long company_id;
	private String book_title;
	private Long category_id;
	private String book_slno;
	private String isbn_no;
	private String auther;
	private String book_desc;
	private BigDecimal book_price;
	private Long ccy_id;

	private String status;
	private Date last_updated_dt;
	private String last_updated_by;
	@Transient
	private String bookCat;

	@Transient
	private String currenctName;

	public Long getBook_id() {
		return book_id;
	}

	public void setBook_id(Long book_id) {
		this.book_id = book_id;
	}

	public Long getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Long company_id) {
		this.company_id = company_id;
	}

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}

	public String getBook_slno() {
		return book_slno;
	}

	public void setBook_slno(String book_slno) {
		this.book_slno = book_slno;
	}

	public String getIsbn_no() {
		return isbn_no;
	}

	public void setIsbn_no(String isbn_no) {
		this.isbn_no = isbn_no;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getBook_desc() {
		return book_desc;
	}

	public void setBook_desc(String book_desc) {
		this.book_desc = book_desc;
	}

	public BigDecimal getBook_price() {
		return book_price;
	}

	public void setBook_price(BigDecimal book_price) {
		this.book_price = book_price;
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

	public String getBookCat() {
		return bookCat;
	}

	public void setBookCat(String bookCat) {
		this.bookCat = bookCat;
	}

	public Long getCcy_id() {
		return ccy_id;
	}

	public void setCcy_id(Long ccy_id) {
		this.ccy_id = ccy_id;
	}

	public String getCurrenctName() {
		return currenctName;
	}

	public void setCurrenctName(String currenctName) {
		this.currenctName = currenctName;
	}

}
