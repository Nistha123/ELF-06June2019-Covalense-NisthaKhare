package com.covalense.javaapp.bean;

import lombok.extern.java.Log;

/* USE CASE :
 * DB2 is a database class to store the
 * pass the object of Person class in store method
 * 
 */

//SOLUTION :
@Log
public class DB2 {

	void store(Person p) {
		log.info("*********** DB2 Data ********");
		log.info("Name is " + p.name);
		log.info("Age is " + p.age);
	}
}//End of class
