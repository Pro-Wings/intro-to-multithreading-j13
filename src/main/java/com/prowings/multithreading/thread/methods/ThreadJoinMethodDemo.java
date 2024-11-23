package com.prowings.multithreading.thread.methods;

public class ThreadJoinMethodDemo {
	
	public static void main(String[] args) {
		
		JoinDemoThread task1 = new JoinDemoThread();
		JoinDemoThread task2 = new JoinDemoThread();
		
		Thread t1 = new Thread(task1, "my_join_thread-11");
		Thread t2 = new Thread(task1, "my_join_thread-22");
		Thread t3 = new Thread(task1, "my_join_thread-33");
		
		t1.start();
		
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t3.start();
	}

}
