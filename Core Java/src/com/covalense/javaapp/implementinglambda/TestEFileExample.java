package com.covalense.javaapp.implementinglambda;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;;

/* USE CASE :
 * TestEFileExample is a main class to remove warning for resource leak
 * 
 */

//SOLUTION :
public class TestEFileExample {

	public static void main(String[] args) {

		String msg = "helloooooooo";
		byte b[] = msg.getBytes();

		try (FileOutputStream fout = new FileOutputStream("MyNewFile.txt")) {

			fout.write(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}//end of main

}//end of class
