package com.covalense.hibernateapp.onetoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import com.covalense.hibernateapp.manytomany.TrainingInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeAddressInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeAddressPKBean;
import com.covalense.hibernateapp.manytoone.EmployeeEducationalInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeEducationalPKBean;
import com.covalense.hibernateapp.manytoone.EmployeeExperienceInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeExperiencePKBean;

import lombok.extern.java.Log;
@Log
public class HibernateTestTwo {
	public static void main(String[] args) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		Date dateDOB = null;
		try {
			dateDOB = dateFormat.parse("1990-05-01");
		} catch (ParseException e) {
			log.severe(Arrays.toString(e.getStackTrace()));
		}
		
		Date dateLeave = null;
		try {
			dateLeave = dateFormat.parse("2019-05-01");
		} catch (ParseException e) {
			log.severe(Arrays.toString(e.getStackTrace()));
		}
		
		Date dateJoin = null;
		try {
			dateJoin = dateFormat.parse("2019-05-01");
		} catch (ParseException e) {
			log.severe(Arrays.toString(e.getStackTrace()));
		}
		
		Date passDate=null;
		try {
			 passDate = dateFormat.parse("2018-03-05");
		} catch (ParseException e) {
			log.severe(Arrays.toString(e.getStackTrace()));
		}
		
		EmployeeInfoBeanone empinfo = new EmployeeInfoBeanone();
		
		empinfo.setId(5);
		empinfo.setName("Rehan");
		empinfo.setAge(28);
		empinfo.setGender("male");
		empinfo.setSalary(55000);
		empinfo.setPhone(565689798);
		empinfo.setEmail("reh@gmail.com");
		empinfo.setDesignation("Manager");
		empinfo.setDob(dateDOB);
		empinfo.setAcnt_no(98798089);
		empinfo.setJoining_date(dateJoin); 
	//	empinfo.setDept_ID(30);
		//empinfo.setManager_ID(12);
		
		EmployeeInfoBeanone empinfo2 = new EmployeeInfoBeanone();
		empinfo2.setId(6);
		empinfo2.setName("Niharika");
		empinfo2.setAge(28);
		empinfo2.setGender("female");
		empinfo2.setSalary(55000);
		empinfo2.setPhone(565689798);
		empinfo2.setEmail("niha@gmail.com");
		empinfo2.setDesignation("software engineer");
		empinfo2.setDob(dateDOB);
		empinfo2.setAcnt_no(98798089);
		empinfo2.setJoining_date(dateJoin); 
		//empinfo2.setDept_ID(30);
		//empinfo2.setManager_ID(12);
		
		EmployeeInfoBeanone empinfo3 = new EmployeeInfoBeanone();
		empinfo3.setId(7);
		empinfo3.setName("Shweta");
		empinfo3.setAge(28);
		empinfo3.setGender("female");
		empinfo3.setSalary(55000);
		empinfo3.setPhone(565689798);
		empinfo3.setEmail("shweta@gmail.com");
		empinfo3.setDesignation("admin");
		empinfo3.setDob(dateDOB);
		empinfo3.setAcnt_no(98798089);
		empinfo3.setJoining_date(dateJoin); 
	//	empinfo3.setDept_ID(30);
		//empinfo3.setManager_ID(12);
		
		TrainingInfoBean trainingInfoBean = new TrainingInfoBean();
		trainingInfoBean.setCourseid(101);
		trainingInfoBean.setCourse_name("Java");
		trainingInfoBean.setCourse_type("placement");
		trainingInfoBean.setDuration(262);
		trainingInfoBean.setLstInfoBean(Arrays.asList(empinfo,empinfo2,empinfo3));
		
