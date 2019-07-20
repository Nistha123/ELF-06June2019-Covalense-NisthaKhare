package com.covalense.emp.dao;

public class EmployeeDaoFactory {
	private static String getFactory = "hibernate";
	
	public static EmployeeDao getInstance() {
		EmployeeDao dao = null;
		if(getFactory.equals("jdbc")) {
			return new EmployeeJDBCDAOImpl();
		}else if(getFactory.equals("hibernate")){
			return new EmployeeDaoHibernateimpl();
		}
		return dao;
		
	}//End if getInstance()
	

}//End of class
