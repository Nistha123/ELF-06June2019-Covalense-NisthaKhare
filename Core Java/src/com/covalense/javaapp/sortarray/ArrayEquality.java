package com.covalense.javaapp.sortarray;

import lombok.extern.java.Log;

@Log
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
			log.severe("Arrays are equal");
		} else {
			log.severe("Arrays are not equal");
		}

	}

}
