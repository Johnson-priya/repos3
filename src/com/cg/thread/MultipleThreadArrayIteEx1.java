package com.cg.thread;

public class MultipleThreadArrayIteEx1 {

	public static void main(String[] args) {
		int arr[] = {4, 54, 5, 32, 12, 23, 6, 23, 89, 122, 45, 54, 67,79, 43,};
		
		MyTask2 task = new MyTask2();
		task.setArr(arr);
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.setName("Thread A");
		t2.setName("Thread B");
		t1.start();
		t2.start();
		System.out.println(task.getArr());
		
		
		// TODO Auto-generated method stub

	}

}
