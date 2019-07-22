package com.covalense.hibernateapp.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "DEPARTMENT_INFO")
public class EmployeeDepartmentInfoBean {
	
	@Id
	@Column(name = "DEPT_ID")
	private int deptID ; 
	@Column(name = "DEPT_NAME")
	private String deptName; 

}//end of class
