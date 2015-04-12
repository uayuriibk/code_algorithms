package com.yuriyb.code.sorting;

import java.util.Scanner;

public class BubleSort {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	
		int n = scan.nextInt();		
		int [] a = new int [n];
		
		for (int i=0; i<a.length; i++)
			a[i] = scan.nextInt();
		
		for (int i=0; i<a.length; i++)
			for (int j=0; j<a.length-1; j++){
				if (a[j]>a[j+1]){
					int c = a[j];
					a[j] = a[j+1];
					a[j+1] = c;
				}
			}
		
		for (int i=0; i<a.length; i++)
			System.out.println(a[i]);
	}
}
