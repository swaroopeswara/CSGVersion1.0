package com.xpts.csg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the USERTASKLISTDET database table.
 * 
 */
@Entity
@NamedQuery(name="Usertasklistdet.findAll", query="SELECT u FROM Usertasklistdet u")
public class Usertasklistdet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USERTASKLISTDET_TASKLISTID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USERTASKLISTDET_TASKLISTID_GENERATOR")
	private long tasklistid;

	@Temporal(TemporalType.DATE)
	private Date completeddate;

	private BigDecimal completeduserid;

	@Temporal(TemporalType.DATE)
	private Date confirmeddate;

	private BigDecimal confirmeduserid;

	private String documentlinkind;

	@Temporal(TemporalType.DATE)
	private Date forwarddatetime;

	private BigDecimal forwardinguserid;

	@Temporal(TemporalType.DATE)
	private Date processeddate;

	@Temporal(TemporalType.DATE)
	private Date receiveddatetime;

	private BigDecimal transactionid;

	private BigDecimal userid;

	//bi-directional many-to-one association to TasklistDocument
	@OneToMany(mappedBy="usertasklistdet")
	private List<TasklistDocument> tasklistDocuments;

	//bi-directional many-to-one association to BusinessProcess
	@ManyToOne
	@JoinColumn(name="PROCESSID")
	private BusinessProcess businessProcess;

	public Usertasklistdet() {
	}

	public long getTasklistid() {
		return this.tasklistid;
	}

	public void setTasklistid(long tasklistid) {
		this.tasklistid = tasklistid;
	}

	public Date getCompleteddate() {
		return this.completeddate;
	}

	public void setCompleteddate(Date completeddate) {
		this.completeddate = completeddate;
	}

	public BigDecimal getCompleteduserid() {
		return this.completeduserid;
	}

	public void setCompleteduserid(BigDecimal completeduserid) {
		this.completeduserid = completeduserid;
	}

	public Date getConfirmeddate() {
		return this.confirmeddate;
	}

	public void setConfirmeddate(Date confirmeddate) {
		this.confirmeddate = confirmeddate;
	}

	public BigDecimal getConfirmeduserid() {
		return this.confirmeduserid;
	}

	public void setConfirmeduserid(BigDecimal confirmeduserid) {
		this.confirmeduserid = confirmeduserid;
	}

	public String getDocumentlinkind() {
		return this.documentlinkind;
	}

	public void setDocumentlinkind(String documentlinkind) {
		this.documentlinkind = documentlinkind;
	}

	public Date getForwarddatetime() {
		return this.forwarddatetime;
	}

	public void setForwarddatetime(Date forwarddatetime) {
		this.forwarddatetime = forwarddatetime;
	}

	public BigDecimal getForwardinguserid() {
		return this.forwardinguserid;
	}

	public void setForwardinguserid(BigDecimal forwardinguserid) {
		this.forwardinguserid = forwardinguserid;
	}

	public Date getProcesseddate() {
		return this.processeddate;
	}

	public void setProcesseddate(Date processeddate) {
		this.processeddate = processeddate;
	}

	public Date getReceiveddatetime() {
		return this.receiveddatetime;
	}

	public void setReceiveddatetime(Date receiveddatetime) {
		this.receiveddatetime = receiveddatetime;
	}

	public BigDecimal getTransactionid() {
		return this.transactionid;
	}

	public void setTransactionid(BigDecimal transactionid) {
		this.transactionid = transactionid;
	}

	public BigDecimal getUserid() {
		return this.userid;
	}

	public void setUserid(BigDecimal userid) {
		this.userid = userid;
	}

	public List<TasklistDocument> getTasklistDocuments() {
		return this.tasklistDocuments;
	}

	public void setTasklistDocuments(List<TasklistDocument> tasklistDocuments) {
		this.tasklistDocuments = tasklistDocuments;
	}

	public TasklistDocument addTasklistDocument(TasklistDocument tasklistDocument) {
		getTasklistDocuments().add(tasklistDocument);
		tasklistDocument.setUsertasklistdet(this);

		return tasklistDocument;
	}

	public TasklistDocument removeTasklistDocument(TasklistDocument tasklistDocument) {
		getTasklistDocuments().remove(tasklistDocument);
		tasklistDocument.setUsertasklistdet(null);

		return tasklistDocument;
	}

	public BusinessProcess getBusinessProcess() {
		return this.businessProcess;
	}

	public void setBusinessProcess(BusinessProcess businessProcess) {
		this.businessProcess = businessProcess;
	}

}