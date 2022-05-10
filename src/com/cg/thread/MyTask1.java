package com.cg.thread;

public class MyTask1 implements Runnable {
	int data=99;

	@Override
	public void run() {
		System.out.println("Run method");
		data=data+10;
		// TODO Auto-generated method stub
		
	}
	int getData() {
		return data;
	}

	

}
