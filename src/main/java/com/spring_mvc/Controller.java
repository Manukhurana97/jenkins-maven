package com.spring_mvc;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spring_mvc.dao.daoimpl;
import com.spring_mvc.model.User;

import jakarta.servlet.http.HttpServlet;

public class Controller extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	daoimpl dao;
	
	public void init() {
		dao = new daoimpl();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("login");
		String password = request.getParameter("password");
		
		
		User csr = new User(email, password);
		User user = dao.createuser(csr);
		
		
		
		
	}

}
