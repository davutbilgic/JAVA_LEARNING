package com.refreshyourself._40_AccessModifiers.Ex1;

import java.util.ArrayList;

public class FinalArrayList {

	public static void main(String[] args) {
		
		final ArrayList<String> COLORS = new ArrayList<>();
		
		COLORS.add("Orange");
		COLORS.add("Red");
		COLORS.remove(0);
		
		//COLORS = new ArrayList<String>();

	}

}
