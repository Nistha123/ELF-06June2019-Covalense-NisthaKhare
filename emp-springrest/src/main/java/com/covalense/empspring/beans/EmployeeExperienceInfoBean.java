package com.covalense.empspring.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "employee_experienceinfo")
public class EmployeeExperienceInfoBean implements Serializable{
	
	@EmbeddedId
	EmployeeExperiencePKBean expPKBean;
	@Column(name = "Designation")
	private String designation;
	@Column(name = "Joining_Date")
	private Date joiningDate;
	@Column(name = "Leaving_Date")
	private Date leavingDate;
	
}//end of class
