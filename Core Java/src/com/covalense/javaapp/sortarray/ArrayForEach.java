package com.covalense.javaapp.sortarray;

public class ArrayForEach {

	public static void main(String[] args) {

		int[] a = {4,6,3,2,9};
		double[] b = {1.1, 7.6, 6.5, 3.4};
		String[] c = {"Nistha", "Rohit", "Shubham", "Nikita"};
		
		for (String s : c) {
			
			System.out.println("string is " + s);
		}
		
		for (int i : a) {
			
			System.out.println("Int Number is " + i);
		}
		
		for (double d : b) {
			
			System.out.println("Double number is " + d);
		}
	}

}
