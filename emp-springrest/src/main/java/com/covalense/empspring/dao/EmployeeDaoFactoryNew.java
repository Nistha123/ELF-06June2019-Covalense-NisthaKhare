package com.covalense.empspring.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoFactoryNew {
	
	@Bean("jdbc")
	public EmployeeDao getInstancejDBC() {
		return new EmployeeJDBCDAOImpl();
	}//End if getInstance()
	
	@Bean("hibernate")
	public EmployeeDao getInstanceHibernate() {
		return new EmployeeDaoHibernateimpl();
	}//End if getInstance()
}//End of class
