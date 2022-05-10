package com.cg.thread;

public class ConferenceRoom1 implements Runnable {
	boolean isAvailable=true;

	@Override
	public void run() {
		book();
		
		
	}

	synchronized void book() {
		Thread t=Thread.currentThread();
		if()
	}

}
