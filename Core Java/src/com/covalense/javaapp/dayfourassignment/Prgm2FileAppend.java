                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                package com.covalense.javaapp.dayfourassignment;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

public class Prgm2FileAppend {
	
	public static void main(String[] args) {
		
		try {
			FileUtils.writeStringToFile(new File("prgm2file2.txt"), "my name is nistha" ,"Hellooo, Good Morning", true);
			                                                                                                                                                 
			System.out.println("File is created....");
			
		//	String fstring = FileUtils.writeStringToFile("prgm2file2.txt", );
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
