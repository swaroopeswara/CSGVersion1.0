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
 * The persistent class for the DOCKETITEM_NOTES database table.
 * 
 */
@Entity
@Table(name="DOCKETITEM_NOTES")
@NamedQuery(name="DocketitemNote.findAll", query="SELECT d FROM DocketitemNote d")
public class DocketitemNote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DOCKETITEM_NOTES_DOCKETITEMNOTEID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DOCKETITEM_NOTES_DOCKETITEMNOTEID_GENERATOR")
	@Column(name="DOCKETITEMNOTE_ID")
	private long docketitemnoteId;

	private String clearedind;

	@Column(name="DOCKETNOTECAPTURE_USERID")
	private BigDecimal docketnotecaptureUserid;

	@Temporal(TemporalType.DATE)
	private Date docketnotedate;

	private String notedescr;

	private BigDecimal notetypeid;

	private BigDecimal transactionid;

	//bi-directional many-to-one association to DocketItem
	@ManyToOne
	@JoinColumn(name="DOCKETITEMID")
	private DocketItem docketItem;

	public DocketitemNote() {
	}

	public long getDocketitemnoteId() {
		return this.docketitemnoteId;
	}

	public void setDocketitemnoteId(long docketitemnoteId) {
		this.docketitemnoteId = docketitemnoteId;
	}

	public String getClearedind() {
		return this.clearedind;
	}

	public void setClearedind(String clearedind) {
		this.clearedind = clearedind;
	}

	public BigDecimal getDocketnotecaptureUserid() {
		return this.docketnotecaptureUserid;
	}

	public void setDocketnotecaptureUserid(BigDecimal docketnotecaptureUserid) {
		this.docketnotecaptureUserid = docketnotecaptureUserid;
	}

	public Date getDocketnotedate() {
		return this.docketnotedate;
	}

	public void setDocketnotedate(Date docketnotedate) {
		this.docketnotedate = docketnotedate;
	}

	public String getNotedescr() {
		return this.notedescr;
	}

	public void setNotedescr(String notedescr) {
		this.notedescr = notedescr;
	}

	public BigDecimal getNotetypeid() {
		return this.notetypeid;
	}

	public void setNotetypeid(BigDecimal notetypeid) {
		this.notetypeid = notetypeid;
	}

	public BigDecimal getTransactionid() {
		return this.transactionid;
	}

	public void setTransactionid(BigDecimal transactionid) {
		this.transactionid = transactionid;
	}

	public DocketItem getDocketItem() {
		return this.docketItem;
	}

	public void setDocketItem(DocketItem docketItem) {
		this.docketItem = docketItem;
	}

}