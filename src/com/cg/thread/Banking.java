package com.cg.thread;

public class Banking implements Runnable {
	float balanceAmt=5000;

	@Override
	public void run() {
		//synchronized(this) {
		debit(4000);
		//}
	}
	 void debit(int debitAmt) {
		Thread t=Thread.currentThread();
		if(balanceAmt>=debitAmt) {
			System.out.println(t.getName() + " ready to debit");
			
			balanceAmt=balanceAmt-debitAmt;
			
			System.out.println(t.getName()+" Successfully Debited ");
			}
		else {
			System.out.println(t.getName()+" Insuuficient Balance ");
		}
	}
	public float getBalanceAmt() {
		return balanceAmt;
	}

}
