package com.prowings.multithreading.usecases;

public class MyThread1 implements Runnable{

	@Override
	public void run() {
		
		System.out.println("MyThread1 - Name of currently executing thread is : "+ Thread.currentThread().getName());
		System.out.println("MyThread1 - Priority of currently executing thread is : "+ Thread.currentThread().getPriority());
		
	}
	
	

}
