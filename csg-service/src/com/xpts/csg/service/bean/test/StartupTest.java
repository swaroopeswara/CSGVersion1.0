package com.xpts.csg.service.bean.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import com.xpts.csg.service.UserService;

@Singleton
@Startup
public class StartupTest {

	private static final String userJson = "{\"indicator\":1,\"name\":\"ram\",\"username\":\"Sri\",\"password\":\"rama\",\"emailAddress\":\"rama@vikunta.com\",\"plsNumber\":\"11\",\"auditTrailID\":11}";

	@Inject
	private UserService userService;
	
	@PostConstruct
	private void startup() {
		String jsonObject = userService.getUserJson(10);
		System.out.println("********* User jsonObject: "+jsonObject);
		
		userService.saveUser(userJson);
	}

	@PreDestroy
	private void shutdown() {  }

}
