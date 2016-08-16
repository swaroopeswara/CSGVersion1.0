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
 * The persistent class for the SUBDOCUMENT_TYPES database table.
 * 
 */
@Entity
@Table(name="SUBDOCUMENT_TYPES")
@NamedQuery(name="SubdocumentType.findAll", query="SELECT s FROM SubdocumentType s")
public class SubdocumentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUDITTRAIL_ID")
	private BigDecimal audittrailId;

	private BigDecimal maindoctypeid;

	private String subdoctypecode;

	private String subdoctypedescr;

	@Id
	private BigDecimal subdoctypeid;

	public SubdocumentType() {
	}

	public BigDecimal getAudittrailId() {
		return this.audittrailId;
	}

	public void setAudittrailId(BigDecimal audittrailId) {
		this.audittrailId = audittrailId;
	}

	public BigDecimal getMaindoctypeid() {
		return this.maindoctypeid;
	}

	public void setMaindoctypeid(BigDecimal maindoctypeid) {
		this.maindoctypeid = maindoctypeid;
	}

	public String getSubdoctypecode() {
		return this.subdoctypecode;
	}

	public void setSubdoctypecode(String subdoctypecode) {
		this.subdoctypecode = subdoctypecode;
	}

	public String getSubdoctypedescr() {
		return this.subdoctypedescr;
	}

	public void setSubdoctypedescr(String subdoctypedescr) {
		this.subdoctypedescr = subdoctypedescr;
	}

	public BigDecimal getSubdoctypeid() {
		return this.subdoctypeid;
	}

	public void setSubdoctypeid(BigDecimal subdoctypeid) {
		this.subdoctypeid = subdoctypeid;
	}

}