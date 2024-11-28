package com.prowings.multithreading.synch;

public class TestSynchronizedBlock {
	
	public static void main(String[] args) {
		
		System.out.println("..main thread started..");
		
		SynchronizedBlock obj = new SynchronizedBlock();
		
		SynchronizedBlockThread t1 = new SynchronizedBlockThread(obj);
		SynchronizedBlockThread t2 = new SynchronizedBlockThread(obj);
		
		t1.setName("MyThread 1");
		t2.setName("MyThread 2");
		
		t1.start();
		t2.start();
		
		System.out.println("..main thread ended..");
		
	}

}
