package com.yuriyb.code.math;

public class Fibonaci {

		static int fibonacci (int n){
			return (n<=2 ? 1 : fibonacci(n-1) + fibonacci(n-2));
		}
		
		public static void main(String[] args){
			for (int n=1; n<=16; n++)
				System.out.println(fibonacci(n)+", ");
		}
}
