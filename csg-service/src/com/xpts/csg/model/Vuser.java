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
 * The persistent class for the VUSERS database table.
 * 
 */
@Entity
@Table(name="VUSERS")
@NamedQuery(name="Vuser.findAll", query="SELECT v FROM Vuser v")
public class Vuser implements Serializable {
	private static final long serialVersionUID = 1L;

	private String emailaddress;

	private String name;

	private String pagename;

	private String password;

	private String plsnumber;

	private BigDecimal processid;

	private String processname;

	private BigDecimal profileid;

	private String roledescr;

	private BigDecimal roleid;

	private BigDecimal subprocessid;

	private String subprocessname;

	@Id
	private BigDecimal userid;

	private String username;

	public Vuser() {
	}

	public String getEmailaddress() {
		return this.emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPagename() {
		return this.pagename;
	}

	public void setPagename(String pagename) {
		this.pagename = pagename;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPlsnumber() {
		return this.plsnumber;
	}

	public void setPlsnumber(String plsnumber) {
		this.plsnumber = plsnumber;
	}

	public BigDecimal getProcessid() {
		return this.processid;
	}

	public void setProcessid(BigDecimal processid) {
		this.processid = processid;
	}

	public String getProcessname() {
		return this.processname;
	}

	public void setProcessname(String processname) {
		this.processname = processname;
	}

	public BigDecimal getProfileid() {
		return this.profileid;
	}

	public void setProfileid(BigDecimal profileid) {
		this.profileid = profileid;
	}

	public String getRoledescr() {
		return this.roledescr;
	}

	public void setRoledescr(String roledescr) {
		this.roledescr = roledescr;
	}

	public BigDecimal getRoleid() {
		return this.roleid;
	}

	public void setRoleid(BigDecimal roleid) {
		this.roleid = roleid;
	}

	public BigDecimal getSubprocessid() {
		return this.subprocessid;
	}

	public void setSubprocessid(BigDecimal subprocessid) {
		this.subprocessid = subprocessid;
	}

	public String getSubprocessname() {
		return this.subprocessname;
	}

	public void setSubprocessname(String subprocessname) {
		this.subprocessname = subprocessname;
	}

	public BigDecimal getUserid() {
		return this.userid;
	}

	public void setUserid(BigDecimal userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}