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
 * The persistent class for the TRANSURVEYDOCUMENTS database table.
 * 
 */
@Entity
@Table(name="TRANSURVEYDOCUMENTS")
@NamedQuery(name="Transurveydocument.findAll", query="SELECT t FROM Transurveydocument t")
public class Transurveydocument implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRANSURVEYDOCUMENTS_TRANSSURVDOCSID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRANSURVEYDOCUMENTS_TRANSSURVDOCSID_GENERATOR")
	private long transsurvdocsid;

	private String approvedrejind;

	@Temporal(TemporalType.DATE)
	private Date approverejdate;

	private BigDecimal approverejuserid;

	private String sgno;

	private BigDecimal transactionid;

	//bi-directional many-to-one association to DocumentType
	@ManyToOne
	@JoinColumn(name="DOCUMENTTYPE_ID")
	private DocumentType documentType;

	//bi-directional many-to-one association to Transbatch
	@ManyToOne
	@JoinColumn(name="BATCHID")
	private Transbatch transbatch;

	public Transurveydocument() {
	}

	public long getTranssurvdocsid() {
		return this.transsurvdocsid;
	}

	public void setTranssurvdocsid(long transsurvdocsid) {
		this.transsurvdocsid = transsurvdocsid;
	}

	public String getApprovedrejind() {
		return this.approvedrejind;
	}

	public void setApprovedrejind(String approvedrejind) {
		this.approvedrejind = approvedrejind;
	}

	public Date getApproverejdate() {
		return this.approverejdate;
	}

	public void setApproverejdate(Date approverejdate) {
		this.approverejdate = approverejdate;
	}

	public BigDecimal getApproverejuserid() {
		return this.approverejuserid;
	}

	public void setApproverejuserid(BigDecimal approverejuserid) {
		this.approverejuserid = approverejuserid;
	}

	public String getSgno() {
		return this.sgno;
	}

	public void setSgno(String sgno) {
		this.sgno = sgno;
	}

	public BigDecimal getTransactionid() {
		return this.transactionid;
	}

	public void setTransactionid(BigDecimal transactionid) {
		this.transactionid = transactionid;
	}

	public DocumentType getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	public Transbatch getTransbatch() {
		return this.transbatch;
	}

	public void setTransbatch(Transbatch transbatch) {
		this.transbatch = transbatch;
	}

}