package com.covalense.designpattern.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {
	public static void main(String[] args) throws ParseException {
		MyImmutableClass immutableClass = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date dt = format.parse("1992-06-06");
		Date dtJoin = format.parse("2018-06-06");

		immutableClass = new MyImmutableClass("nistha", 25, 970709909);
		log.info("Name is :" + immutableClass.getName());
		log.info("Age is :" + immutableClass.getAge());
		log.info("Phone is :" + immutableClass.getPhone());

		immutableClass = new MyImmutableClass("nish", 26, 970709909);
		log.info("Name is :" + immutableClass.getName());
		log.info("Age is :" + immutableClass.getAge());
		log.info("Phone is :" + immutableClass.getPhone());

		EmployeeData emp = new EmployeeData(18, "Malvika", 29, "Female", 24000, 435466, "mal@gmail.com", "HR",
							dt, 67868979, dtJoin, 20, 11);

		log.info("Object data is :" + emp.toString());
		
		/*
		 * EmployeeDataTwo dataTwo = new EmployeeDataTwo.EmployeeDataTwoBuilder()
		 * .id(17) .name("Vineesha") .age(22) .dob(dt) .salary(6979.789)
		 * .phone(648897089l) .AccountNo(56786890) .joining_date(dtJoin)
		 * .email("vin@gmail.com") .gender("Female") .designation("Software Engineer")
		 * .DepartmentId(10) .ManagerId(24) .build();
		 */
		EmployeeDataThree dataThree = new EmployeeDataThree.EmployeeDataThreeBuilder()
				.id(18)
				.name("Nitish")
				.age(22)
				.dob(dt)
				.salary(6979.789)
				.phone(648897089l)
				.AccountNo(56786890)
				.joining_date(dtJoin)
				.email("nit@gmail.com")
				.gender("Male")
				.designation("Software Engineer")
				.DepartmentId(10)
				.ManagerId(24)
				.build();
		
		log.info("Employee data Three :" + dataThree.toString());

	}// end of main
	
}// end of class
