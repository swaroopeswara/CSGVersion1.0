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
 * The persistent class for the TM_MINOR_REGION database table.
 * 
 */
@Entity
@Table(name="TM_MINOR_REGION")
@NamedQuery(name="TmMinorRegion.findAll", query="SELECT t FROM TmMinorRegion t")
public class TmMinorRegion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TM_MINOR_REGION_MINORREGIONID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TM_MINOR_REGION_MINORREGIONID_GENERATOR")
	@Column(name="MINOR_REGION_ID")
	private long minorRegionId;

	@Column(name="ACTIVE_IND")
	private String activeInd;

	@Column(name="AFRIKAANS_NAME")
	private String afrikaansName;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="CREATED_USER")
	private String createdUser;

	@Column(name="DEEDOFF_CODE")
	private BigDecimal deedoffCode;

	@Column(name="ENGLISH_NAME")
	private String englishName;

	@Column(name="MAJOR_REGION_ID")
	private BigDecimal majorRegionId;

	@Column(name="MINOR_REGION_CODE")
	private String minorRegionCode;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;

	@Column(name="MODIFIED_USER")
	private String modifiedUser;

	@Column(name="NAME_CHANGE_IND")
	private String nameChangeInd;

	@Column(name="OTHER_NAME")
	private String otherName;

	@Column(name="PARCEL_TYPE_CODE")
	private BigDecimal parcelTypeCode;

	@Column(name="PROV_CODE")
	private BigDecimal provCode;

	public TmMinorRegion() {
	}

	public long getMinorRegionId() {
		return this.minorRegionId;
	}

	public void setMinorRegionId(long minorRegionId) {
		this.minorRegionId = minorRegionId;
	}

	public String getActiveInd() {
		return this.activeInd;
	}

	public void setActiveInd(String activeInd) {
		this.activeInd = activeInd;
	}

	public String getAfrikaansName() {
		return this.afrikaansName;
	}

	public void setAfrikaansName(String afrikaansName) {
		this.afrikaansName = afrikaansName;
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

	public BigDecimal getDeedoffCode() {
		return this.deedoffCode;
	}

	public void setDeedoffCode(BigDecimal deedoffCode) {
		this.deedoffCode = deedoffCode;
	}

	public String getEnglishName() {
		return this.englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public BigDecimal getMajorRegionId() {
		return this.majorRegionId;
	}

	public void setMajorRegionId(BigDecimal majorRegionId) {
		this.majorRegionId = majorRegionId;
	}

	public String getMinorRegionCode() {
		return this.minorRegionCode;
	}

	public void setMinorRegionCode(String minorRegionCode) {
		this.minorRegionCode = minorRegionCode;
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

	public String getNameChangeInd() {
		return this.nameChangeInd;
	}

	public void setNameChangeInd(String nameChangeInd) {
		this.nameChangeInd = nameChangeInd;
	}

	public String getOtherName() {
		return this.otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public BigDecimal getParcelTypeCode() {
		return this.parcelTypeCode;
	}

	public void setParcelTypeCode(BigDecimal parcelTypeCode) {
		this.parcelTypeCode = parcelTypeCode;
	}

	public BigDecimal getProvCode() {
		return this.provCode;
	}

	public void setProvCode(BigDecimal provCode) {
		this.provCode = provCode;
	}

}