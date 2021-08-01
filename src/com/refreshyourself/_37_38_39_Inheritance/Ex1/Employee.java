package com.refreshyourself._37_38_39_Inheritance.Ex1;

public class Employee extends Person  {
	
	String jobTitle;
	
	
	public void work() {
		System.out.println(name + " is working as " + jobTitle);
	}

	
	public String toString() {
		return "Employee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	

}
