package com.tns.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList l=new LinkedList();	
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(null);
	l.add("Hi");
	
	System.out.println(l);
	l.removeFirst();
	ListIterator li=l.listIterator();
	
	while(li.hasNext()) {
		System.out.println(li.next());
	}
	l.addLast(22.2f);
	System.out.println(l);
	l.add(2, 50);
	System.out.println(l);
}
	
}