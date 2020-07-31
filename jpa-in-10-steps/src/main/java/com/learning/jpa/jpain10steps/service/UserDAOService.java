package com.learning.jpa.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.learning.jpa.jpain10steps.entity.User;

@Repository
@Transactional
public class UserDAOService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public long insertUser(User user){
		entityManager.persist(user);
		return user.getId();
		
	}
	
}


/*
 public class SomeEntityDAOService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public long insertUser(SomeEntity entity){
		entityManager.persist(entity);
		return user.getId();
		
	}
	
}
 */



