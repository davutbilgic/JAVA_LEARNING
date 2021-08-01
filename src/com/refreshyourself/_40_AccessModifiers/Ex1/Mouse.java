package com.refreshyourself._40_AccessModifiers.Ex1;

public class Mouse extends Rodent {
	

	protected int tailLength = 8;
	
	public void getMouseDetails() {
		System.out.println("tail:" + tailLength + ",parentTail:" + super.tailLength);
	}
	
	

}
