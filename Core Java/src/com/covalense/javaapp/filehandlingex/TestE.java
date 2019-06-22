package com.covalense.javaapp.filehandlingex;

import java.io.FileWriter;
import java.io.IOException;

public class TestE {

	public static void main(String[] args) {
		
		String msg = "Ding ding dingana...Dam Dam dagana";
		
		char c[] = msg.toCharArray();
		
		try {
			FileWriter fw = new FileWriter("password.txt");
			fw.write(c);
			fw.flush();
			
			System.out.println("Done.....");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
