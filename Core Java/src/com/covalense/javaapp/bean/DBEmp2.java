package com.covalense.javaapp.bean;

import lombok.extern.java.Log;

/* USE CASE :
 * DBEmp2 is a database class to store the
 * pass the object of Employee class in show method
 * 
 */

//SOLUTION :

@Log
public class DBEmp2 {

	void show(Employee e) {

		log.info("*********** Employee DB2 Data ********");
		log.info("Name is " + e.getName());
		log.info("Employee ID is " + e.getEmpId());
		log.info("Gender is " + e.getGender());
	}
}//End of class
