package com.cg.thread;

public class JoinEx {

	public static void main(String[] args)  throws InterruptedException {
		System.out.println("main thread start");
		JoinTask task= new JoinTask();
		Thread t1= new Thread(task);
		t1.start();
		System.out.println("....i m waiting");
		//t1.join();
		t1.join(7000);//this is the max time
		
		System.out.println("main thread ends");
		
		// TODO Auto-generated method stub

	}

}
