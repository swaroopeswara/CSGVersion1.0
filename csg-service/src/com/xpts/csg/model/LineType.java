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
 * The persistent class for the LINE_TYPES database table.
 * 
 */
@Entity
@Table(name="LINE_TYPES")
@NamedQuery(name="LineType.findAll", query="SELECT l FROM LineType l")
public class LineType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUDITTRAIL_ID")
	private BigDecimal audittrailId;

	private String linetypedescr;

	@Id
	private BigDecimal linetypeid;

	public LineType() {
	}

	public BigDecimal getAudittrailId() {
		return this.audittrailId;
	}

	public void setAudittrailId(BigDecimal audittrailId) {
		this.audittrailId = audittrailId;
	}

	public String getLinetypedescr() {
		return this.linetypedescr;
	}

	public void setLinetypedescr(String linetypedescr) {
		this.linetypedescr = linetypedescr;
	}

	public BigDecimal getLinetypeid() {
		return this.linetypeid;
	}

	public void setLinetypeid(BigDecimal linetypeid) {
		this.linetypeid = linetypeid;
	}

}