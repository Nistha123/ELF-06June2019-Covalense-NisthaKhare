package com.covalense.javaapp.array;

public class TestIntArray {

	public static void main(String[] args) {

		int i[] = new int[3];

		i[0] = 1;
		i[1] = 2;
		i[2] = 3;

		for (int j = i.length-1; j >= 0; j--) {
			System.out.print(i[j] + " ");
		}
	}//End of main

}//End of class
