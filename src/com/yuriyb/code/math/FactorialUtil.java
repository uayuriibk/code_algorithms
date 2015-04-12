package com.yuriyb.code.math;

public class FactorialUtil {
	
	public static int factorial(int n){
		if(n==0) return 1;
		return n*factorial(n-1);
	}
	
	public static int factorial2(int n){
	        int ret = 1;
	        for (int i = 1; i <= n; ++i) ret *= i;
	        return ret;
	}


	public static void main(String[] args) {

		System.out.println(factorial(3));
	}
}
