package com.xpts.csg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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
 * The persistent class for the TRANSBATCHES database table.
 * 
 */
@Entity
@Table(name="TRANSBATCHES")
@NamedQuery(name="Transbatch.findAll", query="SELECT t FROM Transbatch t")
public class Transbatch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRANSBATCHES_BATCHID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRANSBATCHES_BATCHID_GENERATOR")
	private long batchid;

	private String batchno;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_CREATED")
	private Date dateCreated;

	private BigDecimal mainprocessid;

	private BigDecimal transactionid;

	private BigDecimal userid;

	@Column(name="USERID_CREATED")
	private BigDecimal useridCreated;

	//bi-directional many-to-one association to Transurveydocument
	@OneToMany(mappedBy="transbatch")
	private List<Transurveydocument> transurveydocuments;

	public Transbatch() {
	}

	public long getBatchid() {
		return this.batchid;
	}

	public void setBatchid(long batchid) {
		this.batchid = batchid;
	}

	public String getBatchno() {
		return this.batchno;
	}

	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public BigDecimal getMainprocessid() {
		return this.mainprocessid;
	}

	public void setMainprocessid(BigDecimal mainprocessid) {
		this.mainprocessid = mainprocessid;
	}

	public BigDecimal getTransactionid() {
		return this.transactionid;
	}

	public void setTransactionid(BigDecimal transactionid) {
		this.transactionid = transactionid;
	}

	public BigDecimal getUserid() {
		return this.userid;
	}

	public void setUserid(BigDecimal userid) {
		this.userid = userid;
	}

	public BigDecimal getUseridCreated() {
		return this.useridCreated;
	}

	public void setUseridCreated(BigDecimal useridCreated) {
		this.useridCreated = useridCreated;
	}

	public List<Transurveydocument> getTransurveydocuments() {
		return this.transurveydocuments;
	}

	public void setTransurveydocuments(List<Transurveydocument> transurveydocuments) {
		this.transurveydocuments = transurveydocuments;
	}

	public Transurveydocument addTransurveydocument(Transurveydocument transurveydocument) {
		getTransurveydocuments().add(transurveydocument);
		transurveydocument.setTransbatch(this);

		return transurveydocument;
	}

	public Transurveydocument removeTransurveydocument(Transurveydocument transurveydocument) {
		getTransurveydocuments().remove(transurveydocument);
		transurveydocument.setTransbatch(null);

		return transurveydocument;
	}

}