package com.covalense.javaapp.sortarray;

public class ArrayEquality {

	public static void main(String[] args) {

		int[] a = { 5, 6, 1, 3, 7 };
		int[] b = { 5, 6, 2, 3, 7 };
		boolean equal = true;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				if (a[i] != b[j]) {
					equal = false;
					break;
				}
			}
		}

		if (equal) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

	}

}
