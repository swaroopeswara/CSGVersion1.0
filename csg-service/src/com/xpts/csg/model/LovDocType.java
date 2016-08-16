package com.xpts.csg.model;

import java.io.Serializable;
import javax.persistence.*;
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
 * The persistent class for the LOV_DOC_TYPES database table.
 * 
 */
@Entity
@Table(name="LOV_DOC_TYPES")
@NamedQuery(name="LovDocType.findAll", query="SELECT l FROM LovDocType l")
public class LovDocType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LOV_DOC_TYPES_DOCUMENTTYPE_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LOV_DOC_TYPES_DOCUMENTTYPE_GENERATOR")
	@Column(name="DOCUMENT_TYPE")
	private String documentType;

	@Column(name="ACTIVE_IND")
	private String activeInd;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="CREATED_USER")
	private String createdUser;

	@Column(name="DOCUMENT_DESC")
	private String documentDesc;

	@Column(name="DOCUMENT_SUB_TYPE")
	private String documentSubType;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;

	@Column(name="MODIFIED_USER")
	private String modifiedUser;

	public LovDocType() {
	}

	public String getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getActiveInd() {
		return this.activeInd;
	}

	public void setActiveInd(String activeInd) {
		this.activeInd = activeInd;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedUser() {
		return this.createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public String getDocumentDesc() {
		return this.documentDesc;
	}

	public void setDocumentDesc(String documentDesc) {
		this.documentDesc = documentDesc;
	}

	public String getDocumentSubType() {
		return this.documentSubType;
	}

	public void setDocumentSubType(String documentSubType) {
		this.documentSubType = documentSubType;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedUser() {
		return this.modifiedUser;
	}

	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}

}