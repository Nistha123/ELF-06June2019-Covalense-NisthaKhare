package com.covalense.javaapp.bean;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeEducationalInfoBean {
	private int id;           
	private String educationalType;
	private String degreeType;	
	private String branch;			 
	private String collegeName;    
	private String university;      
	private Double percentage;      
	private String location;		
	private Date yop;             


}//end of class
