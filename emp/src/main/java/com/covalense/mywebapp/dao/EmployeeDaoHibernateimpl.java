package com.covalense.mywebapp.dao;

import java.util.List;

import com.covalense.emp.dto.EmployeeInfoBean;

public class EmployeeDaoHibernateimpl implements EmployeeDao{

	@Override
	public List<EmployeeInfoBean> getAllEmployee() {
		
		return null;
	}

	@Override
	public boolean createEmployee(EmployeeInfoBean bean) {
		
		return false;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return null;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
