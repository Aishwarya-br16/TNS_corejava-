package com.tnsif.generics;

public class GenericMethod {
	public <E> void displayArrayElements(E[] elements) {
	   for(E e:elements) {
		   System.out.println("Element is "+e);
	   }
	}

}