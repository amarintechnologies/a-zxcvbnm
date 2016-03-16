package com.library.domain.txn;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.erputil.util.DateUtils;

@Entity
@Table(name = "t_lib_book_renewal")
public class BookRenewalDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "renew_id")
	private Long renewid;
	@Column(name = "issue_id")
	private Long issueid;
	@Column(name = "book_id")
	private Long bookid;
	@Column(name = "renew_date")
	private Date renewdate;
	@Column(name = "return_date")
	private Date returndate;
	@Column(name = "renewd_by")
	private Long renewdby;
	@Column(name = "renew_remarks")
	private String renewdremarks;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastupdateddt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;
	@Transient
	private String book_title;
	@Transient
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Long getRenewid() {
		return renewid;
	}

	public void setRenewid(Long renewid) {
		this.renewid = renewid;
	}

	public Long getIssueid() {
		return issueid;
	}

	public void setIssueid(Long issueid) {
		this.issueid = issueid;
	}

	public Long getBookid() {
		return bookid;
	}

	public void setBookid(Long bookid) {
		this.bookid = bookid;
	}

	public Date getRenewdatedtdt() {
		return renewdate;
	}

	public String getRenewdate() {
		if (renewdate != null) {
			return DateUtils.datetostring(renewdate);
		} else {
			return "";
		}
	}

	public void setRenewdate(Date renewdate) {
		this.renewdate = renewdate;
	}

	public Date getReturndatedt() {
		return returndate;
	}

	public String getReturndate() {
		if (returndate != null) {
			return DateUtils.datetostring(returndate);
		} else {
			return "";
		}
	}

	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}

	public Long getRenewdby() {
		return renewdby;
	}

	public void setRenewdby(Long renewdby) {
		this.renewdby = renewdby;
	}

	public String getRenewdremarks() {
		return renewdremarks;
	}

	public void setRenewdremarks(String renewdremarks) {
		this.renewdremarks = renewdremarks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLastupdateddt() {

		if (lastupdateddt != null) {
			return DateUtils.datetostringtime(lastupdateddt);
		} else {
			return "";
		}

	}

	public void setLastupdateddt(Date lastupdateddt) {
		this.lastupdateddt = lastupdateddt;
	}

	public String getLastupdatedby() {
		return lastupdatedby;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public Date getRenewdatedt() {
		return renewdate;
	}

}
