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

@Table(name = "employee_educationalinfo")
@ToString
@Data
@Embeddable
public class EmployeeExperiencePKBean implements Serializable{
	
	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBeanone infoBeanone ;     
	@Column(name = "Company_name")
	private String company_name;

}//End of class
