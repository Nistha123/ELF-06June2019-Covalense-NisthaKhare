package com.covalense.empspring.beans;

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
@Table(name = "employee_addressinfo")
@ToString
@Embeddable
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeAddressPKBean implements Serializable{

	@ManyToOne
	//@XmlTransient
	@JsonIgnore
	@JoinColumn(name = "id")
	private EmployeeInfoBean infoBean; 
	@Column(name = "Address_Type")
	private String addressType;
	
}//end of class
