package com.covalense.hibernateapp.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.covalense.hibernateapp.onetoone.EmployeeInfoBeanone;
import lombok.Data;
import lombok.ToString;

@Table(name = "employee_addressinfo")
@ToString
@Data
@Embeddable
public class EmployeeAddressPKBean implements Serializable{

	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBeanone infoBean; 
	@Column(name = "Address_Type")
	private String addressType; 
	
}//end of class
