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
 * The persistent class for the PARCEL_LINEAGE database table.
 * 
 */
@Entity
@Table(name="PARCEL_LINEAGE")
@NamedQuery(name="ParcelLineage.findAll", query="SELECT p FROM ParcelLineage p")
public class ParcelLineage implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal direction;

	private BigDecimal distance;

	@Column(name="\"KEY\"")
	private BigDecimal key;

	private BigDecimal linetypeid;

	private String parcel;

	@Id
	@Column(name="PARCEL_LINEAGEID")
	private BigDecimal parcelLineageid;

	@Column(name="POINT_FROM")
	private String pointFrom;

	@Column(name="POINT_TO")
	private String pointTo;

	private String portion;

	private String region;

	private String sgno;

	private BigDecimal survsysid;

	private BigDecimal xconstant;

	private BigDecimal xcoord;

	private BigDecimal yconstant;

	private BigDecimal ycoord;

	public ParcelLineage() {
	}

	public BigDecimal getDirection() {
		return this.direction;
	}

	public void setDirection(BigDecimal direction) {
		this.direction = direction;
	}

	public BigDecimal getDistance() {
		return this.distance;
	}

	public void setDistance(BigDecimal distance) {
		this.distance = distance;
	}

	public BigDecimal getKey() {
		return this.key;
	}

	public void setKey(BigDecimal key) {
		this.key = key;
	}

	public BigDecimal getLinetypeid() {
		return this.linetypeid;
	}

	public void setLinetypeid(BigDecimal linetypeid) {
		this.linetypeid = linetypeid;
	}

	public String getParcel() {
		return this.parcel;
	}

	public void setParcel(String parcel) {
		this.parcel = parcel;
	}

	public BigDecimal getParcelLineageid() {
		return this.parcelLineageid;
	}

	public void setParcelLineageid(BigDecimal parcelLineageid) {
		this.parcelLineageid = parcelLineageid;
	}

	public String getPointFrom() {
		return this.pointFrom;
	}

	public void setPointFrom(String pointFrom) {
		this.pointFrom = pointFrom;
	}

	public String getPointTo() {
		return this.pointTo;
	}

	public void setPointTo(String pointTo) {
		this.pointTo = pointTo;
	}

	public String getPortion() {
		return this.portion;
	}

	public void setPortion(String portion) {
		this.portion = portion;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSgno() {
		return this.sgno;
	}

	public void setSgno(String sgno) {
		this.sgno = sgno;
	}

	public BigDecimal getSurvsysid() {
		return this.survsysid;
	}

	public void setSurvsysid(BigDecimal survsysid) {
		this.survsysid = survsysid;
	}

	public BigDecimal getXconstant() {
		return this.xconstant;
	}

	public void setXconstant(BigDecimal xconstant) {
		this.xconstant = xconstant;
	}

	public BigDecimal getXcoord() {
		return this.xcoord;
	}

	public void setXcoord(BigDecimal xcoord) {
		this.xcoord = xcoord;
	}

	public BigDecimal getYconstant() {
		return this.yconstant;
	}

	public void setYconstant(BigDecimal yconstant) {
		this.yconstant = yconstant;
	}

	public BigDecimal getYcoord() {
		return this.ycoord;
	}

	public void setYcoord(BigDecimal ycoord) {
		this.ycoord = ycoord;
	}

}