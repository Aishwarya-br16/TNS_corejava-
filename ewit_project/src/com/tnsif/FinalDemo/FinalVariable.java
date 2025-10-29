package com.tnsif.FinalDemo;

public class FinalVariable {
	//Final instance variable must be initialized
	//Final int x1;
	final int x = 100;
	
	//Declare a static blank final variable.
	final static int Y=100;
		
	//Instance method
	void change() {
		//x = 30; //Final variables can not be reassigned
		//Y = 200; //Final static variables can not be reassigned
	}
	
	//Declare a static block to initialize the final static variable.
	static {
		//Y = 20;
		//Z = 100; //Once initialized can't be reassigned
		System.out.println("Value of Y: " + Y);
	}
}