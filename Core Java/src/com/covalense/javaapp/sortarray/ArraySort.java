package com.covalense.javaapp.sortarray;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArraySort {
	int[] a = new int[5];

	static Integer[] b = { 5, 2, 1, 4, 3 };

	public static void main(String[] args) {
		int temp;
		int num;

		Arrays.sort(b);
	//	Arrays.sort(b, Collections.reverseOrder());
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("***************************************");

		int index = Arrays.binarySearch(b , 4);
		
		System.out.println("Index is " + index);

		/*
		 * for(int i=0 ; i<b.length ; i++) { for(int j=i+1 ; j<b.length ; j++)
		 * 
		 * if(b[i] > b[j]) { temp=b[i]; b[i]=b[j]; b[j]=temp; } }
		 */

//		System.out.println("Enter the number to be searched :");
//		Scanner sc = new Scanner(System.in);
//		num = sc.nextInt();
//		
//		for(int i=0 ; i<b.length ; i++) {
//			if(b[i] == num) {
//				System.out.println(b[i] + " number found ");
//			}
//		}
	}
}
