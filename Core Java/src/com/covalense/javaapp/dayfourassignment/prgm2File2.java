package com.covalense.javaapp.dayfourassignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

/* USE CASE :
 * prgm2File2 is a main test class 
 * to create a file and write into it
 */

//SOLUTION :
public class prgm2File2 {

	public static void main(String[] args) {
		
		String msg = "Hellooo, Good Morning";
		
		byte b[] = msg.getBytes();
		
		try {
			FileOutputStream fout = new FileOutputStream("Prgm2File1.txt");
			fout.write(b);
			
			System.out.println("Data is written into the file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end of main
}// end of class
