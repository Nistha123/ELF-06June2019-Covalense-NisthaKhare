package com.covalense.mywebapp.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_departmentinfo")
public class EmployeeDepartmentInfoBean {
	@Id
	@Column(name="Dept_ID")
	private int deptID ; 
	@Column(name = "Dept_Name")
	private String deptName; 


}//end of class
