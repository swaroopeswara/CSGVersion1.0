package com.xpts.csg.ui.controller;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.xpts.csg.model.CsgUser;
import com.xpts.csg.service.UserService;

@ManagedBean(name="userMaintenanceController", eager=true)
@RequestScoped
public class UserMaintenanceController {

	private CsgUser cgsUser;

	@EJB
	private UserService service;

	@PostConstruct
	public void init(){
		cgsUser = new CsgUser();//service.findUser(10);//
	}
	public CsgUser getCgsUser() {
		return cgsUser;
	}

	public void setCgsUser(CsgUser cgsUser) {
		this.cgsUser = cgsUser;
	}

	public void saveUser() {
		System.out.println("CsgUser object: "+cgsUser.toString());
		String json = service.getUserJson(cgsUser);
		System.out.println("CsgUser json object: "+json);
		service.saveUser(json);
	}

}

