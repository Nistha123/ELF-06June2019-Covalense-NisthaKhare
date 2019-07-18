package com.covalense.emp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDao;
import com.covalense.mywebapp.dao.EmployeeDaoFactory;
import com.covalense.mywebapp.dao.EmployeeDaoHibernateimpl;

public class RegisterEmployee extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		Session session = null;
		
		EmployeeDao dao = EmployeeDaoFactory.getInstance();
		EmployeeInfoBean
	}

}
