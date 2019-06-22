package com.covalense.javaapp.filehandlingex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class FileWriteObject {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("Nistha");
		p.setAge(20);
		
		
		FileOutputStream fout = null;
		ObjectOutputStream obj = null;
		try {
			fout = new FileOutputStream("nistha.txt");
			 obj = new ObjectOutputStream(fout);
			
			obj.writeObject(p);
			System.out.println("Done");
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
