package com.refreshyourself._19_20_21_22_StringClass;

public class Question_5 {
	
	public static void main(String[] args) {
		
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
		
		
	}
	
	public static String firstHalf(String str) {
		
		int x  = str.length()/2;
		
		return str.substring(0,x);
	}

}
