package com.covalense.javaapp.bean;

import lombok.extern.java.Log;

/* USE CASE :
 * DB1 is a database class to store the
 * pass the object of Person class in store method
 * 
 */

//SOLUTION :

@Log
public class DB1 {

	void store(Person p) {
		log.info("*********** DB1 Data ********");
		log.info("Name is " + p.name);
		log.info("Age is " + p.age);
	}
}//End of class
