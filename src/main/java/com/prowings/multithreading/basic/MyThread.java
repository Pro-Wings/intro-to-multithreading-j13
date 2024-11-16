package com.prowings.multithreading.basic;

public class MyThread extends Thread{

	public MyThread() {
		super();
	}

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("Inside the Run() of MyThread!!!");
		myMethod1();
	}

	public void myMethod1()
	{
		System.out.println("inside myMethod1() of MyThread class!!");
	}
	
}
