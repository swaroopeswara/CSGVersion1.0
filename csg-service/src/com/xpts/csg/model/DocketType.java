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
 * The persistent class for the DOCKET_TYPES database table.
 * 
 */
@Entity
@Table(name="DOCKET_TYPES")
@NamedQuery(name="DocketType.findAll", query="SELECT d FROM DocketType d")
public class DocketType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DOCKET_TYPES_DOCKETTYPEID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DOCKET_TYPES_DOCKETTYPEID_GENERATOR")
	private long dockettypeid;

	@Column(name="AUDITTRAIL_ID")
	private BigDecimal audittrailId;

	@Column(name="DOCKETTYPE_DESCR")
	private String dockettypeDescr;

	@Column(name="TRANSACTIONTYPE_ID")
	private BigDecimal transactiontypeId;

	//bi-directional many-to-one association to DocketItem
	@OneToMany(mappedBy="docketType")
	private List<DocketItem> docketItems;

	//bi-directional many-to-one association to DocumentType
	@ManyToOne
	@JoinColumn(name="DOCUMENTTYPE_ID")
	private DocumentType documentType;

	public DocketType() {
	}

	public long getDockettypeid() {
		return this.dockettypeid;
	}

	public void setDockettypeid(long dockettypeid) {
		this.dockettypeid = dockettypeid;
	}

	public BigDecimal getAudittrailId() {
		return this.audittrailId;
	}

	public void setAudittrailId(BigDecimal audittrailId) {
		this.audittrailId = audittrailId;
	}

	public String getDockettypeDescr() {
		return this.dockettypeDescr;
	}

	public void setDockettypeDescr(String dockettypeDescr) {
		this.dockettypeDescr = dockettypeDescr;
	}

	public BigDecimal getTransactiontypeId() {
		return this.transactiontypeId;
	}

	public void setTransactiontypeId(BigDecimal transactiontypeId) {
		this.transactiontypeId = transactiontypeId;
	}

	public List<DocketItem> getDocketItems() {
		return this.docketItems;
	}

	public void setDocketItems(List<DocketItem> docketItems) {
		this.docketItems = docketItems;
	}

	public DocketItem addDocketItem(DocketItem docketItem) {
		getDocketItems().add(docketItem);
		docketItem.setDocketType(this);

		return docketItem;
	}

	public DocketItem removeDocketItem(DocketItem docketItem) {
		getDocketItems().remove(docketItem);
		docketItem.setDocketType(null);

		return docketItem;
	}

	public DocumentType getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

}