package com.prowings.multithreading.thread.methods;

public class YieldDemoThread implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 3; i++) {
			
			System.out.println(Thread.currentThread().getName() + " is executing!!!");
			Thread.yield(); // Hint to yield CPU
		}

	}

}
