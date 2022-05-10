package com.cg.thread;

public class FileDownloader implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		System.out.println("file downloader thread starts runnin");
		for(int i=1;i<1000;i++) {
			System.out.println("Child : " + i);
		}
		// TODO Auto-generated method stub
		
	}

}
