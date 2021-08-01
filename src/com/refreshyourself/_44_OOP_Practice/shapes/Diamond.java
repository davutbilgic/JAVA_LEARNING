package com.refreshyourself._44_OOP_Practice.shapes;

public class Diamond extends Shape {
	
	public Diamond() {
		type = "diamond";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a diamond");
	}
	
}
