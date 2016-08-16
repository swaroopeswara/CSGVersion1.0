package com.xpts.csg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

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
 * The persistent class for the TRANSACTION_DOCS database table.
 * 
 */
@Entity
@Table(name="TRANSACTION_DOCS")
@NamedQuery(name="TransactionDoc.findAll", query="SELECT t FROM TransactionDoc t")
public class TransactionDoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUDITTRAIL_ID")
	private BigDecimal audittrailId;

	private BigDecimal dockettypeid;

	private String documentfullpath;

	private BigDecimal transactionid;

	@Id
	@Column(name="TRANSACTIONTYPE_ID")
	private BigDecimal transactiontypeId;

	//bi-directional many-to-one association to DocumentType
	@ManyToOne
	@JoinColumn(name="DOCUMENTTYPE_ID")
	private DocumentType documentType;

	public TransactionDoc() {
	}

	public BigDecimal getAudittrailId() {
		return this.audittrailId;
	}

	public void setAudittrailId(BigDecimal audittrailId) {
		this.audittrailId = audittrailId;
	}

	public BigDecimal getDockettypeid() {
		return this.dockettypeid;
	}

	public void setDockettypeid(BigDecimal dockettypeid) {
		this.dockettypeid = dockettypeid;
	}

	public String getDocumentfullpath() {
		return this.documentfullpath;
	}

	public void setDocumentfullpath(String documentfullpath) {
		this.documentfullpath = documentfullpath;
	}

	public BigDecimal getTransactionid() {
		return this.transactionid;
	}

	public void setTransactionid(BigDecimal transactionid) {
		this.transactionid = transactionid;
	}

	public BigDecimal getTransactiontypeId() {
		return this.transactiontypeId;
	}

	public void setTransactiontypeId(BigDecimal transactiontypeId) {
		this.transactiontypeId = transactiontypeId;
	}

	public DocumentType getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

}