package com.covalense.mywebapp.dao;

import java.util.List;

import com.covalense.emp.dto.EmployeeInfoBean;

public interface EmployeeDao {
	
	List<EmployeeInfoBean> getAllEmployee();
	boolean createEmployee(EmployeeInfoBean bean);
	EmployeeInfoBean getEmployeeInfo(int id);
	EmployeeInfoBean getEmployeeInfo(String id);
	boolean updateEmployeeInfo(EmployeeInfoBean bean);
	boolean deleteEmployeeInfo(int id);
	boolean deleteEmployeeInfo(String id);
	
}//End of interface
