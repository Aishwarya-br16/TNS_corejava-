package com.tns.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> pq=new PriorityQueue<String>();
		
		pq.add("Core Java");
		pq.add("Angular");
		pq.add("React");
		pq.add("Html");
		
		System.out.println(pq);
		
		pq.remove();
		System.out.println(pq);
	}

}