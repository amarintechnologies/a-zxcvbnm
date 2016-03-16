package com.library.domain.txn;

import java.math.BigDecimal;
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
@Table(name = "t_lib_book_issue")
public class BookIssueDM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "issue_id")
	private Long issueId;
	@Column(name = "book_id")
	private Long bookId;
	@Column(name = "issue_date")
	private Date issueDt;
	@Column(name = "company_id")
	private Long companyId;
	@Column(name = "student_id")
	private Long studentId;
	@Column(name = "return_date")
	private Date returnDt;
	@Column(name = "returned_date")
	private Date returnedDt;
	@Column(name = "issued_by")
	private Long issuedBy;
	@Column(name = "issue_remarks")
	private String issueRmrks;
	@Column(name = "return_remarks")
	private String returnRmrks;
	@Column(name = "late_days")
	private Long lateDays;
	@Column(name = "late_fee")
	private BigDecimal lateFees;
	@Column(name = "fee_paid")
	private Long feePaid;
	@Column(name = "paid_date")
	private Date paidDt;
	@Column(name = "pymt_ref")
	private String pymtRef;
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated_dt")
	private Date lastupdatetdt;
	@Column(name = "last_updated_by")
	private String lastupdatedby;
	@Transient
	private String book_title;
	@Transient
	private String firstName;

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Long getIssueId() {
		return issueId;
	}

	public void setIssueId(Long issueId) {
		this.issueId = issueId;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getIssueDt() {
		if (issueDt != null) {
			return DateUtils.datetostring(issueDt);
		} else {
			return "";
		}

	}

	public Date getIssueDtDt() {
		return issueDt;
	}

	public void setIssueDt(Date issueDt) {
		this.issueDt = issueDt;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getReturnDt() {

		if (returnDt != null) {
			return DateUtils.datetostring(returnDt);
		} else {
			return "";
		}
	}

	public Date getReturnDtDt() {
		return returnDt;
	}

	public void setReturnDt(Date returnDt) {
		this.returnDt = returnDt;
	}

	public String getReturnedDt() {

		if (returnedDt != null) {
			return DateUtils.datetostring(returnedDt);
		} else {
			return "";
		}
	}

	public Date getReturnedDtDt() {
		return returnedDt;
	}

	public void setReturnedDt(Date returnedDt) {
		this.returnedDt = returnedDt;
	}

	public Long getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(Long issuedBy) {
		this.issuedBy = issuedBy;
	}

	public String getIssueRmrks() {
		return issueRmrks;
	}

	public void setIssueRmrks(String issueRmrks) {
		this.issueRmrks = issueRmrks;
	}

	public String getReturnRmrks() {
		return returnRmrks;
	}

	public void setReturnRmrks(String returnRmrks) {
		this.returnRmrks = returnRmrks;
	}

	public Long getLateDays() {
		return lateDays;
	}

	public void setLateDays(Long lateDays) {
		this.lateDays = lateDays;
	}

	public BigDecimal getLateFees() {
		return lateFees;
	}

	public void setLateFees(BigDecimal lateFees) {
		this.lateFees = lateFees;
	}

	public Long getFeePaid() {
		return feePaid;
	}

	public void setFeePaid(Long feePaid) {
		this.feePaid = feePaid;
	}

	public String getPaidDt() {
		if (paidDt != null) {
			return DateUtils.datetostring(paidDt);
		} else {
			return "";
		}

	}

	public Date getPaidDtDt() {
		return paidDt;
	}

	public void setPaidDt(Date paidDt) {
		this.paidDt = paidDt;
	}

	public String getPymtRef() {
		return pymtRef;
	}

	public void setPymtRef(String pymtRef) {
		this.pymtRef = pymtRef;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLastupdatetdt() {
		if (lastupdatetdt != null) {
			return DateUtils.datetostringtime(lastupdatetdt);
		} else {
			return "";
		}
	}

	public void setLastupdatetdt(Date lastupdatetdt) {
		this.lastupdatetdt = lastupdatetdt;
	}

	public String getLastupdatedby() {
		return lastupdatedby;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}

}
