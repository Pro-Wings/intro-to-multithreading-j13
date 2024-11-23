package com.prowings.multithreading.thread.methods;

public class ThreadSleepMethodDemo {
	
	public static void main(String[] args) {
		
		SleepDemoThread task = new SleepDemoThread();
		
		Thread t1 = new Thread(task, "mythread-11");
		
		t1.start();
	}

}
