package com.covalense.hibernateapp.onetoone;

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

import com.covalense.hibernateapp.bean.EmployeeDepartmentInfoBean;
import com.covalense.hibernateapp.manytomany.TrainingInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeAddressInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeEducationalInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeExperienceInfoBean;

import lombok.Data;

@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfoBeanone implements Serializable{
	
	@OneToOne(cascade = CascadeType.ALL , mappedBy = "infobean")
	private EmployeeOtherInfoBean otherInfo;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "addresspKBean.infoBean")
	private List<EmployeeAddressInfoBean> lstAddressInfoBean;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "expPKBean.infoBeanone")
	private List<EmployeeExperienceInfoBean> lstExperienceInfo;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "pkBean.infoBean")
	private List<EmployeeEducationalInfoBean> lstEducationalInfo;
	
	@ManyToMany(cascade = CascadeType.ALL , mappedBy = "lstInfoBean")
	private List<TrainingInfoBean> lstTraininginfo;
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Age")
	private int age;
	@Column(name="Gender")
	private String gender;
	@Column(name="salary")
	private int salary;
	@Column(name="phone")
	private long phone;
	@Column(name="email")
	private String email;
	@Column(name="Designation")
	private String designation;
	@Column(name="DOB")
	private Date dob;
	@Column(name="Accnt_no")
	private long acnt_no;
	@Column(name="Joining_Date")
	private Date joining_date;
	/*
	 * @Column(name="Dept_ID") private int dept_ID;
	 */
	/*
	 * @Column(name="Manager_Id") private int manager_ID;
	 */
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Dept_ID")
	private EmployeeDepartmentInfoBean departmentinfoBean;
	
	@ManyToOne
	@JoinColumn(name = "Manager_Id", referencedColumnName = "id")
	private EmployeeInfoBeanone mngId;
	 
	
}//End of class
