package com.xpts.csg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CSG_USER")
public class CsgUser implements Serializable {

	private static final long serialVersionUID = -5402959135226322993L;
	@Id	
	@SequenceGenerator(name = "CSG_USER_ID_GEN", sequenceName = "CSG_USER_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CSG_USER_ID_GEN")
	@Column(name="USER_ID")
	private Integer id;	
	@Column(name="USER_IND", nullable=false, length=1)
	private Integer indicator;
	@Column(name="NAME", nullable=false, length=50)
	private String name;
	@Column(name="USER_NAME", nullable=false, length=20)
	private String username;
	@Column(name="PASSWORD", nullable=false, length=20)
	private String password;
	@Column(name="EMAIL_ADDRESS", nullable=false, length=80)
	private String emailAddress;
	@Column(name="PLS_NUMBER", nullable=true, length=15)
	private String plsNumber;
	@Column(name="AUDIT_TRAIL_ID", nullable=false)
	private Integer auditTrailID;

	public CsgUser(){		
	}

	public Integer getId() {
		return id;
	}

	public Integer getIndicator() {
		return indicator;
	}

	public void setIndicator(Integer indicator) {
		this.indicator = indicator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPlsNumber() {
		return plsNumber;
	}

	public void setPlsNumber(String plsNumber) {
		this.plsNumber = plsNumber;
	}

	public Integer getAuditTrailID() {
		return auditTrailID;
	}

	public void setAuditTrailID(Integer auditTrailID) {
		this.auditTrailID = auditTrailID;
	}
	
}