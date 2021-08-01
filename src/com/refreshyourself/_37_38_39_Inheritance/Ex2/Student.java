package com.refreshyourself._37_38_39_Inheritance.Ex2;

public class Student extends Person {

	@Override
	public void message() {
		System.out.println("This is student class");
	}
	
	public void display() {
		//message();
		super.message();
	}
	

}
