package com.prowings.multithreading.thread.methods;

public class ThreadJoinMethodDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main thread started!!!");
		JoinDemoThread task1 = new JoinDemoThread();
		Thread t1 = new Thread(task1, "my_join_thread-11");
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main thread ended!!!");
		
	}

}
