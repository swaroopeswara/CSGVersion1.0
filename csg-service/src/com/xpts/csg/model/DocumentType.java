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
 * The persistent class for the DOCUMENT_TYPES database table.
 * 
 */
@Entity
@Table(name="DOCUMENT_TYPES")
@NamedQuery(name="DocumentType.findAll", query="SELECT d FROM DocumentType d")
public class DocumentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DOCUMENT_TYPES_DOCUMENTTYPEID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DOCUMENT_TYPES_DOCUMENTTYPEID_GENERATOR")
	@Column(name="DOCUMENTTYPE_ID")
	private long documenttypeId;

	@Column(name="AUDITTRAIL_ID")
	private BigDecimal audittrailId;

	private String doctypecode;

	private String doctypedescr;

	private BigDecimal maindoctypeid;

	private BigDecimal subdoctypeid;

	//bi-directional many-to-one association to DocketType
	@OneToMany(mappedBy="documentType")
	private List<DocketType> docketTypes;

	//bi-directional many-to-one association to DocumentHeader
	@OneToMany(mappedBy="documentType")
	private List<DocumentHeader> documentHeaders;

	//bi-directional many-to-one association to TasklistDocument
	@OneToMany(mappedBy="documentType")
	private List<TasklistDocument> tasklistDocuments;

	//bi-directional many-to-one association to TransactionDoc
	@OneToMany(mappedBy="documentType")
	private List<TransactionDoc> transactionDocs;

	//bi-directional many-to-one association to Transurveydocument
	@OneToMany(mappedBy="documentType")
	private List<Transurveydocument> transurveydocuments;

	public DocumentType() {
	}

	public long getDocumenttypeId() {
		return this.documenttypeId;
	}

	public void setDocumenttypeId(long documenttypeId) {
		this.documenttypeId = documenttypeId;
	}

	public BigDecimal getAudittrailId() {
		return this.audittrailId;
	}

	public void setAudittrailId(BigDecimal audittrailId) {
		this.audittrailId = audittrailId;
	}

	public String getDoctypecode() {
		return this.doctypecode;
	}

	public void setDoctypecode(String doctypecode) {
		this.doctypecode = doctypecode;
	}

	public String getDoctypedescr() {
		return this.doctypedescr;
	}

	public void setDoctypedescr(String doctypedescr) {
		this.doctypedescr = doctypedescr;
	}

	public BigDecimal getMaindoctypeid() {
		return this.maindoctypeid;
	}

	public void setMaindoctypeid(BigDecimal maindoctypeid) {
		this.maindoctypeid = maindoctypeid;
	}

	public BigDecimal getSubdoctypeid() {
		return this.subdoctypeid;
	}

	public void setSubdoctypeid(BigDecimal subdoctypeid) {
		this.subdoctypeid = subdoctypeid;
	}

	public List<DocketType> getDocketTypes() {
		return this.docketTypes;
	}

	public void setDocketTypes(List<DocketType> docketTypes) {
		this.docketTypes = docketTypes;
	}

	public DocketType addDocketType(DocketType docketType) {
		getDocketTypes().add(docketType);
		docketType.setDocumentType(this);

		return docketType;
	}

	public DocketType removeDocketType(DocketType docketType) {
		getDocketTypes().remove(docketType);
		docketType.setDocumentType(null);

		return docketType;
	}

	public List<DocumentHeader> getDocumentHeaders() {
		return this.documentHeaders;
	}

	public void setDocumentHeaders(List<DocumentHeader> documentHeaders) {
		this.documentHeaders = documentHeaders;
	}

	public DocumentHeader addDocumentHeader(DocumentHeader documentHeader) {
		getDocumentHeaders().add(documentHeader);
		documentHeader.setDocumentType(this);

		return documentHeader;
	}

	public DocumentHeader removeDocumentHeader(DocumentHeader documentHeader) {
		getDocumentHeaders().remove(documentHeader);
		documentHeader.setDocumentType(null);

		return documentHeader;
	}

	public List<TasklistDocument> getTasklistDocuments() {
		return this.tasklistDocuments;
	}

	public void setTasklistDocuments(List<TasklistDocument> tasklistDocuments) {
		this.tasklistDocuments = tasklistDocuments;
	}

	public TasklistDocument addTasklistDocument(TasklistDocument tasklistDocument) {
		getTasklistDocuments().add(tasklistDocument);
		tasklistDocument.setDocumentType(this);

		return tasklistDocument;
	}

	public TasklistDocument removeTasklistDocument(TasklistDocument tasklistDocument) {
		getTasklistDocuments().remove(tasklistDocument);
		tasklistDocument.setDocumentType(null);

		return tasklistDocument;
	}

	public List<TransactionDoc> getTransactionDocs() {
		return this.transactionDocs;
	}

	public void setTransactionDocs(List<TransactionDoc> transactionDocs) {
		this.transactionDocs = transactionDocs;
	}

	public TransactionDoc addTransactionDoc(TransactionDoc transactionDoc) {
		getTransactionDocs().add(transactionDoc);
		transactionDoc.setDocumentType(this);

		return transactionDoc;
	}

	public TransactionDoc removeTransactionDoc(TransactionDoc transactionDoc) {
		getTransactionDocs().remove(transactionDoc);
		transactionDoc.setDocumentType(null);

		return transactionDoc;
	}

	public List<Transurveydocument> getTransurveydocuments() {
		return this.transurveydocuments;
	}

	public void setTransurveydocuments(List<Transurveydocument> transurveydocuments) {
		this.transurveydocuments = transurveydocuments;
	}

	public Transurveydocument addTransurveydocument(Transurveydocument transurveydocument) {
		getTransurveydocuments().add(transurveydocument);
		transurveydocument.setDocumentType(this);

		return transurveydocument;
	}

	public Transurveydocument removeTransurveydocument(Transurveydocument transurveydocument) {
		getTransurveydocuments().remove(transurveydocument);
		transurveydocument.setDocumentType(null);

		return transurveydocument;
	}

}