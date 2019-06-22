package com.covalense.javaapp.filehandlingex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestC {

	public static void main(String[] args) {
		
		String msg = "Hi my name is nistha";
		
		byte b[] = msg.getBytes();
		
		try {
			FileOutputStream fout = new FileOutputStream("MyFile.txt");
			fout.write(b);
			
			System.out.println("Data is written into the file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}//end of main
}//End Of class
