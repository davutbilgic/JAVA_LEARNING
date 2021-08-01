package com.refreshyourself._24_25_26_27_Arrays.Ar2Exs;

public class PassElements {

	public static void main(String[] args) {
		
		int[] numbers = {5,10,15,20,50,30};
		
		for(int value : numbers) {
			
			showValue(value);
		}

	}
	
	public static void showValue(int n) {
		
		System.out.print(n + " ");
		
	}

}
