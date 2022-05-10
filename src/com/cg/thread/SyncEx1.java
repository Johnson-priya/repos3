package com.cg.thread;

public class SyncEx1{

	public static void main(String[] args) throws InterruptedException {
		ConferenceRoomBookingJob c = new ConferenceRoomBookingJob();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		Thread t3=new Thread(c);
		t1.setName(" X : ");
		t2.setName(" Y : ");
		t3.setName(" Z : ");
		 
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		

	}

}
