package com.tnsif.staticdemo;

public class MyClass {
	
	private int section; //non-static or instance variable
	private static int srNo; //static or class variable
	
	//Static Block
	static {
		System.out.println("--------Within Static Block--------");
		srNo=1000;
	}
	
	//Default Constructor
	MyClass(){
		System.out.println("--------Within Default Constructor--------");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		return "MyClass [Serial No="+srNo+", Section=" + section + "]";
	}
	
	//Static Method
	static void display() {
		//System.out.println("Section: "+section); //can't be accessed
		System.out.println("Serial Number: "+srNo);
	}
}