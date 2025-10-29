package com.tnsif.basic;

public class WrapperClassDemo {

	public static void main(String[] args) {
		float f=22.22f;
		
		//Wrapping
		Float obj=f;
		
		float f1=obj.floatValue();
		System.out.println(f1);
	}
}