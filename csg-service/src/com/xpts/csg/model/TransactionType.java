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
 * The persistent class for the TRANSACTION_TYPES database table.
 * 
 */
@Entity
@Table(name="TRANSACTION_TYPES")
@NamedQuery(name="TransactionType.findAll", query="SELECT t FROM TransactionType t")
public class TransactionType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUDITTRAIL_ID")
	private BigDecimal audittrailId;

	private BigDecimal dockettypeid;

	@Column(name="TRANSACTIONTYPE_DESCR")
	private String transactiontypeDescr;

	@Id
	@Column(name="TRANSACTIONTYPE_ID")
	private BigDecimal transactiontypeId;

	public TransactionType() {
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

	public String getTransactiontypeDescr() {
		return this.transactiontypeDescr;
	}

	public void setTransactiontypeDescr(String transactiontypeDescr) {
		this.transactiontypeDescr = transactiontypeDescr;
	}

	public BigDecimal getTransactiontypeId() {
		return this.transactiontypeId;
	}

	public void setTransactiontypeId(BigDecimal transactiontypeId) {
		this.transactiontypeId = transactiontypeId;
	}

}