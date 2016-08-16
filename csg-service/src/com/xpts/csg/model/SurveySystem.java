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
 * The persistent class for the SURVEY_SYSTEMS database table.
 * 
 */
@Entity
@Table(name="SURVEY_SYSTEMS")
@NamedQuery(name="SurveySystem.findAll", query="SELECT s FROM SurveySystem s")
public class SurveySystem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUDITTRAIL_ID")
	private BigDecimal audittrailId;

	private String surveysysdescr;

	@Id
	private BigDecimal survsysid;

	public SurveySystem() {
	}

	public BigDecimal getAudittrailId() {
		return this.audittrailId;
	}

	public void setAudittrailId(BigDecimal audittrailId) {
		this.audittrailId = audittrailId;
	}

	public String getSurveysysdescr() {
		return this.surveysysdescr;
	}

	public void setSurveysysdescr(String surveysysdescr) {
		this.surveysysdescr = surveysysdescr;
	}

	public BigDecimal getSurvsysid() {
		return this.survsysid;
	}

	public void setSurvsysid(BigDecimal survsysid) {
		this.survsysid = survsysid;
	}

}