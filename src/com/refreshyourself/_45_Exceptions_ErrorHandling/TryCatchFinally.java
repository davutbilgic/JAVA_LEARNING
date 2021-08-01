package com.refreshyourself._45_Exceptions_ErrorHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		String str = "Selenium";
		
		try {
			System.out.println(str.length());
			System.out.println(str.charAt(100));
		}catch(Exception e) {
			System.out.println("Enter correct index");
			return;
		}finally {
			System.out.println("Finally block");
		}
		
		System.out.println("Bye..");

	}

}