		/*
		 * EmployeeOtherInfoBean otherInfo = new EmployeeOtherInfoBean();
		 * otherInfo.setIsmarried(false); otherInfo.setPan("CMFDG2341k");
		 * otherInfo.setBlood_grp("A+"); otherInfo.setChallenged(false);
		 * otherInfo.setEmergency_contact_name("Niharika");
		 * otherInfo.setEmergency_contact_number(678687980);
		 * otherInfo.setNationality("Indian"); otherInfo.setReligion("Hindu");
		 * otherInfo.setFather_name("Sushil"); otherInfo.setMother_name("abha");
		 * otherInfo.setPassport(689778); otherInfo.setAdhar(787889);
		 * 
		 * otherInfo.setInfobean(empinfo);
		 * 
		 * EmployeeAddressPKBean pkBean = new EmployeeAddressPKBean();
		 * pkBean.setAddressType("present"); pkBean.setInfoBean(empinfo);
		 * 
		 * EmployeeAddressPKBean pkBean2 = new EmployeeAddressPKBean();
		 * pkBean2.setAddressType("temporary"); pkBean2.setInfoBean(empinfo);
		 * 
		 * EmployeeAddressInfoBean addressInfoBean = new EmployeeAddressInfoBean();
		 * addressInfoBean.setAddress1("abc"); addressInfoBean.setAddress2("xyz");
		 * addressInfoBean.setCity("Varanasi"); addressInfoBean.setState("UP");
		 * addressInfoBean.setLandmark("Temple"); addressInfoBean.setCountry("India");
		 * 
		 * addressInfoBean.setAddresspKBean(pkBean);
		 * 
		 * EmployeeAddressInfoBean addressInfoBean2 = new EmployeeAddressInfoBean();
		 * addressInfoBean2.setAddress1("abc1"); addressInfoBean2.setAddress2("xyz1");
		 * addressInfoBean2.setCity("Mumbai"); addressInfoBean2.setState("Maharashtra");
		 * addressInfoBean2.setLandmark("Factory");
		 * addressInfoBean2.setCountry("India");
		 * 
		 * addressInfoBean2.setAddresspKBean(pkBean2);
		 * 
		 * EmployeeEducationalPKBean educationalPKBean1 = new
		 * EmployeeEducationalPKBean(); educationalPKBean1.setEducationalType("abc");
		 * educationalPKBean1.setInfoBean(empinfo);
		 * 
		 * EmployeeEducationalPKBean educationalPKBean2 = new
		 * EmployeeEducationalPKBean(); educationalPKBean2.setEducationalType("xyz");
		 * educationalPKBean2.setInfoBean(empinfo);
		 * 
		 * EmployeeEducationalInfoBean educationalInfoBean = new
		 * EmployeeEducationalInfoBean(); educationalInfoBean.setDegreeType("masters");
		 * educationalInfoBean.setCollegeName("mvm");
		 * educationalInfoBean.setBranch("kanpur");
		 * educationalInfoBean.setLocation("hjkhk");
		 * educationalInfoBean.setUniversity("sawqde");
		 * educationalInfoBean.setPercentage(78.9);
		 * educationalInfoBean.setYop(passDate);
		 * educationalInfoBean.setPkBean(educationalPKBean1);
		 * 
		 * EmployeeEducationalInfoBean educationalInfoBean2 = new
		 * EmployeeEducationalInfoBean();
		 * educationalInfoBean2.setDegreeType("bachelors");
		 * educationalInfoBean2.setCollegeName("DAMS");
		 * educationalInfoBean2.setBranch("Jhansi");
		 * educationalInfoBean2.setLocation("hjkhk");
		 * educationalInfoBean2.setUniversity("sawqde");
		 * educationalInfoBean2.setPercentage(88.9);
		 * educationalInfoBean2.setYop(passDate);
		 * educationalInfoBean2.setPkBean(educationalPKBean2);
		 * 
		 * EmployeeExperiencePKBean experiencePKBean1 = new EmployeeExperiencePKBean();
		 * experiencePKBean1.setCompany_name("Adobe");
		 * experiencePKBean1.setInfoBeanone(empinfo);
		 * 
		 * EmployeeExperiencePKBean experiencePKBean2 = new EmployeeExperiencePKBean();
		 * experiencePKBean2.setCompany_name("Infosys");
		 * experiencePKBean2.setInfoBeanone(empinfo);
		 * 
		 * EmployeeExperienceInfoBean experienceInfoBean1 = new
		 * EmployeeExperienceInfoBean();
		 * experienceInfoBean1.setDesignation("jr. Engineer");
		 * experienceInfoBean1.setJoiningDate(dateJoin);
		 * experienceInfoBean1.setLeavingDate(dateLeave);
		 * experienceInfoBean1.setExpPKBean(experiencePKBean1);
		 * 
		 * EmployeeExperienceInfoBean experienceInfoBean2 = new
		 * EmployeeExperienceInfoBean(); experienceInfoBean2.setDesignation("Analyst");
		 * experienceInfoBean2.setJoiningDate(dateJoin);
		 * experienceInfoBean2.setLeavingDate(dateLeave);
		 * experienceInfoBean2.setExpPKBean(experiencePKBean2);
		 */
		
		HibernateImpl impl = new HibernateImpl();
		
		impl.createTraining(trainingInfoBean);
		/*
		 * impl.createEmployee(empinfo, otherInfo,
		 * Arrays.asList(addressInfoBean,addressInfoBean2),
		 * Arrays.asList(educationalInfoBean,educationalInfoBean2),
		 * Arrays.asList(experienceInfoBean1,experienceInfoBean2));
		 */
		
	}//end of main

}//end of class
