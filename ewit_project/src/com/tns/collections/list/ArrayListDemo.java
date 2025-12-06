package com.tns.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.tnsif.scanner.School;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Static Binding
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(new School());
		al.add(22.22f);
		al.add("Gayatri");
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.add(1,100);
		al.add(100);
		al.add(100);
		al.add(100);
		al.add(100);
		al.add(100);
		al.add(100);
		al.add(100);
		System.out.println(al);
		
		//Dynamic Binding
		List l=new ArrayList();
		l.addAll(al);
		System.out.println(l);
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		//By using Generics
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(100);

	}

}