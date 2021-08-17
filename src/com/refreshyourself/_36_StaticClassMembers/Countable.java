package com.refreshyourself._36_StaticClassMembers;

public class Countable {
	
	static int instanceCount; //static variables 

	public Countable() {
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}

}
