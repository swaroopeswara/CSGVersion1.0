package com.xpts.csg.service.bean;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.xpts.csg.common.JndiUtils;
import com.xpts.csg.common.JsonSerializer;
import com.xpts.csg.model.CsgUser;
import com.xpts.csg.service.UserService;

@Stateless
//@WebService
public class UserServiceBean implements UserService {

	@PersistenceContext(unitName="csg_pu")
	private EntityManager em;
	
//	@WebMethod
	@Override
	public void saveUser(String userJson){
		CsgUser	user = JsonSerializer.create(CsgUser.class, false).deserialize(userJson);		
		saveUser(user);
	}

	@Override
	public void saveUser(CsgUser user){
		em.persist(user);
		System.out.println("user persisted to db: "+user.getId());
	}
	
//	@WebMethod
	@Override
	public CsgUser findUser(Integer id){
		return em.find(CsgUser.class, id);
	}
	
//	@WebMethod
	@Override
	public String getUserJson(Integer id){
	    return getUserJson(findUser(id));
	}
		
	@Override
	public String getUserJson(CsgUser user){
	    return JsonSerializer.create(CsgUser.class, false).serialize(user);
	}
	
	private EntityManager getEm() {
		if (em == null) {
			em = JndiUtils.lookup("java:global/payhub/env/persistence/csg_pu");
		}
		return em;
	}
}
