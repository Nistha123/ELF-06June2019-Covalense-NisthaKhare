package com.covalense.hibernateapp.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.util.HibernateUtil;

/* USE CASE :
 * SaveDemo is a main class 
 * to pass the employee details in the database using session factory
 */

//SOLUTION :
public class SaveDemo {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		Date dateDOB = dateFormat.parse("1990-05-01");
		Date dateJoin = dateFormat.parse("2019-05-01");
		
		Session session = HibernateUtil.openSession();
		EmployeeInfoBean empinfo = new EmployeeInfoBean();
		empinfo.setId(1);
		empinfo.setName("Nistha");
		empinfo.setAge(25);
		empinfo.setGender("Female");
		empinfo.setSalary(35000);
		empinfo.setPhone(565689798);
		empinfo.setEmail("nish@gmail.com");
		empinfo.setDesignation("Manager");
		empinfo.setDob(dateDOB);
		empinfo.setAcnt_no(98798089);
		empinfo.setJoining_date(dateJoin); 
		empinfo.setDept_ID(30);
		empinfo.setManager_ID(12);
		
//		EmployeeOtherInfoBean otherInfo = new EmployeeOtherInfoBean();
//		
//		otherInfo.setIsmarried(false);
//		otherInfo.setPan("cmjpk8343e");
//		otherInfo.setBlood_grp("AB+");
//		otherInfo.setEmergency_contact_number(789898978);
//		otherInfo.setEmergency_contact_name("Niharika");
//		otherInfo.setNationality("Indian");
//		otherInfo.setReligion("Hindu");
//		otherInfo.setFather_name("Sushil Khare");
//		otherInfo.setMother_name("Abha Khare");
//		otherInfo.setSpouse_name(null);
//		otherInfo.setPassport(345645654);
//		otherInfo.setAdhar(67899789);
//		otherInfo.setId(1);
//		
		
		Transaction transaction = session.beginTransaction();
		//session.save(empinfo);
		//session.save(otherInfo);
		session.saveOrUpdate(empinfo);
		transaction.commit();
		session.close();

	}//end of main
}//end of class
