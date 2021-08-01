package com.refreshyourself._37_38_39_Inheritance.Ex2;

public class Car extends Vehicle {
	
	int maxSpeed = 180;
	
	public void display() {
		System.out.println("Maximum speed:" + super.maxSpeed);
		System.out.println("Maximum speed:" + maxSpeed);
		
	}

}
