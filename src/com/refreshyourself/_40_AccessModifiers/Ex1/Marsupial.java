package com.refreshyourself._40_AccessModifiers.Ex1;

public class Marsupial {
	
	public static boolean isBiped() {
		return false;
	}
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on the two legs:" + isBiped());
	}

}
