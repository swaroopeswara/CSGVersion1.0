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
 * The persistent class for the BUSINESS_PROCESS database table.
 * 
 */
@Entity
@Table(name="BUSINESS_PROCESS")
@NamedQuery(name="BusinessProcess.findAll", query="SELECT b FROM BusinessProcess b")
public class BusinessProcess implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="BUSINESS_PROCESS_PROCESSID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BUSINESS_PROCESS_PROCESSID_GENERATOR")
	private long processid;

	private String pagename;

	private BigDecimal parentprocessid;

	private String processname;

	//bi-directional many-to-one association to Profile
	@OneToMany(mappedBy="businessProcess1")
	private List<Profile> profiles1;

	//bi-directional many-to-one association to Profile
	@OneToMany(mappedBy="businessProcess2")
	private List<Profile> profiles2;

	//bi-directional many-to-one association to Usertasklistdet
	@OneToMany(mappedBy="businessProcess")
	private List<Usertasklistdet> usertasklistdets;

	public BusinessProcess() {
	}

	public long getProcessid() {
		return this.processid;
	}

	public void setProcessid(long processid) {
		this.processid = processid;
	}

	public String getPagename() {
		return this.pagename;
	}

	public void setPagename(String pagename) {
		this.pagename = pagename;
	}

	public BigDecimal getParentprocessid() {
		return this.parentprocessid;
	}

	public void setParentprocessid(BigDecimal parentprocessid) {
		this.parentprocessid = parentprocessid;
	}

	public String getProcessname() {
		return this.processname;
	}

	public void setProcessname(String processname) {
		this.processname = processname;
	}

	public List<Profile> getProfiles1() {
		return this.profiles1;
	}

	public void setProfiles1(List<Profile> profiles1) {
		this.profiles1 = profiles1;
	}

	public Profile addProfiles1(Profile profiles1) {
		getProfiles1().add(profiles1);
		profiles1.setBusinessProcess1(this);

		return profiles1;
	}

	public Profile removeProfiles1(Profile profiles1) {
		getProfiles1().remove(profiles1);
		profiles1.setBusinessProcess1(null);

		return profiles1;
	}

	public List<Profile> getProfiles2() {
		return this.profiles2;
	}

	public void setProfiles2(List<Profile> profiles2) {
		this.profiles2 = profiles2;
	}

	public Profile addProfiles2(Profile profiles2) {
		getProfiles2().add(profiles2);
		profiles2.setBusinessProcess2(this);

		return profiles2;
	}

	public Profile removeProfiles2(Profile profiles2) {
		getProfiles2().remove(profiles2);
		profiles2.setBusinessProcess2(null);

		return profiles2;
	}

	public List<Usertasklistdet> getUsertasklistdets() {
		return this.usertasklistdets;
	}

	public void setUsertasklistdets(List<Usertasklistdet> usertasklistdets) {
		this.usertasklistdets = usertasklistdets;
	}

	public Usertasklistdet addUsertasklistdet(Usertasklistdet usertasklistdet) {
		getUsertasklistdets().add(usertasklistdet);
		usertasklistdet.setBusinessProcess(this);

		return usertasklistdet;
	}

	public Usertasklistdet removeUsertasklistdet(Usertasklistdet usertasklistdet) {
		getUsertasklistdets().remove(usertasklistdet);
		usertasklistdet.setBusinessProcess(null);

		return usertasklistdet;
	}

}