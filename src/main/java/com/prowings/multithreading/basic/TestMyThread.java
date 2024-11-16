package com.prowings.multithreading.basic;

public class TestMyThread {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		MyThread thread1 = new MyThread("myThread11");
		MyThread thread2 = new MyThread("myThread22");

		thread1.start();
		thread2.start();
//		thread1.start();
		
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
		
		
		MyThread2 myThread2 = new MyThread2();
		
		Thread t2 = new Thread(myThread2);
		
		t2.start();
		
		System.out.println("main method ended!!");
		
		
		
	}

}
