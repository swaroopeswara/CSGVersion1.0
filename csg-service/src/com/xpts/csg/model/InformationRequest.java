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
 * The persistent class for the INFORMATION_REQUESTS database table.
 * 
 */
@Entity
@Table(name="INFORMATION_REQUESTS")
@NamedQuery(name="InformationRequest.findAll", query="SELECT i FROM InformationRequest i")
public class InformationRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date completeddate;

	private String completedind;

	@Column(name="INFOREQMETHOD_ID")
	private BigDecimal inforeqmethodId;

	@Column(name="INFOREQTYPE_ID")
	private BigDecimal inforeqtypeId;

	@Id
	private BigDecimal informationreqid;

	private String inprocessind;

	private String receivedind;

	private String reqtrackingno;

	@Temporal(TemporalType.DATE)
	private Date requestdate;

	private BigDecimal requestuserid;

	public InformationRequest() {
	}

	public Date getCompleteddate() {
		return this.completeddate;
	}

	public void setCompleteddate(Date completeddate) {
		this.completeddate = completeddate;
	}

	public String getCompletedind() {
		return this.completedind;
	}

	public void setCompletedind(String completedind) {
		this.completedind = completedind;
	}

	public BigDecimal getInforeqmethodId() {
		return this.inforeqmethodId;
	}

	public void setInforeqmethodId(BigDecimal inforeqmethodId) {
		this.inforeqmethodId = inforeqmethodId;
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

	public String getInprocessind() {
		return this.inprocessind;
	}

	public void setInprocessind(String inprocessind) {
		this.inprocessind = inprocessind;
	}

	public String getReceivedind() {
		return this.receivedind;
	}

	public void setReceivedind(String receivedind) {
		this.receivedind = receivedind;
	}

	public String getReqtrackingno() {
		return this.reqtrackingno;
	}

	public void setReqtrackingno(String reqtrackingno) {
		this.reqtrackingno = reqtrackingno;
	}

	public Date getRequestdate() {
		return this.requestdate;
	}

	public void setRequestdate(Date requestdate) {
		this.requestdate = requestdate;
	}

	public BigDecimal getRequestuserid() {
		return this.requestuserid;
	}

	public void setRequestuserid(BigDecimal requestuserid) {
		this.requestuserid = requestuserid;
	}

}