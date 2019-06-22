package com.covalense.javaapp.sortarray;

public class CopyArray {
	
	public static void main(String[] args) {
		
		int[] a = {5,2,1,4,3};
		int[] b = new int[5];
		
		for(int i=0 ; i<a.length ; i++) {
			
				b[i] = a[i];
				
		}
		for(int j=0 ; j<b.length ; j++){
		System.out.println(b[j]);
		}
	}

}
