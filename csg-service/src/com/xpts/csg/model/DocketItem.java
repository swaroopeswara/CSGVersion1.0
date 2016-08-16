package com.xpts.csg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
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
 * The persistent class for the DOCKET_ITEMS database table.
 * 
 */
@Entity
@Table(name="DOCKET_ITEMS")
@NamedQuery(name="DocketItem.findAll", query="SELECT d FROM DocketItem d")
public class DocketItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DOCKET_ITEMS_DOCKETITEMID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DOCKET_ITEMS_DOCKETITEMID_GENERATOR")
	private long docketitemid;

	@Column(name="AUDITTRAIL_ID")
	private BigDecimal audittrailId;

	private String docketitemdescr;

	//bi-directional many-to-one association to DocketitemNote
	@OneToMany(mappedBy="docketItem")
	private List<DocketitemNote> docketitemNotes;

	//bi-directional many-to-one association to DocketType
	@ManyToOne
	@JoinColumn(name="DOCKETTYPEID")
	private DocketType docketType;

	public DocketItem() {
	}

	public long getDocketitemid() {
		return this.docketitemid;
	}

	public void setDocketitemid(long docketitemid) {
		this.docketitemid = docketitemid;
	}

	public BigDecimal getAudittrailId() {
		return this.audittrailId;
	}

	public void setAudittrailId(BigDecimal audittrailId) {
		this.audittrailId = audittrailId;
	}

	public String getDocketitemdescr() {
		return this.docketitemdescr;
	}

	public void setDocketitemdescr(String docketitemdescr) {
		this.docketitemdescr = docketitemdescr;
	}

	public List<DocketitemNote> getDocketitemNotes() {
		return this.docketitemNotes;
	}

	public void setDocketitemNotes(List<DocketitemNote> docketitemNotes) {
		this.docketitemNotes = docketitemNotes;
	}

	public DocketitemNote addDocketitemNote(DocketitemNote docketitemNote) {
		getDocketitemNotes().add(docketitemNote);
		docketitemNote.setDocketItem(this);

		return docketitemNote;
	}

	public DocketitemNote removeDocketitemNote(DocketitemNote docketitemNote) {
		getDocketitemNotes().remove(docketitemNote);
		docketitemNote.setDocketItem(null);

		return docketitemNote;
	}

	public DocketType getDocketType() {
		return this.docketType;
	}

	public void setDocketType(DocketType docketType) {
		this.docketType = docketType;
	}

}