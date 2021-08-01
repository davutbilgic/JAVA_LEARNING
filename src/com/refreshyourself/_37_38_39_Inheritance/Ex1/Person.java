package com.refreshyourself._37_38_39_Inheritance.Ex1;

public class Person {
	
		String name;  //public 
		int age;     //default
		char gender;
		
		public void eat(String food) {
			System.out.println(name + " is eating " + food);
		}
		
		public void walk() {
			System.out.println(name + " is walking");
		}
		
		public void sleep(int hours) {
			System.out.println(name + " is sleeping for " + hours + " hours");
		}

}
