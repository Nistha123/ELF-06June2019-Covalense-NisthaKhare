package com.covalense.javaapp.sortarray;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import lombok.extern.java.Log;

@Log
public class ArraySort {
	int[] a = new int[5];

	static Integer[] b = { 5, 2, 1, 4, 3 };

	public static void main(String[] args) {
		int temp;
		int num;

		Arrays.sort(b);
		for (int i = 0; i < b.length; i++) {
			log.info("" + b[i]);
		}
		
		log.info("***************************************");

		int index = Arrays.binarySearch(b , 4);
		
		log.info("Index is " + index);

		
	}
}
