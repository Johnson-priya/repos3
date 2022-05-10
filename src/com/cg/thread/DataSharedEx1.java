package com.cg.thread;

public class DataSharedEx1 {

	public static void main(String[] args) throws InterruptedException {
		MyTask3 task=new MyTask3();
		Thread t1 = new Thread(task);
		Thread t2=new Thread(task);
		Thread t3=new Thread(task);
		t1.start();
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		int  result=task.getCount();
		System.out.println("Result : "+result);
		
		// TODO Auto-generated method stub

	}

}
