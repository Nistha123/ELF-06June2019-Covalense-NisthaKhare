package com.covalense.javaapp.array;

public class TestArray {

	public static void main(String[] args) {

		double a[] = new double[4];
		a[0]=11.1;
		a[1]=22.2;
		a[2]=33.3;
		a[3]=44.4;
		
		System.out.println(a.length);
		for(int i=0 ; i<=a.length ; i++)
		{
			System.out.println(a[i]);
		}
	}//End of main

}//End of class
