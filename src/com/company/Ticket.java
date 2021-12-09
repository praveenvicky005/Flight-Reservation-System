package com.company;

public class Ticket {

    private String pnrNumber ;
    private String departureLocation;
    private String destinationLocation;
    private String bookedFLight;
    private String dateAndTimeOFArrival;
    private String dateAndTimeOfDeparture;
    private int seatNumber;
    private int priceOfTicket;
    Flight flight;

    public Ticket() {
    }

    public String getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getBookedFLight() {
        return bookedFLight;
    }

    public void setBookedFLight(String bookedFLight) {
        this.bookedFLight = bookedFLight;
    }

    public String getDateAndTimeOFArrival() {
        return dateAndTimeOFArrival;
    }

    public void setDateAndTimeOFArrival(String dateAndTimeOFArrival) {
        this.dateAndTimeOFArrival = dateAndTimeOFArrival;
    }

    public String getDateAndTimeOfDeparture() {
        return dateAndTimeOfDeparture;
    }

    public void setDateAndTimeOfDeparture(String dateAndTimeOfDeparture) {
        this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
    }


    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getPriceOfTicket() {
        return priceOfTicket;
    }

    public void setPriceOfTicket(int priceOfTIcket) {
        this.priceOfTicket = priceOfTicket;
    }

    public Ticket(String pnrNumber, String departureLocation, String destinationLocation, String bookedFLight, String dateAndTimeOFArrival, String dateAndTimeOfDeparture,  int seatNumber, int priceOfTicket) {
        this.pnrNumber = pnrNumber;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.bookedFLight = bookedFLight;
        this.dateAndTimeOFArrival = dateAndTimeOFArrival;
        this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
        this.seatNumber = seatNumber;
        this.priceOfTicket = priceOfTicket;


    }

    public Ticket(Flight flight) {
        this.flight = flight;
    }
    String getTicketPrint(){
        return "pnr Number: "+pnrNumber+", departure: "+departureLocation+", arrival: "+destinationLocation+", booked FLight: "+bookedFLight+", depart Time: "+dateAndTimeOfDeparture+", arrivalDate: "+dateAndTimeOFArrival+", seatNumber: "+seatNumber+", amount Paid: "+priceOfTicket;
    }
}
