package com.prowings.multithreading.thread.methods;

public class JoinDemoThread implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + " was interrupted!!");
				e.printStackTrace();
			}
        }
		
	}

}
