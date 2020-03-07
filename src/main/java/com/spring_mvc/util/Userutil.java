package com.spring_mvc.util;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring_mvc.model.User;

public class Userutil {
	
static SessionFactory factory = null;
	
	public static  SessionFactory getsessionobj()
	{
		return new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
	}
	


}
