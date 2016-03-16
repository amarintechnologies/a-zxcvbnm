package com.base.domain.txn;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.erputil.util.DateUtils;

@Entity
@Table(name = "T_BASE_MESSAGES")
public class MessagesDM {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "MSG_ID")
	private Long messageid;
	@Column(name = "COMPANY_ID")
	private Long companyid;
	@Column(name = "MSG_TYPE")
	private String msgtype;
	@Column(name = "MSG_SENDER")
	private String msgsender;
	@Column(name = "MSG_RECEIVERS")
	private String msgreceiver;
	@Column(name = "MSG_CC")
	private String msgcc;
	@Column(name = "MSG_SUBJECT")
	private String msgsubject;
	@Column(name = "MSG_BODY")
	private String msgbody;
	@Column(name = "CLIENT_IP")
	private String clientip;
	@Column(name = "USER_ID")
	private Long userid;
	@Column(name = "MSG_RESPONSE")
	private String msgresponse;
	@Column(name = "MSG_STATUS")
	private String msgstatus;
	@Column(name = "MSG_SENT_DT")
	private Date msgsentdate;
	
	public Long getMessageid() {
		return messageid;
	}

	public void setMessageid(Long messageid) {
		this.messageid = messageid;
	}

	public String getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public String getMsgsender() {
		return msgsender;
	}

	public void setMsgsender(String msgsender) {
		this.msgsender = msgsender;
	}

	public String getMsgreceiver() {
		return msgreceiver;
	}

	public void setMsgreceiver(String msgreceiver) {
		this.msgreceiver = msgreceiver;
	}

	public String getMsgcc() {
		return msgcc;
	}

	public void setMsgcc(String msgcc) {
		this.msgcc = msgcc;
	}

	public String getMsgsubject() {
		return msgsubject;
	}

	public void setMsgsubject(String msgsubject) {
		this.msgsubject = msgsubject;
	}

	public String getMsgbody() {
		return msgbody;
	}

	public void setMsgbody(String msgbody) {
		this.msgbody = msgbody;
	}

	public String getClientip() {
		return clientip;
	}

	public void setClientip(String clientip) {
		this.clientip = clientip;
	}

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getMsgresponse() {
		return msgresponse;
	}

	public void setMsgresponse(String msgresponse) {
		this.msgresponse = msgresponse;
	}

	public String getMsgstatus() {
		return msgstatus;
	}

	public void setMsgstatus(String msgstatus) {
		this.msgstatus = msgstatus;
	}

	public String getMsgsentdate() {
		return DateUtils.datetostringtime(msgsentdate);
	}

	public Date getMsgsentdateinDt() {
		return msgsentdate;
	}

	public void setMsgsentdate(Date msgsentdate) {
		this.msgsentdate = msgsentdate;
	}
	
}
