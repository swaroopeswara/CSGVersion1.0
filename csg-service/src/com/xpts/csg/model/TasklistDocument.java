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
 * The persistent class for the TASKLIST_DOCUMENTS database table.
 * 
 */
@Entity
@Table(name="TASKLIST_DOCUMENTS")
@NamedQuery(name="TasklistDocument.findAll", query="SELECT t FROM TasklistDocument t")
public class TasklistDocument implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TASKLIST_DOCUMENTS_USERTASKLISTDOCSID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TASKLIST_DOCUMENTS_USERTASKLISTDOCSID_GENERATOR")
	private long usertasklistdocsid;

	//bi-directional many-to-one association to DocumentType
	@ManyToOne
	@JoinColumn(name="DOCUMENTTYPE_ID")
	private DocumentType documentType;

	//bi-directional many-to-one association to Usertasklistdet
	@ManyToOne
	@JoinColumn(name="TASKLISTID")
	private Usertasklistdet usertasklistdet;

	public TasklistDocument() {
	}

	public long getUsertasklistdocsid() {
		return this.usertasklistdocsid;
	}

	public void setUsertasklistdocsid(long usertasklistdocsid) {
		this.usertasklistdocsid = usertasklistdocsid;
	}

	public DocumentType getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	public Usertasklistdet getUsertasklistdet() {
		return this.usertasklistdet;
	}

	public void setUsertasklistdet(Usertasklistdet usertasklistdet) {
		this.usertasklistdet = usertasklistdet;
	}

}