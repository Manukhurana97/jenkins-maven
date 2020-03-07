package com.spring_mvc.dao;

import java.util.List;

import com.spring_mvc.model.User;

public interface Userdao {
	
	public User createuser(User user);
	
	List<User> displayAll();

}
