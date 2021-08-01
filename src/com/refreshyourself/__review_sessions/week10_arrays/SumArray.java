package com.refreshyourself.__review_sessions.week10_arrays;

public class SumArray {

	public static void main(String[] args) {
		
        //loop through each item and if u find price more than 100
        //print "Item too expensive, you dont need that"
        //exit the loop
		
		double[] prices = {34.4, 123.4, 10.5, 4.33, 76.4, 90};
		
        for(double price : prices){
            if(price > 100){
                System.out.println(price+ " - Item too expensive, you dont need that");
                break;
            }
        }
        
        //sum of array
        
        double totalPrice = 0.0;

        for(double each : prices){
            totalPrice += each;
        }
        
        System.out.println(totalPrice);

	}

}
