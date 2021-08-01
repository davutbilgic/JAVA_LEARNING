package com.refreshyourself._45_Exceptions_ErrorHandling;

public class Runtimeerror {

	public static void main(String[] args) {
		go();
	}
	
	public static void go() {
		System.out.println("Going");
		go();
	}

}
