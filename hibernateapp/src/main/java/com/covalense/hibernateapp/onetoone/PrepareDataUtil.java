package com.covalense.hibernateapp.onetoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class PrepareDataUtil {
	
	private PrepareDataUtil() {}
	
	public static EmployeeInfoBean prepareData(int id) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		Date dateDOB = null;
		try {
			dateDOB = dateFormat.parse("1990-05-01");
		} catch (ParseException e) {
			log.severe(Arrays.toString(e.getStackTrace()));
		}
		Date dateJoin = null;
		try {
			dateJoin = dateFormat.parse("2019-05-01");
		} catch (ParseException e) {
			log.severe(Arrays.toString(e.getStackTrace()));
		}
		
		EmployeeInfoBean empinfo = new EmployeeInfoBean();
		empinfo.setId(id);
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
		
		EmployeeOtherInfoBean otherInfo = new EmployeeOtherInfoBean();
		otherInfo.setId(1);
		otherInfo.setIsmarried(false);
		otherInfo.setPan("CMFDG2341k");
		otherInfo.setBlood_grp("A+");
		otherInfo.setChallenged(false);
		otherInfo.setEmergency_contact_name("Niharika");
		otherInfo.setEmergency_contact_number(678687980);
		otherInfo.setNationality("Indian");
		otherInfo.setReligion("Hindu");
		otherInfo.setFather_name("Sushil");
		otherInfo.setMother_name("abha");
		otherInfo.setPassport(689778);
		otherInfo.setAdhar(787889);
		
		empinfo.setOtherInfo(otherInfo);
		return empinfo;
		
	}

}
