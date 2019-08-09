package com.covalense.emp.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.covalense.emp.dto.EmployeeInfoBean;

import lombok.Data;
import lombok.ToString;

//@SuppressWarnings("serial")
@Entity
@Table(name = "employee_addressinfo")
@Data
public class EmployeeAddressInfoBean implements Serializable{
	
	@EmbeddedId
	private EmployeeAddressPKBean addresspKBean;
	@Column(name = "Address1")
	private String address1;		
	@Column(name = "Address2")
	private String address2;		
	@Column(name = "Landmark")
	private String landmark;      
	@Column(name = "City")
	private String city;          
	@Column(name = "State")
	private String state;	      
	@Column(name = "Country")
	private String country	;	
	@Column(name = "Pincode")
	private Integer pincode;		

}//end of class
