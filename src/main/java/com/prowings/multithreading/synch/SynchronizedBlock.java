package com.prowings.multithreading.synch;

public class SynchronizedBlock {
	
	public static void myMethod()
	{
		System.out.println(Thread.currentThread().getName() + "Hi....");
		System.out.println(Thread.currentThread().getName() + "Hi....");
		System.out.println(Thread.currentThread().getName() + "Hi....");
		System.out.println(Thread.currentThread().getName() + "Hi....");
		System.out.println(Thread.currentThread().getName() + "Hi....");
		
		synchronized (SynchronizedBlock.class) {
			System.out.println(Thread.currentThread().getName() + "...conflicting code...");
			System.out.println(Thread.currentThread().getName() + "...conflicting code...");
			System.out.println(Thread.currentThread().getName() + "...conflicting code...");
		}

		System.out.println(Thread.currentThread().getName() + "Hello....");
		System.out.println(Thread.currentThread().getName() + "Hello....");
		System.out.println(Thread.currentThread().getName() + "Hello....");
		System.out.println(Thread.currentThread().getName() + "Hello....");
		System.out.println(Thread.currentThread().getName() + "Hello....");

	}

}
