package com.covalense.javaapp.array;

public abstract class TestStringArray {

	public static void main(String[] args) {

		String[] s = new String[4];
		
		s[0]="Nistha";
		s[1]="Niharika";
		s[2]="Abha";
		s[3]="Aadvika";
		
		System.out.println(s.length);
		
		for(int i=0 ; i<s.length ; i++)
		{
			System.out.println(s[i]);
		}
	}//End of main

}//End of class
