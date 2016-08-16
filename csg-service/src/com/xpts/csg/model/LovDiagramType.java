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
 * The persistent class for the LOV_DIAGRAM_TYPES database table.
 * 
 */
@Entity
@Table(name="LOV_DIAGRAM_TYPES")
@NamedQuery(name="LovDiagramType.findAll", query="SELECT l FROM LovDiagramType l")
public class LovDiagramType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LOV_DIAGRAM_TYPES_CODE_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LOV_DIAGRAM_TYPES_CODE_GENERATOR")
	private long code;

	@Column(name="ACTIVE_IND")
	private String activeInd;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="CREATED_USER")
	private String createdUser;

	@Column(name="CREATES_A_PARCEL")
	private String createsAParcel;

	private String description;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;

	@Column(name="MODIFIED_USER")
	private String modifiedUser;

	public LovDiagramType() {
	}

	public long getCode() {
		return this.code;
	}

	public void setCode(long code) {
		this.code = code;
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

	public String getCreatesAParcel() {
		return this.createsAParcel;
	}

	public void setCreatesAParcel(String createsAParcel) {
		this.createsAParcel = createsAParcel;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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