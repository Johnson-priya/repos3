package com.cg.thread;

public class MultiThreadEx1 {

	public static void main(String[] args) {
		System.out.println("main thread started");
		Thread.currentThread().setPriority(5);
		FileDownloader downloader = new FileDownloader();
		Thread t=new Thread(downloader);
		t.setPriority(6);
		t.start();
		for(int i =1;i<=1000;i++) {
			System.out.println("main : "+i);
		}
		System.out.println("main thread ends....");

	}

}
