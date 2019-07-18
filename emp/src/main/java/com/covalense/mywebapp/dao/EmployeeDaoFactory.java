package com.covalense.mywebapp.dao;

public class EmployeeDaoFactory {
	private static String getFactory = "hibernate";
	
	public static EmployeeDao getInstance() {
		EmployeeDao dao = null;
		if(getFactory.equals("hibernate")) {
			return new EmployeeJDBCDAOImpl();
		}else if(getFactory.equals("jdbc")){
			return new EmployeeDaoHibernateimpl();
		}
		return dao;
		
	}//End if getInstance()
	

}//End of class
