package com.tnsif.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
		UsingRunnable t1=new UsingRunnable(1, 5, "thread1");
		UsingRunnable t2=new UsingRunnable(1, 10, "thread2");
		/*
		 * //By using Thread class Thread t=new Thread(t1); Thread tt2=new Thread(t2);
		 * t.start(); tt2.start();
		 * 
		 * try { t.join(); tt2.join(); } catch(InterruptedException ie) {
		 * Thread.currentThread().interrupt(); // Restore interrupted status
		 * System.err.println("Thread interrupted: " + ie.getMessage());
		 * 
		 * }
		 */

		
		//Using anonymous class
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() { // anonymous class
				System.out.println("Runnable with Anonymous Class");
			}
		};
		
		//Thread t = new Thread(runnable);
		//t.start();
		
		// lambda expression
				runnable = () -> { 
					System.out.println("Runnable with Lambda Expression");
				};
				
				new Thread(runnable).start();

	}

}