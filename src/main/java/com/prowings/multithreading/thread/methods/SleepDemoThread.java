package com.prowings.multithreading.thread.methods;

public class SleepDemoThread implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		
	}

}
