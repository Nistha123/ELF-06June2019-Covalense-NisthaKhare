package com.covalense.emp.dao;

public class EmployeeDaoFactory {
	
	public static EmployeeDao getInstance(String getFactory) {
		EmployeeDao dao = null;
		if(getFactory.equals("jdbc")) {
			return new EmployeeJDBCDAOImpl();
		}else if(getFactory.equals("hibernate")){
			return new EmployeeDaoHibernateimpl();
		}
		return dao;
	}//End if getInstance()
}//End of class
