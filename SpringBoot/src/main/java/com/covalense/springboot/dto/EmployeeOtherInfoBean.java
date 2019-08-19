package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="employee_otherinfo")
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeOtherInfoBean implements Serializable{
	
	//@JsonIgnore
	@Id
	@Column(name = "other_info_id")
	@GeneratedValue
	private int otherInfoId;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "id",unique = true,nullable = false)
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
	public int getOtherInfoId() {
		return otherInfoId;
	}
	public void setOtherInfoId(int otherInfoId) {
		this.otherInfoId = otherInfoId;
	}
	public EmployeeInfoBean getInfobean() {
		return infobean;
	}
	public void setInfobean(EmployeeInfoBean infobean) {
		this.infobean = infobean;
	}
	public Boolean getIsmarried() {
		return ismarried;
	}
	public void setIsmarried(Boolean ismarried) {
		this.ismarried = ismarried;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getBlood_grp() {
		return blood_grp;
	}
	public void setBlood_grp(String blood_grp) {
		this.blood_grp = blood_grp;
	}
	public Boolean getIsChallenged() {
		return isChallenged;
	}
	public void setIsChallenged(Boolean isChallenged) {
		this.isChallenged = isChallenged;
	}
	public Long getEmergency_contact_number() {
		return emergency_contact_number;
	}
	public void setEmergency_contact_number(Long emergency_contact_number) {
		this.emergency_contact_number = emergency_contact_number;
	}
	public String getEmergency_contact_name() {
		return emergency_contact_name;
	}
	public void setEmergency_contact_name(String emergency_contact_name) {
		this.emergency_contact_name = emergency_contact_name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public String getSpouse_name() {
		return spouse_name;
	}
	public void setSpouse_name(String spouse_name) {
		this.spouse_name = spouse_name;
	}
	public Long getPassport() {
		return passport;
	}
	public void setPassport(Long passport) {
		this.passport = passport;
	}
	public Long getAdhar() {
		return adhar;
	}
	public void setAdhar(Long adhar) {
		this.adhar = adhar;
	}
	
	
	
}//end of class
