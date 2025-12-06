package com.tnsif.generics;

import java.util.ArrayList;

public class WithoutGenericsDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("String");
		al.add(123);

		for(Object o:al)
		{
			String s=(String) o;
			System.out.println(s);
		}
	}

}