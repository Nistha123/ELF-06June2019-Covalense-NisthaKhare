package com.covalense.javaapp.array;

public class TestArray1 {

	public static void main(String[] args) {

		char[] c = new char[5];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		c[3]='d';
		c[4]='e';
		
		System.out.println(c.length);
		for(int i=0 ; i<c.length ; i++)
		{
			System.out.println(c[i]);
		}
	}//End of main

}//End of class
