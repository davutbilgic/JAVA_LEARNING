package com.refreshyourself._41_AbstractClass;

public abstract class Animal {
	
	String name;
	
	public Animal(String name) {
		this.name=name;
	}
	
	public abstract void eat();
	
	public abstract void breathe();
	
	public void move() {
		System.out.println("Moving");
	}
	
	{
		System.out.println("Hello");
	}

}
