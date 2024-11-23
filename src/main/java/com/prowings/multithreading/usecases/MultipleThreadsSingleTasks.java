package com.prowings.multithreading.usecases;

public class MultipleThreadsSingleTasks {
	
	public static void main(String[] args) {

		System.out.println("main thread started!!");
		
		MyThread1 task = new MyThread1();
		
		Thread t1 = new Thread(task, "T1-Thread");
		t1.setName("mythread 11");
		t1.setPriority(10);
		Thread t2 = new Thread(task, "T2-Thread");
		t2.setPriority(10);
		
		t1.start();
		t2.start();
		
		System.out.println("main thread ended!!");
	}

}
