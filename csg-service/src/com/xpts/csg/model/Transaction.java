package com.xpts.csg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * The persistent class for the TRANSACTIONS database table.
 * 
 */
@Entity
@Table(name="TRANSACTIONS")
@NamedQuery(name="Transaction.findAll", query="SELECT t FROM Transaction t")
public class Transaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="APPROVEREJ_USERID")
	private BigDecimal approverejUserid;

	@Temporal(TemporalType.DATE)
	private Date approverejdate;

	private String approverejind;

	@Column(name="ATTACHMENT_IND")
	private String attachmentInd;

	private BigDecimal attachmentcount;

	private String conscheckind;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	private BigDecimal documentcountinpack;

	private String notesclearedind;

	@Column(name="PARCEL_LINEAGEID")
	private BigDecimal parcelLineageid;

	@Column(name="TRANS_TRACKINGNO")
	private String transTrackingno;

	@Id
	@Column(name="TRANSACTION_ID")
	private BigDecimal transactionId;

	private BigDecimal transactionlineageid;

	@Column(name="TRANSACTIONTYPE_ID")
	private BigDecimal transactiontypeId;

	private String useracceptanceind;

	@Column(name="USERID_CREATED")
	private BigDecimal useridCreated;

	public Transaction() {
	}

	public BigDecimal getApproverejUserid() {
		return this.approverejUserid;
	}

	public void setApproverejUserid(BigDecimal approverejUserid) {
		this.approverejUserid = approverejUserid;
	}

	public Date getApproverejdate() {
		return this.approverejdate;
	}

	public void setApproverejdate(Date approverejdate) {
		this.approverejdate = approverejdate;
	}

	public String getApproverejind() {
		return this.approverejind;
	}

	public void setApproverejind(String approverejind) {
		this.approverejind = approverejind;
	}

	public String getAttachmentInd() {
		return this.attachmentInd;
	}

	public void setAttachmentInd(String attachmentInd) {
		this.attachmentInd = attachmentInd;
	}

	public BigDecimal getAttachmentcount() {
		return this.attachmentcount;
	}

	public void setAttachmentcount(BigDecimal attachmentcount) {
		this.attachmentcount = attachmentcount;
	}

	public String getConscheckind() {
		return this.conscheckind;
	}

	public void setConscheckind(String conscheckind) {
		this.conscheckind = conscheckind;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public BigDecimal getDocumentcountinpack() {
		return this.documentcountinpack;
	}

	public void setDocumentcountinpack(BigDecimal documentcountinpack) {
		this.documentcountinpack = documentcountinpack;
	}

	public String getNotesclearedind() {
		return this.notesclearedind;
	}

	public void setNotesclearedind(String notesclearedind) {
		this.notesclearedind = notesclearedind;
	}

	public BigDecimal getParcelLineageid() {
		return this.parcelLineageid;
	}

	public void setParcelLineageid(BigDecimal parcelLineageid) {
		this.parcelLineageid = parcelLineageid;
	}

	public String getTransTrackingno() {
		return this.transTrackingno;
	}

	public void setTransTrackingno(String transTrackingno) {
		this.transTrackingno = transTrackingno;
	}

	public BigDecimal getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(BigDecimal transactionId) {
		this.transactionId = transactionId;
	}

	public BigDecimal getTransactionlineageid() {
		return this.transactionlineageid;
	}

	public void setTransactionlineageid(BigDecimal transactionlineageid) {
		this.transactionlineageid = transactionlineageid;
	}

	public BigDecimal getTransactiontypeId() {
		return this.transactiontypeId;
	}

	public void setTransactiontypeId(BigDecimal transactiontypeId) {
		this.transactiontypeId = transactiontypeId;
	}

	public String getUseracceptanceind() {
		return this.useracceptanceind;
	}

	public void setUseracceptanceind(String useracceptanceind) {
		this.useracceptanceind = useracceptanceind;
	}

	public BigDecimal getUseridCreated() {
		return this.useridCreated;
	}

	public void setUseridCreated(BigDecimal useridCreated) {
		this.useridCreated = useridCreated;
	}

}