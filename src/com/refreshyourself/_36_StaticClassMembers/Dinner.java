package com.refreshyourself._36_StaticClassMembers;

public class Dinner {
	
	static int pizzaSlice = 8;
	
	public void takeASlice() {
		pizzaSlice--;
	}

	public void takeASlice(int count) {
		pizzaSlice-=count;
	}

}
