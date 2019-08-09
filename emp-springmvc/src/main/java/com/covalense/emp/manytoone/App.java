package com.covalense.emp.manytoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.covalense.emp.dto.EmployeeDepartmentInfoBean;
import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.EmployeeOtherInfoBean;
import com.covalense.emp.onetoone.HibernateImpl;

import lombok.extern.java.Log;

@Log
public class App {
	/*
	 * public static void main(String[] args) { HibernateImpl impl = new
	 * HibernateImpl(); EmployeeInfoBeanone beanone = impl.getEmployee(1);
	 * 
	 * EmployeeInfoBeanone beanone1 = new EmployeeInfoBeanone(); beanone1.setId(10);
	 * beanone1.setName("xyz"); beanone1.setDesignation("SD"); beanone1.setAge(33);
	 * beanone1.setEmail("abc@gmail.com"); beanone1.setMngId(beanone);
	 * 
	 * EmployeeInfoBeanone beanone2 = new EmployeeInfoBeanone(); beanone2.setId(11);
	 * beanone2.setName("pqr"); beanone2.setDesignation("SD"); beanone2.setAge(33);
	 * beanone2.setEmail("abc@gmail.com"); beanone1.setMngId(beanone);
	 * 
	 * impl.createEmployee(beanone1); impl.createEmployee(beanone2); }
	 */

	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

		Date passDate = null;
		try {
			passDate = dateFormat.parse("2018-03-05");
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
		EmployeeDepartmentInfoBean deptInfo = new EmployeeDepartmentInfoBean();
		deptInfo.setDeptID(102);
		deptInfo.setDeptName("Computer Science");

		EmployeeInfoBean beanone = new EmployeeInfoBean();
		beanone.setId(4);
		beanone.setName("Roshan");
		beanone.setGender("male");
		beanone.setAge(28);
		beanone.setDesignation("MD");
		//beanone.setDepartmentinfoBean(deptInfo);

		EmployeeOtherInfoBean otherInfoBean = new EmployeeOtherInfoBean();
		otherInfoBean.setBlood_grp("A+");
		//otherInfoBean.setAdhar(789);
		otherInfoBean.setPan("PAN3422000");
		otherInfoBean.setInfobean(beanone);

		beanone.setOtherInfo(otherInfoBean);

		EmployeeAddressPKBean addressPKBean1 = new EmployeeAddressPKBean();
		addressPKBean1.setInfoBean(beanone);
		addressPKBean1.setAddressType("T");

		EmployeeAddressPKBean addressPKBean2 = new EmployeeAddressPKBean();
		addressPKBean2.setInfoBean(beanone);
		addressPKBean2.setAddressType("P");

		EmployeeAddressInfoBean addressInfoBean1 = new EmployeeAddressInfoBean();
		addressInfoBean1.setAddress1("abc");
		addressInfoBean1.setAddress2("hjk");
		addressInfoBean1.setCity("kanpur");
		addressInfoBean1.setState("UP");
		addressInfoBean1.setPincode(3434);
		addressInfoBean1.setCountry("India");
		addressInfoBean1.setAddresspKBean(addressPKBean1);

		EmployeeAddressInfoBean addressInfoBean2 = new EmployeeAddressInfoBean();
		addressInfoBean2.setAddress1("dffr");
		addressInfoBean2.setAddress2("rtg");
		addressInfoBean2.setCity("Pune");
		addressInfoBean2.setState("maharashtra");
		addressInfoBean2.setPincode(3438);
		addressInfoBean2.setCountry("India");
		addressInfoBean2.setAddresspKBean(addressPKBean2);

		EmployeeEducationalPKBean educationalPKBean1 = new EmployeeEducationalPKBean();
		educationalPKBean1.setEducationalType("graduation");
		educationalPKBean1.setInfoBean(beanone);

		EmployeeEducationalPKBean educationalPKBean2 = new EmployeeEducationalPKBean();
		educationalPKBean2.setEducationalType("post graduation");
		educationalPKBean2.setInfoBean(beanone);

		EmployeeEducationalInfoBean educationalInfoBean = new EmployeeEducationalInfoBean();
		educationalInfoBean.setDegreeType("masters");
		educationalInfoBean.setCollegeName("mvm");
		educationalInfoBean.setBranch("kanpur");
		educationalInfoBean.setLocation("hjkhk");
		educationalInfoBean.setUniversity("sawqde");
		educationalInfoBean.setPercentage(78);
		educationalInfoBean.setYop(passDate);
		educationalInfoBean.setPkBean(educationalPKBean1);

		EmployeeEducationalInfoBean educationalInfoBean2 = new EmployeeEducationalInfoBean();
		educationalInfoBean2.setDegreeType("bachelors");
		educationalInfoBean2.setCollegeName("DAMS");
		educationalInfoBean2.setBranch("Jhansi");
		educationalInfoBean2.setLocation("hjkhk");
		educationalInfoBean2.setUniversity("sawqde");
		educationalInfoBean2.setPercentage(88);
		educationalInfoBean2.setYop(passDate);
		educationalInfoBean2.setPkBean(educationalPKBean2);

		EmployeeExperiencePKBean experiencePKBean1 = new EmployeeExperiencePKBean();
		experiencePKBean1.setCompany_name("Adobe");
		experiencePKBean1.setInfoBean(beanone);

		EmployeeExperiencePKBean experiencePKBean2 = new EmployeeExperiencePKBean();
		experiencePKBean2.setCompany_name("Infosys");
		experiencePKBean2.setInfoBean(beanone);

		EmployeeExperienceInfoBean experienceInfoBean1 = new EmployeeExperienceInfoBean();
		experienceInfoBean1.setDesignation("jr. Engineer");
		experienceInfoBean1.setJoiningDate(dateJoin);
		experienceInfoBean1.setLeavingDate(dateLeave);
		experienceInfoBean1.setExpPKBean(experiencePKBean1);

		EmployeeExperienceInfoBean experienceInfoBean2 = new EmployeeExperienceInfoBean();
		experienceInfoBean2.setDesignation("sr. Engineer");
		experienceInfoBean2.setJoiningDate(dateJoin);
		experienceInfoBean2.setLeavingDate(dateLeave);
		experienceInfoBean2.setExpPKBean(experiencePKBean2);

		beanone.setLstAddressInfoBean(Arrays.asList(addressInfoBean1, addressInfoBean2));
		beanone.setLstEducationalInfo(Arrays.asList(educationalInfoBean, educationalInfoBean2));
		beanone.setLstExperienceInfo(Arrays.asList(experienceInfoBean1, experienceInfoBean2));

		HibernateImpl impl = new HibernateImpl();
		impl.createEmployee(beanone);

	}
}
