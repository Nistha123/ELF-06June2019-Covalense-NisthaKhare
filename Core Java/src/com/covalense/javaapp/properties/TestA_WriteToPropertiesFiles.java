package com.covalense.javaapp.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

/* USE CASE :
 * TestA_WriteToPropertiesFiles is a main class storing values using Properties file
 * 
 */

//SOLUTION :
@Log
public class TestA_WriteToPropertiesFiles {

	public static void main(String[] args) {
		
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("Demo.properties");
			

			Properties p = new Properties();
			p.setProperty("CompanyName", "Covalense");
			p.setProperty("PhoneNumber", "899088980");
			
			p.store(fout, "Company Details");
			
			log.info("file Created");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}//end of main
}//end of class
