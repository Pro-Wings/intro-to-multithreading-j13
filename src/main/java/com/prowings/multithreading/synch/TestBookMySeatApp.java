package com.prowings.multithreading.synch;

public class TestBookMySeatApp {
	
	public static void main(String[] args) {
		
		System.out.println("main thread started!!");
		BookMySeats bookMySeats = new BookMySeats();
		
		BookMySeatApplication thread1 = new BookMySeatApplication(bookMySeats, 5);
		thread1.setName("Ram");
		
		BookMySeatApplication thread2 = new BookMySeatApplication(bookMySeats, 7);
		thread2.setName("Sham");
		
		
		thread1.start();
		thread2.start();
		
		System.out.println("main thread ended!!");
		
	}

}
