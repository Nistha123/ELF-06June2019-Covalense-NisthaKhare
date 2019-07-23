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
@Table(name = "student_info")
public class Student_infoBean implements Serializable{
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Student_OtherinfoBean otherInfo;
	
	@Id
	@Column(name = "rollNum")
	private int rollNo;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "mobileNo")
	private long mobileNo;
	@Column(name = "email")
	private String emailId;
	
}//End of class
