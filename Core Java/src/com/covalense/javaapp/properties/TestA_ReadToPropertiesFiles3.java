package com.covalense.javaapp.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

/* USE CASE :
 * TestA_ReadToPropertiesFiles3 is a main class loading values from Properties file
 * 
 */

//SOLUTION :
@Log
public class TestA_ReadToPropertiesFiles3 {
	
	public static void main(String[] args) {
		
		FileInputStream fin;
		try {
			fin = new FileInputStream("Demo.properties");
			
			Properties pro = new Properties();
			pro.load(fin);
			
			log.info("Name is :" + pro.getProperty("CompanyName"));
			log.info("Number is :" + pro.getProperty("PhoneNumber"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}//end of main

}//end of class
