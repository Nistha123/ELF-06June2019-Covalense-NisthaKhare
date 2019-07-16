package com.covalense.springcore.beans;

import lombok.extern.java.Log;

@Log
public class EmployeeInfoBean {
	private int id;
	private String name;
	private DepartmentInfoBean departmentInfoBean;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public DepartmentInfoBean getDepartmentInfoBean() {
		return departmentInfoBean;
	}
	public void setDepartmentInfoBean(DepartmentInfoBean departmentInfoBean) {
		this.departmentInfoBean = departmentInfoBean;
	}
	/*
	 * public void init() throws Exception { log.info("Initializing Phase"); }
	 * 
	 * public void destroy() throws Exception { log.info("Destroying Phase"); }
	 */
}
