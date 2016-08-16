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
 * The persistent class for the PROFILES database table.
 * 
 */
@Entity
@Table(name="PROFILES")
@NamedQuery(name="Profile.findAll", query="SELECT p FROM Profile p")
public class Profile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private BigDecimal profileid;

	private BigDecimal roleid;

	//bi-directional many-to-one association to BusinessProcess
	@ManyToOne
	@JoinColumn(name="PROCESSID")
	private BusinessProcess businessProcess1;

	//bi-directional many-to-one association to BusinessProcess
	@ManyToOne
	@JoinColumn(name="SUBPROCESSID")
	private BusinessProcess businessProcess2;

	public Profile() {
	}

	public BigDecimal getProfileid() {
		return this.profileid;
	}

	public void setProfileid(BigDecimal profileid) {
		this.profileid = profileid;
	}

	public BigDecimal getRoleid() {
		return this.roleid;
	}

	public void setRoleid(BigDecimal roleid) {
		this.roleid = roleid;
	}

	public BusinessProcess getBusinessProcess1() {
		return this.businessProcess1;
	}

	public void setBusinessProcess1(BusinessProcess businessProcess1) {
		this.businessProcess1 = businessProcess1;
	}

	public BusinessProcess getBusinessProcess2() {
		return this.businessProcess2;
	}

	public void setBusinessProcess2(BusinessProcess businessProcess2) {
		this.businessProcess2 = businessProcess2;
	}

}