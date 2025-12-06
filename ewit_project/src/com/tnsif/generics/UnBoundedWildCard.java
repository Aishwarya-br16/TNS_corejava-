package com.tnsif.generics;

import java.util.List;

public class UnBoundedWildCard {
	public static void display(List<?> l) {
		for (Object o : l) {
			System.out.println(o);
		}

   }
}