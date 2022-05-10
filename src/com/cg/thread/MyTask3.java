package com.cg.thread;

public class MyTask3 implements Runnable {
	int count=0;

	@Override
	public synchronized void run() {
		
		for(int i=1;i<=10000;i++) {
			count++;
		}
		
		// TODO Auto-generated method stub
		
	}
	int getCount() {
		return count;
	}

}
