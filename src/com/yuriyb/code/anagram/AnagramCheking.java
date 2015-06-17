package com.yuriyb.code.anagram;

import java.util.ArrayList;
import java.util.List;

public class AnagramCheking {

	public static void main(String[] args) {
		System.out.println(isAnagramCheck("hello", "llohe"));
	}
	
	public static boolean isAnagramCheck(String word1, String word2){
		
		boolean isAnagrame = true;
		List<Character> word2List = new ArrayList<Character>();
		for(int i=0; i<word2.length(); i++)
			word2List.add(word2.charAt(i));
		
		if (word1.length()==word2.length()){
			for(int j=0; j<word1.length(); j++){
				if(!word2List.contains(word1.charAt(j))){
				   	isAnagrame = false;
				   	break;
				}
			}
		}
		return isAnagrame;
	}
}
