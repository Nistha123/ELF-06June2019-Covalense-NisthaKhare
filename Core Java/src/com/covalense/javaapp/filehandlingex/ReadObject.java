package com.covalense.javaapp.filehandlingex;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {

		FileInputStream fis = null;
		ObjectInputStream oin = null;
		try {
			fis = new FileInputStream("nistha.txt");

			oin = new ObjectInputStream(fis);
			Person p1 = (Person) oin.readObject();

			System.out.println("Name is " + p1.getName());
			System.out.println("Age is " + p1.getAge());

			fis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (oin != null) {
				try {
					oin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
