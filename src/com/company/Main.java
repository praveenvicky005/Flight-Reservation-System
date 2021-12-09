package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Contact contact = new Contact("praveen","9488111772","praveen@gmail.com");
        System.out.println(contact.getContactDetails());
        Address address = new Address("keelandai Street","chennai","tamil nadu");
        System.out.println(address.getAddress());
        Flight flight = new Flight();
        flight.bookedSeat = 10;
        flight.airLineName = "jet airways";
        flight.totalSeat = 100;
        flight.flightNumber = "893";
        System.out.println(flight.getFlightDetails());
        System.out.println(flight.availableSeat());
        Ticket ticket = new Ticket("pt1010","chennai","agatala","vt9878","10/07/1999","10/07/2021",23,25000);
        System.out.println(ticket.getPnrNumber());
    }
}
