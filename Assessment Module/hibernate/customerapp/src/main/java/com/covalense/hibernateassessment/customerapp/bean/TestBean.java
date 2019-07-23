package com.covalense.hibernateassessment.customerapp.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "test")
public class TestBean implements Serializable{
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "LastName")
	private String lastName;
	@Column(name = "city")
	private String city;
}//End of class
