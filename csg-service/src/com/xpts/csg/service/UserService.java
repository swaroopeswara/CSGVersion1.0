package com.xpts.csg.service;

import javax.ejb.Local;

import com.xpts.csg.model.CsgUser;

@Local
public interface UserService {

	void saveUser(String userJson);
	
	void saveUser(CsgUser user);
	
	CsgUser findUser(Integer id);
	
	String getUserJson(Integer id);
	
	String getUserJson(CsgUser user);
}
