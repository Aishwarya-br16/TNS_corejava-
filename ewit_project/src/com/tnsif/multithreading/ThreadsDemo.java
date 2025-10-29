package com.tnsif.multithreading;

public class ThreadsDemo {

	public static void main(String[] args) {
		ChildThread t1 = new ChildThread(5, "First"); // creating child thread object
		ChildThread t2 = new ChildThread(10, "Second"); // creating child thread object
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}
		
		catch(InterruptedException ie) {
			Thread.currentThread().interrupt(); // Restore interrupted status
			System.err.println("Thread interrupted: " + ie.getMessage());
		}
		
		System.out.println("-----------------------End of Main--------------------------");
	}
}