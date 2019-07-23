package com.covalense.hibernateassessment.customerapp.bean;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;
@Entity
@Table(name = "employee_info")
@Data
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class EmployeeInfoBean implements Serializable{
	@Id
	@Column(name = "Id")
	private int empId;
	@Column(name = "Name")
	private String name;
	@Column(name = "Age")
	private double age;
	@Column(name = "salary")
	private double salary;
	@Column(name = "email")
	private String email;
	
}
