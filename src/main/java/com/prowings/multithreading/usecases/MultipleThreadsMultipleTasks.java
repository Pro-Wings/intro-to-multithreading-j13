package com.prowings.multithreading.usecases;

public class MultipleThreadsMultipleTasks {
	
	public static void main(String[] args) {
		
		MyThread1 task1 = new MyThread1();
		MyThread2 task2 = new MyThread2();
		
		Thread t1 = new Thread(task1, "Task1-Thread");
		Thread t2 = new Thread(task2, "Task2-Thread");
		
		t1.start();
		t2.start();
		
		
	}

}
