package com.covalense.emp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="employee_otherinfo")
@Data
public class EmployeeOtherInfoBean {
	@Column(name="ismarried")
	private String ismarried;  
	@Column(name="pan")
	private String pan;      
	@Column(name="blood_grp")
	private String blood_grp;
	@Column(name="isChallenged")
	private boolean isChallenged;	
	@Column(name="emergency_contact_number")
	private long emergency_contact_number;
	@Column(name="emergency_contact_name")
	private String emergency_contact_name;  
	@Column(name="nationality")
	private String nationality;		
	@Column(name="religion")
	private String religion;	
	@Column(name="father_nm")
	private String father_name;	
	@Column(name="mother_nm")
	private String mother_name;	
	@Column(name="spouse_nm")
	private String spouse_name;	
	@Id
	@Column(name="id ")
	private int id	;		
	@Column(name="Passport")
	private long passport;
	@Column(name="Adhar")
	private long adhar;	
	

}//end of class
