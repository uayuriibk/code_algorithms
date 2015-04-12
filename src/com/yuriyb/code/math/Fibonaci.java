package com.yuriyb.code.math;

public class Fibonaci {

		static int calcFibonacci (int n){
			return (n<=2 ? 1 : calcFibonacci(n-1) + calcFibonacci(n-2));
		}
		
		static void main(String[] args){
			for (int n=1; n<=16; n++)
				System.out.println(calcFibonacci(n)+", ");
		}
}
