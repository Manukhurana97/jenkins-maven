package com.spring_mvc.dao;

import java.util.List;
import java.util.Queue;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;

import com.spring_mvc.model.User;
import com.spring_mvc.util.Userutil;

public class daoimpl {
	
	private Session session;
	private EntityManager manager;
	
	{
		session = Userutil.getsessionobj().openSession();
		session.getTransaction().begin();
		manager.getEntityManagerFactory().createEntityManager();
		session.getTransaction().commit();
	}
	
	public User createuser(User user)
	{
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		
		return user;
	}
	
	public List<User> displayAll()
	{
		Query q = manager.createQuery("from user");
		return q.getResultList();
	}
	

}
