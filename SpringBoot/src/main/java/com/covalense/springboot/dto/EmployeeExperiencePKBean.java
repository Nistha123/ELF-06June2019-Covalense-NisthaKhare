package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

@Data
@Table(name = "employee_educationalinfo")
@ToString
@Embeddable
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeExperiencePKBean implements Serializable{
	
	@ManyToOne
	//@XmlTransient
	@JsonIgnore
	@JoinColumn(name = "id")
	private EmployeeInfoBean infoBean ;     
	@Column(name = "Company_name")
	private String company_name;
	
}//End of class
