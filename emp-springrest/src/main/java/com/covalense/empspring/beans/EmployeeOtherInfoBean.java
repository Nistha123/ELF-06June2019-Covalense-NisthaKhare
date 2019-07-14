package com.covalense.empspring.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data
@Entity
@Table(name="employee_otherinfo")
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeOtherInfoBean implements Serializable{
	
	@Id
	//@XmlTransient
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean infobean;
	@Column(name="ismarried")
	private Boolean ismarried;  
	@Column(name="pan")
	private String pan;      
	@Column(name="blood_grp")
	private String blood_grp;
	@Column(name="isChallenged")
	private Boolean isChallenged;	
	@Column(name="emergency_contact_number")
	private Long emergency_contact_number;
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
	@Column(name="Passport")
	private Long passport;
	@Column(name="Adhar")
	private Long adhar;
	
}//end of class
