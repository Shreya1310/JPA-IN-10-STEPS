package com.learning.jpa.jpain10steps;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.jpa.jpain10steps.entity.User;
import com.learning.jpa.jpain10steps.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
	

	private static final Logger log = 
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

	@Autowired
	private UserRepository userRepository;
	
	public void run(String... args) throws Exception {
		User user = new User("Shreya", "Admin");
		userRepository.save(user);
		
		Optional<User> userWithIdOne = userRepository.findById(1L);
		log.info("User is retrieved"+ userWithIdOne);
		
		List<User> allUsers = userRepository.findAll();
		log.info("AllUsers"+ allUsers);
		
	
		
		
		
		
		

		
	}

}

