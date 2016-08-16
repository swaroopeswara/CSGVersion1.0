package com.xpts.csg.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
 * The persistent class for the AUDIT_TRAIL database table.
 * 
 */
@Entity
@Table(name="AUDIT_TRAIL")
@NamedQuery(name="AuditTrail.findAll", query="SELECT a FROM AuditTrail a")
public class AuditTrail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date actiondate;

	private String actionind;
	
	@Id
	@Column(name="AUDITTRAIL_ID")
	private BigDecimal audittrailId;

	@Column(name="TABLEFIELDS_ONUPDDEL")
	private String tablefieldsOnupddel;

	private String tablename;

	private BigDecimal transactiontypeid;

	private BigDecimal uniquetabrecidentifier;

	private BigDecimal userid;

	public AuditTrail() {
	}

	public Date getActiondate() {
		return this.actiondate;
	}

	public void setActiondate(Date actiondate) {
		this.actiondate = actiondate;
	}

	public String getActionind() {
		return this.actionind;
	}

	public void setActionind(String actionind) {
		this.actionind = actionind;
	}

	public BigDecimal getAudittrailId() {
		return this.audittrailId;
	}

	public void setAudittrailId(BigDecimal audittrailId) {
		this.audittrailId = audittrailId;
	}

	public String getTablefieldsOnupddel() {
		return this.tablefieldsOnupddel;
	}

	public void setTablefieldsOnupddel(String tablefieldsOnupddel) {
		this.tablefieldsOnupddel = tablefieldsOnupddel;
	}

	public String getTablename() {
		return this.tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public BigDecimal getTransactiontypeid() {
		return this.transactiontypeid;
	}

	public void setTransactiontypeid(BigDecimal transactiontypeid) {
		this.transactiontypeid = transactiontypeid;
	}

	public BigDecimal getUniquetabrecidentifier() {
		return this.uniquetabrecidentifier;
	}

	public void setUniquetabrecidentifier(BigDecimal uniquetabrecidentifier) {
		this.uniquetabrecidentifier = uniquetabrecidentifier;
	}

	public BigDecimal getUserid() {
		return this.userid;
	}

	public void setUserid(BigDecimal userid) {
		this.userid = userid;
	}

}