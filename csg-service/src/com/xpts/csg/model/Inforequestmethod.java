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
 * The persistent class for the INFOREQUESTMETHODS database table.
 * 
 */
@Entity
@Table(name="INFOREQUESTMETHODS")
@NamedQuery(name="Inforequestmethod.findAll", query="SELECT i FROM Inforequestmethod i")
public class Inforequestmethod implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUDITTRAIL_ID")
	private BigDecimal audittrailId;

	@Column(name="INFOREQMETHOD_DESCR")
	private String inforeqmethodDescr;

	@Id
	@Column(name="INFOREQMETHOD_ID")
	private BigDecimal inforeqmethodId;

	public Inforequestmethod() {
	}

	public BigDecimal getAudittrailId() {
		return this.audittrailId;
	}

	public void setAudittrailId(BigDecimal audittrailId) {
		this.audittrailId = audittrailId;
	}

	public String getInforeqmethodDescr() {
		return this.inforeqmethodDescr;
	}

	public void setInforeqmethodDescr(String inforeqmethodDescr) {
		this.inforeqmethodDescr = inforeqmethodDescr;
	}

	public BigDecimal getInforeqmethodId() {
		return this.inforeqmethodId;
	}

	public void setInforeqmethodId(BigDecimal inforeqmethodId) {
		this.inforeqmethodId = inforeqmethodId;
	}

}