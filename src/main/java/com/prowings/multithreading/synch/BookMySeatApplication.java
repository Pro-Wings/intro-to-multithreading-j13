package com.prowings.multithreading.synch;

public class BookMySeatApplication extends Thread{
	
	BookMySeats bookMySeats;
	int seats;

	public BookMySeatApplication(BookMySeats bookMySeats, int seats) {
		super();
		this.bookMySeats = bookMySeats;
		this.seats = seats;
	}
	
	public void run() {
		
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " initiated Seat Booking!!");

		bookMySeats.bookSeats(threadName, seats);
		
		System.out.println(threadName + " finished Seat Booking!!");
		
	}

}
