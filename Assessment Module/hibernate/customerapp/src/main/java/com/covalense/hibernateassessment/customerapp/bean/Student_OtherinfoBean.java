package com.covalense.hibernateassessment.customerapp.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "student_otherinfo")
public class Student_OtherinfoBean implements Serializable{
	
	@Id
	@Column(name = "rollNum")
	private int rollNo;
	@Column(name = "fatherName")
	private String fatherName;
	@Column(name = "motherName")
	private String motherName;
	@Column(name = "religion")
	private String religion;
	@Column(name = "nationality")
	private String nationality;

}//End of class
