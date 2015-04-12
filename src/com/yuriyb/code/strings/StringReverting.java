package com.yuriyb.code.strings;

import java.util.Scanner;

public class StringReverting {
	
	public static String stringRevert(String revertString){
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=revertString.length()-1; i>=0; i--){
			sb.append(revertString.charAt(i));
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		
		System.out.println(stringRevert(inputString));
		
	}

}
