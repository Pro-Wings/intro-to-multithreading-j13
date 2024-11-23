package com.prowings.multithreading.usecases;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		
		System.out.println("MyThread2 - Name of currently executing thread is : "+ Thread.currentThread().getName());
		System.out.println("MyThread2 - Priority of currently executing thread is : "+ Thread.currentThread().getPriority());
		
	}
	
	

}
