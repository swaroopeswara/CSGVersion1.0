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
 * The persistent class for the TOWNS database table.
 * 
 */
@Entity
@Table(name="TOWNS")
@NamedQuery(name="Town.findAll", query="SELECT t FROM Town t")
public class Town implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUDITTRAIL_ID")
	private BigDecimal audittrailId;

	private BigDecimal provinceid;

	private String regioncode;

	private String regiondescr;

	@Id
	private BigDecimal townid;

	public Town() {
	}

	public BigDecimal getAudittrailId() {
		return this.audittrailId;
	}

	public void setAudittrailId(BigDecimal audittrailId) {
		this.audittrailId = audittrailId;
	}

	public BigDecimal getProvinceid() {
		return this.provinceid;
	}

	public void setProvinceid(BigDecimal provinceid) {
		this.provinceid = provinceid;
	}

	public String getRegioncode() {
		return this.regioncode;
	}

	public void setRegioncode(String regioncode) {
		this.regioncode = regioncode;
	}

	public String getRegiondescr() {
		return this.regiondescr;
	}

	public void setRegiondescr(String regiondescr) {
		this.regiondescr = regiondescr;
	}

	public BigDecimal getTownid() {
		return this.townid;
	}

	public void setTownid(BigDecimal townid) {
		this.townid = townid;
	}

}