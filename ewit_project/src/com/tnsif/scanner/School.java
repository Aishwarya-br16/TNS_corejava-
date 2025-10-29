package com.tnsif.scanner;
public class School {
	
	private static int a;
	private int b;
	
	public static void m1() {
		//non-static members can't be accessed in static method
		System.out.println(a);
	}
	
	public void m2() {
		System.out.println(b);
		System.out.println(a);
		m1();
	}
	
	static {
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		//School s=new School();
		School.a=10;
		m1();
		//m2();
	}
}