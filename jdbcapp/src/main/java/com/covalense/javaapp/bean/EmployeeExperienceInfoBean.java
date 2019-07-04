package com.covalense.javaapp.bean;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeExperienceInfoBean {
	private int id ;         
	private String company_name;
	private String designation;
	private Date joiningDate;
	private Date leavingDate;


}//end of class
