package com.cg.thread;

public class DataSharedEx {

	public static void main(String[] args) throws InterruptedException {
		MyTask1 task=new MyTask1();
		Thread t1=new Thread(task);
		Thread t2=new Thread(task);
		t1.start();
		t2.start();
		//main shud hav to wait for another thread to complete the job 
		t1.join();
		t2.join();
		System.out.println(task.getData());
		// TODO Auto-generated method stub

	}

}
