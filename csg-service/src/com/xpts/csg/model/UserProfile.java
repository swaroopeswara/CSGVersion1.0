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
 * The persistent class for the USER_PROFILES database table.
 * 
 */
@Entity
@Table(name="USER_PROFILES")
@NamedQuery(name="UserProfile.findAll", query="SELECT u FROM UserProfile u")
public class UserProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal profileid;

	private BigDecimal roleid;

	private BigDecimal userid;

	@Id
	private BigDecimal userprofileid;

	public UserProfile() {
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

	public BigDecimal getUserid() {
		return this.userid;
	}

	public void setUserid(BigDecimal userid) {
		this.userid = userid;
	}

	public BigDecimal getUserprofileid() {
		return this.userprofileid;
	}

	public void setUserprofileid(BigDecimal userprofileid) {
		this.userprofileid = userprofileid;
	}

}