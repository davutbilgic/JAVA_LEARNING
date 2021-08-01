package com.refreshyourself._44_OOP_Practice.shapes;

public class Square extends Shape {
	
	public Square() {
		type = "square";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a square");
	}
	
	public void squareMethod() {
		System.out.println("Square method");
	}
	
	

}
