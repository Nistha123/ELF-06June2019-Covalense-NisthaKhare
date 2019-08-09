package com.covalense.emp.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.covalense.emp.dto.EmployeeInfoBean;

import lombok.Data;
import lombok.ToString;

@Table(name = "employee_educationalinfo")
@ToString
@Data
@Embeddable
public class EmployeeEducationalPKBean implements Serializable{

	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean infoBean; 
	@Column(name = "Educational_Type")
	private String educationalType;
}//end of class
