package com.cg.thread;

public class MyTask2 implements Runnable{
	private int arr[];
	
	

	public int[] getArr() {
		return arr;
	}


	public void setArr(int[] arr) {
		this.arr = arr;
	}


	@Override
	public void run() {
		Thread t = Thread.currentThread();		
		for(int i=0; i<=arr.length;i++) {
			System.out.println(t.getName()+ "  "+ arr[i]);
			//System.out.println(arr[i]);
			/*try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}*/
		}
		// TODO Auto-generated method stub
		
	}

}
