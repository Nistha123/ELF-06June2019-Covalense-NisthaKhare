package com.covalense.javaapp.mapcollection;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {

		int a[] = { 5, 6, 2, 1, 4 };
		int b[] = { 30, 40, 50, 60, 70, 80 };
		int end = 0;

		int index = 1;
		int n=2;

		for (int i = index ; i <= b.length - 1; i++) {
			
			for(int j=0 ; j<=n ;) {
				
				b[i] = a[j];
				end++;
				
				if(end >= n) {
					break;
				}				
			j++;
			}			
				
			
		}

		for (int i = 0; i <= b.length - 1; i++) {

			System.out.println(b[i]);

		}
	}
}
