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
 * The persistent class for the NOTE_TYPES database table.
 * 
 */
@Entity
@Table(name="NOTE_TYPES")
@NamedQuery(name="NoteType.findAll", query="SELECT n FROM NoteType n")
public class NoteType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUDITTRAIL_ID")
	private BigDecimal audittrailId;

	@Id
	@Column(name="NOTETYPE_ID")
	private BigDecimal notetypeId;

	private String notetypedescr;

	public NoteType() {
	}

	public BigDecimal getAudittrailId() {
		return this.audittrailId;
	}

	public void setAudittrailId(BigDecimal audittrailId) {
		this.audittrailId = audittrailId;
	}

	public BigDecimal getNotetypeId() {
		return this.notetypeId;
	}

	public void setNotetypeId(BigDecimal notetypeId) {
		this.notetypeId = notetypeId;
	}

	public String getNotetypedescr() {
		return this.notetypedescr;
	}

	public void setNotetypedescr(String notetypedescr) {
		this.notetypedescr = notetypedescr;
	}

}