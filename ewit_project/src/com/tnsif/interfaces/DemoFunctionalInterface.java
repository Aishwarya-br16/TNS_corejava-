package com.tnsif.interfaces;

@FunctionalInterface
public interface DemoFunctionalInterface {
	
	void m1();
	default void m2(){
		
	}
	
	static void m3() {
		
	}
}