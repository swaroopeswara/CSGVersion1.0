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
 * The persistent class for the INFOREQUEST_TYPES database table.
 * 
 */
@Entity
@Table(name="INFOREQUEST_TYPES")
@NamedQuery(name="InforequestType.findAll", query="SELECT i FROM InforequestType i")
public class InforequestType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUDITTRAIL_ID")
	private BigDecimal audittrailId;

	@Column(name="INFOREQTYPE_DESCR")
	private String inforeqtypeDescr;

	@Id
	@Column(name="INFOREQTYPE_ID")
	private BigDecimal inforeqtypeId;

	public InforequestType() {
	}

	public BigDecimal getAudittrailId() {
		return this.audittrailId;
	}

	public void setAudittrailId(BigDecimal audittrailId) {
		this.audittrailId = audittrailId;
	}

	public String getInforeqtypeDescr() {
		return this.inforeqtypeDescr;
	}

	public void setInforeqtypeDescr(String inforeqtypeDescr) {
		this.inforeqtypeDescr = inforeqtypeDescr;
	}

	public BigDecimal getInforeqtypeId() {
		return this.inforeqtypeId;
	}

	public void setInforeqtypeId(BigDecimal inforeqtypeId) {
		this.inforeqtypeId = inforeqtypeId;
	}

}