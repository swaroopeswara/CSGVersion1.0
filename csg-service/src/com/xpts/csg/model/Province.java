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
 * The persistent class for the PROVINCES database table.
 * 
 */
@Entity
@Table(name="PROVINCES")
@NamedQuery(name="Province.findAll", query="SELECT p FROM Province p")
public class Province implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUDITTRAIL_ID")
	private BigDecimal audittrailId;

	private String provcode;

	private String provdescr;

	@Id
	private BigDecimal provinceid;

	public Province() {
	}

	public BigDecimal getAudittrailId() {
		return this.audittrailId;
	}

	public void setAudittrailId(BigDecimal audittrailId) {
		this.audittrailId = audittrailId;
	}

	public String getProvcode() {
		return this.provcode;
	}

	public void setProvcode(String provcode) {
		this.provcode = provcode;
	}

	public String getProvdescr() {
		return this.provdescr;
	}

	public void setProvdescr(String provdescr) {
		this.provdescr = provdescr;
	}

	public BigDecimal getProvinceid() {
		return this.provinceid;
	}

	public void setProvinceid(BigDecimal provinceid) {
		this.provinceid = provinceid;
	}

}