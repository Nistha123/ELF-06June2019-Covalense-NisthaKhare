package com.covalense.javaapp.filehandlingex;


import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class fileHandlingExample {

	public static void main(String[] args) {

		try {
		//	FileUtils.writeStringToFile(new File("myTextFile.txt"), "Here is my text file");
			
			/*
			 * FileUtils.writeStringToFile(new File("myTextFile2.txt"),
			 * "Here is my text file", Charset.defaultCharset());
			 * System.out.println("file created");
			 */
			System.out.println("reading the file....");
			String fileData = FileUtils.readFileToString(new File("myTextFile2.txt") , Charset.defaultCharset());
			
			System.out.println("File Data " + fileData);
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // End of main

}// End of class
