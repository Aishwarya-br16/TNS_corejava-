package com.tnsif.generics;

import com.tnsif.firstpackage.Person;

public class GenericMethodTest {

	public static void main(String[] args) {
		Integer[] a= {10,20,30,40};
		String[] s= {"Java","Python","C"};
		Person[] pArray=new Person[] {
		    //new Person("Aishwarya",34,"Banagalore"),
			//new Person("Anuu",35,"Chennai"),
		    //new Person("Keerthi",36,"Hyderabad")
		};

		GenericMethod g=new GenericMethod();
		g.displayArrayElements(a);
		g.displayArrayElements(s);
		g.displayArrayElements(pArray);
		
	}
}