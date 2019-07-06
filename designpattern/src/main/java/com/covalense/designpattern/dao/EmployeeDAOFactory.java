package com.covalense.designpattern.dao;

public class EmployeeDAOFactory {

	private static String dbInteractionType = "hibernate";

	public static EmployeeDAO getInstance() {
		EmployeeDAO dao = null;
		if (dbInteractionType.equals("jdbc")) {
			dao = new EmployeeJDBCDAOImpl();
		} else if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeHibernateDAOImplTwo();
		}
		return dao;

	}//end of getInstance
}//end of class
