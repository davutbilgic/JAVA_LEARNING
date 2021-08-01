package com.refreshyourself._44_OOP_Practice.shapes;

public class Triangle extends Shape {
	
	public Triangle() {
		type = "triangle";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a triangle");
	}
	
	

}
