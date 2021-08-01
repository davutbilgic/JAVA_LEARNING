package com.refreshyourself._37_38_39_Inheritance.Ex2;

public class FulltimeEmployee extends Employee {
	
   @Override
	public void calculatePay(int hours,double rate) {
		double total = (hours*rate)*1.05;
		System.out.println("Fulltimeemployee total pay:" + total);
	}
	


}
