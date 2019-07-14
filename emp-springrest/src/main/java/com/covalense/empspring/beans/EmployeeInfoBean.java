package com.covalense.empspring.beans;

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

import lombok.Data;

//@XmlRootElement(name = "employee-info-bean")
//@XmlAccessorType(XmlAccessType.FIELD)
@Data
@Entity
@Table(name="employee_info")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@JsonRootName(value = "employee-info")
public class EmployeeInfoBean implements Serializable{
	
	//@XmlElement(name = "other-info")
	@JsonProperty(value = "other-info")
	@OneToOne(cascade = CascadeType.ALL , mappedBy = "infobean", fetch = FetchType.EAGER)
	private EmployeeOtherInfoBean otherInfo;
	
	//@XmlElementWrapper(name = "addresses")
	//@XmlElement(name = "address-info")
	@JsonProperty(value = "address-info")
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "addresspKBean.infoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<EmployeeAddressInfoBean> lstAddressInfoBean;
	
	//@XmlElementWrapper(name = "experiences")
	@XmlElement(name = "experience-info")
	@JsonProperty(value = "experience-info")
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "expPKBean.infoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<EmployeeExperienceInfoBean> lstExperienceInfo;
	
	//@XmlElementWrapper(name = "education")
	@XmlElement(name = "education-info")
	@JsonProperty(value = "education-info")
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "pkBean.infoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<EmployeeEducationalInfoBean> lstEducationalInfo;
	
	//@XmlElementWrapper(name = "trainings")
	//@XmlElement(name = "training-info")
	@JsonProperty(value = "training-info")
	@ManyToMany(cascade = CascadeType.ALL , mappedBy = "lstInfoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<TrainingInfoBean> lstTraininginfo;
	
	@Id
//	@XmlElement(name = "id")
	@JsonProperty(value = "id")
	@Column(name="id")
	private Integer id;
	
	//@XmlElement(name = "name")
	@JsonProperty(value = "name")
	@Column(name="Name")
	private String name;
	
	//@XmlElement(name = "age")
	@JsonProperty(value = "age")
	@Column(name="Age")
	private Integer age;
	
	//@XmlElement(name = "gender")
	@JsonProperty(value = "gender")
	@Column(name="Gender")
	private String gender;
	
	//@XmlElement(name = "salary")
	@JsonProperty(value = "salary")
	@Column(name="salary")
	private Integer salary;
	
	//@XmlElement(name = "password")
	@JsonProperty(value = "password")
	@Column(name="password")
	private String password;
	
	//@XmlElement(name = "phone")
	@JsonProperty(value = "phone")
	@Column(name="phone")
	private Long phone;
	
	//@XmlElement(name = "email")
	@JsonProperty(value = "email")
	@Column(name="email")
	private String email;
	
	//@XmlElement(name = "designation")
	@JsonProperty(value = "designation")
	@Column(name="Designation")
	private String designation;
	
	//@XmlElement(name = "dob")
	@JsonProperty(value = "dob")
	@Column(name="DOB")
	private Date dob;
	
	//@XmlElement(name = "acnt_no")
	@JsonProperty(value = "acnt_no")
	@Column(name="Accnt_no")
	private Long acnt_no;
	
	//@XmlElement(name = "joining_date")
	@JsonProperty(value = "joining_date")
	@Column(name="Joining_Date")
	private Date joining_date;
	
	//@XmlElement(name = "deptId")
	@JsonProperty(value = "deptId")
	@Column(name="Dept_ID")
	private String deptId;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	//@XmlElement(name = "mngId")
	@JsonProperty(value = "mngId")
	@JoinColumn(name = "Manager_Id", referencedColumnName = "id")
	private EmployeeInfoBean mngId;

}//End of class
