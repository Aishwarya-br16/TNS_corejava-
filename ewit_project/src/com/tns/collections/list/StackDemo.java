package com.tns.collections.list;

import java.util.Deque;
import java.util.Stack;
import java.util.Vector;

public class StackDemo {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		System.out.println(s);
		s.pop();
		System.out.println(s);

	}
}