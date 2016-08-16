package com.xpts.csg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

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
 * The persistent class for the COMMSLOG database table.
 * 
 */
@Entity
@NamedQuery(name="Commslog.findAll", query="SELECT c FROM Commslog c")
public class Commslog implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal commfromsuserid;

	@Temporal(TemporalType.DATE)
	private Date commsdatetime;

	private String commsemailaddress;

	private BigDecimal commspointprocessid;

	private String commssuccessind;

	private BigDecimal commstouserid;

	private BigDecimal informatioreqid;

	private BigDecimal transactionid;

	@Id
	private BigDecimal transcommsid;

	public Commslog() {
	}

	public BigDecimal getCommfromsuserid() {
		return this.commfromsuserid;
	}

	public void setCommfromsuserid(BigDecimal commfromsuserid) {
		this.commfromsuserid = commfromsuserid;
	}

	public Date getCommsdatetime() {
		return this.commsdatetime;
	}

	public void setCommsdatetime(Date commsdatetime) {
		this.commsdatetime = commsdatetime;
	}

	public String getCommsemailaddress() {
		return this.commsemailaddress;
	}

	public void setCommsemailaddress(String commsemailaddress) {
		this.commsemailaddress = commsemailaddress;
	}

	public BigDecimal getCommspointprocessid() {
		return this.commspointprocessid;
	}

	public void setCommspointprocessid(BigDecimal commspointprocessid) {
		this.commspointprocessid = commspointprocessid;
	}

	public String getCommssuccessind() {
		return this.commssuccessind;
	}

	public void setCommssuccessind(String commssuccessind) {
		this.commssuccessind = commssuccessind;
	}

	public BigDecimal getCommstouserid() {
		return this.commstouserid;
	}

	public void setCommstouserid(BigDecimal commstouserid) {
		this.commstouserid = commstouserid;
	}

	public BigDecimal getInformatioreqid() {
		return this.informatioreqid;
	}

	public void setInformatioreqid(BigDecimal informatioreqid) {
		this.informatioreqid = informatioreqid;
	}

	public BigDecimal getTransactionid() {
		return this.transactionid;
	}

	public void setTransactionid(BigDecimal transactionid) {
		this.transactionid = transactionid;
	}

	public BigDecimal getTranscommsid() {
		return this.transcommsid;
	}

	public void setTranscommsid(BigDecimal transcommsid) {
		this.transcommsid = transcommsid;
	}

}