package com.covalense.hibernateassessment.customerapp.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "student")
public class StudentBean implements Serializable{
	
	@Id
	@Column(name = "rollNum")
	private int rollNo;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "subject")
	private String subject;
	@Column(name = "totalMarks")
	private double totalMarks;
	
	
}//End of class
