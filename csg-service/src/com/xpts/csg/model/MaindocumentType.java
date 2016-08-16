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
 * The persistent class for the MAINDOCUMENT_TYPES database table.
 * 
 */
@Entity
@Table(name="MAINDOCUMENT_TYPES")
@NamedQuery(name="MaindocumentType.findAll", query="SELECT m FROM MaindocumentType m")
public class MaindocumentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUDITTRAIL_ID")
	private BigDecimal audittrailId;

	private String maindoctypecode;

	private String maindoctypedescr;

	@Id
	private BigDecimal maindoctypeid;

	public MaindocumentType() {
	}

	public BigDecimal getAudittrailId() {
		return this.audittrailId;
	}

	public void setAudittrailId(BigDecimal audittrailId) {
		this.audittrailId = audittrailId;
	}

	public String getMaindoctypecode() {
		return this.maindoctypecode;
	}

	public void setMaindoctypecode(String maindoctypecode) {
		this.maindoctypecode = maindoctypecode;
	}

	public String getMaindoctypedescr() {
		return this.maindoctypedescr;
	}

	public void setMaindoctypedescr(String maindoctypedescr) {
		this.maindoctypedescr = maindoctypedescr;
	}

	public BigDecimal getMaindoctypeid() {
		return this.maindoctypeid;
	}

	public void setMaindoctypeid(BigDecimal maindoctypeid) {
		this.maindoctypeid = maindoctypeid;
	}

}