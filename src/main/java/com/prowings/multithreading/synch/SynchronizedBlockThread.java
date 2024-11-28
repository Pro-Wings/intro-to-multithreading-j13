package com.prowings.multithreading.synch;

public class SynchronizedBlockThread extends Thread{
	
	SynchronizedBlock synchronizedBlock;
	
	public SynchronizedBlockThread(SynchronizedBlock synchronizedBlock) {
		super();
		this.synchronizedBlock = synchronizedBlock;
	}

	public void run()
	{
		synchronizedBlock.myMethod();
	}

}
