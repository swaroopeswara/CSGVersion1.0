package com.xpts.csg.model;

import java.io.Serializable;
import javax.persistence.*;

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
 * The persistent class for the LOV_ATTACHMENT_TYPE database table.
 * 
 */
@Entity
@Table(name="LOV_ATTACHMENT_TYPE")
@NamedQuery(name="LovAttachmentType.findAll", query="SELECT l FROM LovAttachmentType l")
public class LovAttachmentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LOV_ATTACHMENT_TYPE_CODE_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LOV_ATTACHMENT_TYPE_CODE_GENERATOR")
	private long code;

	private String description;

	public LovAttachmentType() {
	}

	public long getCode() {
		return this.code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}