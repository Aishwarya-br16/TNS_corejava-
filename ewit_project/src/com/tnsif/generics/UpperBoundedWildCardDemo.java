package com.tnsif.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildCardDemo {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
				
		System.out.println("Display Sum");
		UpperBoundedWildCard obj=new UpperBoundedWildCard();
		System.out.println(obj.sumOfList(intList));
		
		ArrayList<Float> floatList = new ArrayList<>();
		floatList.add(22.3f);
		floatList.add(11.2f);
		floatList.add(3.4f);
		
		System.out.println("Display Sum");
		System.out.println(obj.sumOfList(floatList));
		
		
		
		
	}

}