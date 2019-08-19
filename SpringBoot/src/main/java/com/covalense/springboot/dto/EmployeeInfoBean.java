package com.covalense.springboot.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table(name="employee_info")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@JsonRootName(value = "employee-info")
public class EmployeeInfoBean implements Serializable{
	
	@JsonProperty(value = "other-info")
	@OneToOne(cascade = CascadeType.ALL , mappedBy = "infobean", fetch = FetchType.EAGER)
	private EmployeeOtherInfoBean otherInfo;
	
	@JsonProperty(value = "address-info")
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "addresspKBean.infoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<EmployeeAddressInfoBean> lstAddressInfoBean;
	
	@XmlElement(name = "experience-info")
	@JsonProperty(value = "experience-info")
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "expPKBean.infoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<EmployeeExperienceInfoBean> lstExperienceInfo;
	
	@XmlElement(name = "education-info")
	@JsonProperty(value = "education-info")
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "pkBean.infoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<EmployeeEducationalInfoBean> lstEducationalInfo;
	
	
	@JsonProperty(value = "training-info")
	@ManyToMany(cascade = CascadeType.ALL , mappedBy = "lstInfoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<TrainingInfoBean> lstTraininginfo;
	
	@Id
	@JsonProperty(value = "id")
	@Column(name="id")
	private Integer id;
	
	@JsonProperty(value = "name")
	@Column(name="Name")
	private String name;
	
	@JsonProperty(value = "age")
	@Column(name="Age")
	private Integer age;
	
	@JsonProperty(value = "gender")
	@Column(name="Gender")
	private String gender;
	
	@JsonProperty(value = "salary")
	@Column(name="salary")
	private Integer salary;
	
	@JsonProperty(value = "password")
	@Column(name="password")
	private String password;
	
	@JsonProperty(value = "phone")
	@Column(name="phone")
	private Long phone;
	
	@JsonProperty(value = "email")
	@Column(name="email")
	private String email;
	
	@JsonProperty(value = "designation")
	@Column(name="Designation")
	private String designation;
	
	@JsonProperty(value = "dob")
	@Column(name="DOB")
	private Date dob;
	
	@JsonProperty(value = "acnt_no")
	@Column(name="Accnt_no")
	private Long acnt_no;
	
	@JsonProperty(value = "joining_date")
	@Column(name="Joining_Date")
	private Date joining_date;
	
	@JsonProperty(value = "deptId")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Dept_ID")
	private EmployeeDepartmentInfoBean deptId;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JsonProperty(value = "mngId")
	@JoinColumn(name = "Manager_Id", referencedColumnName = "id")
	private EmployeeInfoBean mngId;

	public EmployeeOtherInfoBean getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(EmployeeOtherInfoBean otherInfo) {
		this.otherInfo = otherInfo;
	}

	public List<EmployeeAddressInfoBean> getLstAddressInfoBean() {
		return lstAddressInfoBean;
	}

	public void setLstAddressInfoBean(List<EmployeeAddressInfoBean> lstAddressInfoBean) {
		this.lstAddressInfoBean = lstAddressInfoBean;
	}

	public List<EmployeeExperienceInfoBean> getLstExperienceInfo() {
		return lstExperienceInfo;
	}

	public void setLstExperienceInfo(List<EmployeeExperienceInfoBean> lstExperienceInfo) {
		this.lstExperienceInfo = lstExperienceInfo;
	}

	public List<EmployeeEducationalInfoBean> getLstEducationalInfo() {
		return lstEducationalInfo;
	}

	public void setLstEducationalInfo(List<EmployeeEducationalInfoBean> lstEducationalInfo) {
		this.lstEducationalInfo = lstEducationalInfo;
	}

	public List<TrainingInfoBean> getLstTraininginfo() {
		return lstTraininginfo;
	}

	public void setLstTraininginfo(List<TrainingInfoBean> lstTraininginfo) {
		this.lstTraininginfo = lstTraininginfo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getAcnt_no() {
		return acnt_no;
	}

	public void setAcnt_no(Long acnt_no) {
		this.acnt_no = acnt_no;
	}

	public Date getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}

	public EmployeeDepartmentInfoBean getDeptId() {
		return deptId;
	}

	public void setDeptId(EmployeeDepartmentInfoBean deptId) {
		this.deptId = deptId;
	}

	public EmployeeInfoBean getMngId() {
		return mngId;
	}

	public void setMngId(EmployeeInfoBean mngId) {
		this.mngId = mngId;
	}
	
	

}//End of class
