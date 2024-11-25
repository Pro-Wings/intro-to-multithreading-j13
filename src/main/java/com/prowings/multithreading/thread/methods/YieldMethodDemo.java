package com.prowings.multithreading.thread.methods;

public class YieldMethodDemo {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + " is executing!!!");

		YieldDemoThread task1 = new YieldDemoThread();
		
		Thread t1 = new Thread(task1, "Thread-t1");
		Thread t2 = new Thread(task1, "Thread-t2");
		Thread t3 = new Thread(task1, "Thread-t3");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(Thread.currentThread().getName() + " is ended!!!");

	}

}
