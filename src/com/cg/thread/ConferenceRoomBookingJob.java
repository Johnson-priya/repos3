package com.cg.thread;

public class ConferenceRoomBookingJob implements Runnable {
	private boolean isAvailable=true;

	@Override
	public void run() {
		booking();
		}
	synchronized void booking() {
		Thread t=Thread.currentThread(); 
		if(isAvailable()) {
			System.out.println(t.getName() + " Booking room");
			isAvailable=false;
			System.out.println("booked for" + t.getName());
			}
		else {
			System.out.println(t.getName() + " Room is booked ");
		}
		
		}
	boolean isAvailable() {
	
		return isAvailable;
	}

}
