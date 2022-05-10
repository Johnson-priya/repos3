package com.cg.thread;

public class ThreadEx1 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("current thread is " +t.getName());
		t.setName("CG");
		System.out.println("current running thred " + t.getName());// TODO Auto-generated method stub
		t.setPriority(5);
		System.out.println(" new priority " + t.getPriority());
		System.out.println(t);
//System.out.println(t.toString());
		for(int i=1; i<=20; i++) {
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}

}
}
