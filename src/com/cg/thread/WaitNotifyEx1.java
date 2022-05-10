package com.cg.thread;

public class WaitNotifyEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static class Video implements Runnable{
		private Audio audio;
		public void setAudio(Audio audio) {
			this.audio=audio;
		}

		@Override
		public void run() {
			playVideo();
			
		}
		synchronised void playVideo() {
			for(int i=1; i<=10; i++) {
				System.out.println("............playing audio..........."); 
			}
		}
	}

}
