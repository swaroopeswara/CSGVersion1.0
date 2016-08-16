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
 * The persistent class for the INFOREQDETAIL database table.
 * 
 */
@Entity
@NamedQuery(name="Inforeqdetail.findAll", query="SELECT i FROM Inforeqdetail i")
public class Inforeqdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="INFOREQDETAIL_ID")
	private BigDecimal inforeqdetailId;

	@Column(name="INFOREQTYPE_ID")
	private BigDecimal inforeqtypeId;

	private BigDecimal informationreqid;

	private String requestdatastring;

	public Inforeqdetail() {
	}

	public BigDecimal getInforeqdetailId() {
		return this.inforeqdetailId;
	}

	public void setInforeqdetailId(BigDecimal inforeqdetailId) {
		this.inforeqdetailId = inforeqdetailId;
	}

	public BigDecimal getInforeqtypeId() {
		return this.inforeqtypeId;
	}

	public void setInforeqtypeId(BigDecimal inforeqtypeId) {
		this.inforeqtypeId = inforeqtypeId;
	}

	public BigDecimal getInformationreqid() {
		return this.informationreqid;
	}

	public void setInformationreqid(BigDecimal informationreqid) {
		this.informationreqid = informationreqid;
	}

	public String getRequestdatastring() {
		return this.requestdatastring;
	}

	public void setRequestdatastring(String requestdatastring) {
		this.requestdatastring = requestdatastring;
	}

}