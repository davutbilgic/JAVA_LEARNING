package com.refreshyourself._19_20_21_22_StringClass;

public class String_IndexOf2 {

	public static void main(String[] args) {
		
		//index of with 2 values
		
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf("-");
		System.out.println(firstDash);
		
		int secondDash = list.indexOf("-", 5);
		System.out.println(secondDash);
		
		int thirdDash = list.indexOf("-",secondDash+1);
		System.out.println(thirdDash);
		
		int lastDash = list.lastIndexOf("-");
		System.out.println(lastDash);
		
		
		
		
		
		
		
	
		
		

	}

}
