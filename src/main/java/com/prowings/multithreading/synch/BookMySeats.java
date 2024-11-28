package com.prowings.multithreading.synch;

public class BookMySeats {

	private static int totalAvailableSeats = 10;
	
    public static synchronized void bookSeats(String userName, int requestedSeats) {
    	System.out.println("inside bookSeat() method!!");
    	 if (totalAvailableSeats >= requestedSeats) {
             System.out.println(userName + " is trying to book " + requestedSeats + " seats...");
             
             try {
                 // Simulating processing time
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             
             totalAvailableSeats = totalAvailableSeats - requestedSeats;
             System.out.println(userName + " successfully booked " + requestedSeats + " seats. Remaining: " + totalAvailableSeats);
         } else {
             System.out.println(userName + " cannot book " + requestedSeats + " seats. Only " + totalAvailableSeats + " left.");
         }
    	
    }


}
