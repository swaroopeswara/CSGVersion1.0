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
 * The persistent class for the TM_MAJOR_REGION database table.
 * 
 */
@Entity
@Table(name="TM_MAJOR_REGION")
@NamedQuery(name="TmMajorRegion.findAll", query="SELECT t FROM TmMajorRegion t")
public class TmMajorRegion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TM_MAJOR_REGION_MAJORREGIONID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TM_MAJOR_REGION_MAJORREGIONID_GENERATOR")
	@Column(name="MAJOR_REGION_ID")
	private long majorRegionId;

	@Column(name="ACTIVE_IND")
	private String activeInd;

	@Column(name="AFRIKAANS_NAME")
	private String afrikaansName;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="CREATED_USER")
	private String createdUser;

	@Column(name="ENGLISH_NAME")
	private String englishName;

	@Column(name="MAJOR_REGION_CODE")
	private String majorRegionCode;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;

	@Column(name="MODIFIED_USER")
	private String modifiedUser;

	@Column(name="NAME_CHANGE_IND")
	private String nameChangeInd;

	@Column(name="OTHER_NAME")
	private String otherName;

	@Column(name="PAR_TYPE_CODE")
	private BigDecimal parTypeCode;

	public TmMajorRegion() {
	}

	public long getMajorRegionId() {
		return this.majorRegionId;
	}

	public void setMajorRegionId(long majorRegionId) {
		this.majorRegionId = majorRegionId;
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

	public String getEnglishName() {
		return this.englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getMajorRegionCode() {
		return this.majorRegionCode;
	}

	public void setMajorRegionCode(String majorRegionCode) {
		this.majorRegionCode = majorRegionCode;
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

	public BigDecimal getParTypeCode() {
		return this.parTypeCode;
	}

	public void setParTypeCode(BigDecimal parTypeCode) {
		this.parTypeCode = parTypeCode;
	}

}