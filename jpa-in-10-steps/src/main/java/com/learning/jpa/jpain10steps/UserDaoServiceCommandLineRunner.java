package com.learning.jpa.jpain10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.jpa.jpain10steps.entity.User;
import com.learning.jpa.jpain10steps.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
	

	private static final Logger log = 
			LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

	@Autowired
	private UserDAOService userDaoService;
	
	public void run(String... args) throws Exception {
		User user = new User("Jack", "Admin");
		long id = userDaoService.insertUser(user);
		log.info("New User is created"+ user);
		
		User user1 = new User("Jill", "Admin");
		long id1 = userDaoService.insertUser(user1);
		log.info("New User is created"+ user1);
		
		

		
	}

}
