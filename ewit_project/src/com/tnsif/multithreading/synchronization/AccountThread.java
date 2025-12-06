package com.tnsif.multithreading.synchronization;

public class AccountThread extends Thread{
	
    private Account acc;
    private int amt;
    
    public AccountThread(Account acc,int amt)
	{
		this.acc=acc;
		this.amt=amt;
		//start();
		System.out.println("Threar cfreated");
	}
    @Override
	public void run() {
    	System.out.println("In running state");
		try {
		acc.withdraw(amt);
	}
		catch(InsufficientBalanceException ie) {
			
		}
}
}