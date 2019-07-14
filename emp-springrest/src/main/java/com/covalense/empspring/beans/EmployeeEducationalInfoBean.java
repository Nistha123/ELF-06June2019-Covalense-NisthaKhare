package com.covalense.empspring.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "employee_educationalinfo")
public class EmployeeEducationalInfoBean implements Serializable{
	
	@EmbeddedId
	private EmployeeEducationalPKBean pkBean;
	@Column(name = "Degree_Type")
	private String degreeType;
	@Column(name = "Branch")
	private String branch;		
	@Column(name = "College_Name")
	private String collegeName;  
	@Column(name = "University")
	private String university;   
	@Column(name = "Percentage")
	private Integer percentage;   
	@Column(name = "Location")
	private String location;	
	@Column(name = "YOP")
	private Date yop;

}//end of class
