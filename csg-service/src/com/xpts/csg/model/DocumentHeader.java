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
 * The persistent class for the DOCUMENT_HEADERS database table.
 * 
 */
@Entity
@Table(name="DOCUMENT_HEADERS")
@NamedQuery(name="DocumentHeader.findAll", query="SELECT d FROM DocumentHeader d")
public class DocumentHeader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DOCUMENT_HEADERS_DOCHEADERID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DOCUMENT_HEADERS_DOCHEADERID_GENERATOR")
	private long docheaderid;

	@Column(name="AUDITTRAIL_ID")
	private BigDecimal audittrailId;

	private String corrfilename;

	private String deedno;

	@Column(name="DOCUMENTSUBTYPE_ID")
	private BigDecimal documentsubtypeId;

	private String farmname;

	private String parcel;

	private BigDecimal parcellineageid;

	private String portion;

	private BigDecimal provinceid;

	private String region;

	private String remainderind;

	private String survrecno;

	private BigDecimal survsysid;

	private BigDecimal transactionid;

	private BigDecimal userid;

	//bi-directional many-to-one association to DocumentType
	@ManyToOne
	@JoinColumn(name="DOCUMENTTYPE_ID")
	private DocumentType documentType;

	public DocumentHeader() {
	}

	public long getDocheaderid() {
		return this.docheaderid;
	}

	public void setDocheaderid(long docheaderid) {
		this.docheaderid = docheaderid;
	}

	public BigDecimal getAudittrailId() {
		return this.audittrailId;
	}

	public void setAudittrailId(BigDecimal audittrailId) {
		this.audittrailId = audittrailId;
	}

	public String getCorrfilename() {
		return this.corrfilename;
	}

	public void setCorrfilename(String corrfilename) {
		this.corrfilename = corrfilename;
	}

	public String getDeedno() {
		return this.deedno;
	}

	public void setDeedno(String deedno) {
		this.deedno = deedno;
	}

	public BigDecimal getDocumentsubtypeId() {
		return this.documentsubtypeId;
	}

	public void setDocumentsubtypeId(BigDecimal documentsubtypeId) {
		this.documentsubtypeId = documentsubtypeId;
	}

	public String getFarmname() {
		return this.farmname;
	}

	public void setFarmname(String farmname) {
		this.farmname = farmname;
	}

	public String getParcel() {
		return this.parcel;
	}

	public void setParcel(String parcel) {
		this.parcel = parcel;
	}

	public BigDecimal getParcellineageid() {
		return this.parcellineageid;
	}

	public void setParcellineageid(BigDecimal parcellineageid) {
		this.parcellineageid = parcellineageid;
	}

	public String getPortion() {
		return this.portion;
	}

	public void setPortion(String portion) {
		this.portion = portion;
	}

	public BigDecimal getProvinceid() {
		return this.provinceid;
	}

	public void setProvinceid(BigDecimal provinceid) {
		this.provinceid = provinceid;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRemainderind() {
		return this.remainderind;
	}

	public void setRemainderind(String remainderind) {
		this.remainderind = remainderind;
	}

	public String getSurvrecno() {
		return this.survrecno;
	}

	public void setSurvrecno(String survrecno) {
		this.survrecno = survrecno;
	}

	public BigDecimal getSurvsysid() {
		return this.survsysid;
	}

	public void setSurvsysid(BigDecimal survsysid) {
		this.survsysid = survsysid;
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

	public DocumentType getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

}