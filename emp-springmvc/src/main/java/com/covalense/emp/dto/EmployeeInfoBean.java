package com.covalense.emp.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.covalense.emp.manytomany.TrainingInfoBean;
import com.covalense.emp.manytoone.EmployeeAddressInfoBean;
import com.covalense.emp.manytoone.EmployeeEducationalInfoBean;
import com.covalense.emp.manytoone.EmployeeExperienceInfoBean;

import lombok.Data;

@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable{
	
	@OneToOne(cascade = CascadeType.ALL , mappedBy = "infobean")
	@LazyCollection(LazyCollectionOption.FALSE)
	private EmployeeOtherInfoBean otherInfo;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "addresspKBean.infoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<EmployeeAddressInfoBean> lstAddressInfoBean;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "expPKBean.infoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<EmployeeExperienceInfoBean> lstExperienceInfo;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "pkBean.infoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<EmployeeEducationalInfoBean> lstEducationalInfo;
	
	@ManyToMany(cascade = CascadeType.ALL , mappedBy = "lstInfoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<TrainingInfoBean> lstTraininginfo;
	
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="Name")
	private String name;
	@Column(name="Age")
	private Integer age;
	@Column(name="Gender")
	private String gender;
	@Column(name="salary")
	private Integer salary;
	@Column(name="password")
	private String password;
	@Column(name="phone")
	private Long phone;
	@Column(name="email")
	private String email;
	@Column(name="Designation")
	private String designation;
	@Column(name="DOB")
	private Date dob;
	@Column(name="Accnt_no")
	private Long acnt_no;
	@Column(name="Joining_Date")
	private Date joining_date;
	
	
	@Column(name="Dept_ID")
	private String deptId;
	//@Column(name="Manager_Id") private int manager_ID;
	
	
	//@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "Dept_ID")
	//private EmployeeDepartmentInfoBean departmentinfoBean;
	
	@ManyToOne
	@JoinColumn(name = "Manager_Id", referencedColumnName = "id")
	private EmployeeInfoBean mngId;
	 
	
}//End of class
