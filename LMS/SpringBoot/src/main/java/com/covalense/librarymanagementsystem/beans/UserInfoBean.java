package com.covalense.librarymanagementsystem.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "User_Info")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@JsonRootName(value = "employee-info")
public class UserInfoBean implements Serializable{
	
	@Id
	@JsonProperty(value = "id")
	@Column(name="Id")
	private Integer id;
	
	@JsonProperty(value = "name")
	@Column(name="name")
	private String name;
	
	@JsonProperty(value = "age")
	@Column(name="age")
	private Integer age;
	
	@JsonProperty(value = "password")
	@Column(name="password")
	private String password;
	
	@JsonProperty(value = "address")
	@Column(name="address")
	private String address;
	
	@JsonProperty(value = "city")
	@Column(name="city")
	private String city;
	
	@JsonProperty(value = "phoneno")
	@Column(name="phoneno")
	private Long phoneno;
	
	@JsonProperty(value = "reg_date")
	@Column(name="reg_date")
	private Date reg_date;
	
	@JsonProperty(value = "userType")
	@Column(name="userType")
	private String userType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
}//End of userbean
