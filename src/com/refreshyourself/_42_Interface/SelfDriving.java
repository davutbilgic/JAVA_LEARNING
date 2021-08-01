package com.refreshyourself._42_Interface;

public interface SelfDriving {
	
	public abstract void selfDrive();
	
	public default void drive() {
		System.out.println("Hello");
	}

}
