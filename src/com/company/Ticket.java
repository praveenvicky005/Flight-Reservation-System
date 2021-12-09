package com.company;

public class Ticket {
    String pnrNumber ;
    String departureLocation;
    String destinationLocation;
    String bookedFLight;
    String dateAndTimeOFArrival;
    String dateAndTimeOfDeparture;
    Contact contact;
    int seatNumber;
    int priceOfTIcket;

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

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getPriceOfTIcket() {
        return priceOfTIcket;
    }

    public void setPriceOfTIcket(int priceOfTIcket) {
        this.priceOfTIcket = priceOfTIcket;
    }

    public Ticket(String pnrNumber, String departureLocation, String destinationLocation, String bookedFLight, String dateAndTimeOFArrival, String dateAndTimeOfDeparture,  int seatNumber, int priceOfTIcket) {
        this.pnrNumber = pnrNumber;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.bookedFLight = bookedFLight;
        this.dateAndTimeOFArrival = dateAndTimeOFArrival;
        this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
        this.seatNumber = seatNumber;
        this.priceOfTIcket = priceOfTIcket;
    }

}
