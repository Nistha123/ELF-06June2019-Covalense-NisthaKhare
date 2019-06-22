package com.covalense.javaapp.filehandlingex;

import java.io.File;
import java.io.IOException;

public class TestA {
	public static void main(String[] args) {
		
		File f = new File("d:/nistha.txt");
		
		try {
			boolean res = f.createNewFile();
			System.out.println("result is " + res);
			System.out.println("File created");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
