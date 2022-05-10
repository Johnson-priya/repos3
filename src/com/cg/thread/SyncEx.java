package com.cg.thread;

public class SyncEx {

	public static void main(String[] args) throws InterruptedException  {
		Banking bank = new Banking();
		Thread t1=new Thread(bank);
		Thread t2=new Thread(bank);
		t1.setName("ATM");
		t2.setName("Gpay");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Bal Amount: "+ bank.getBalanceAmt());
		
		// TODO Auto-generated method stub

	}

}
