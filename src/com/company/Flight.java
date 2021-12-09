package com.company;

 public class Flight {
    String flightNumber;
    String airLineName;
    int totalSeat;
    int bookedSeat;

    String getFlightDetails(){
      return "flightnumber: "+flightNumber+", airLineName: "+airLineName+", totalseat: "+totalSeat;
    }
    String availableSeat(){
        return "available seat: "+ (totalSeat-bookedSeat);
    }

     public String getFlightNumber() {
         return flightNumber;
     }

     public void setFlightNumber(String flightNumber) {
         this.flightNumber = flightNumber;
     }

     public String getAirLineName() {
         return airLineName;
     }

     public void setAirLineName(String airLineName) {
         this.airLineName = airLineName;
     }

     public int getTotalSeat() {
         return totalSeat;
     }

     public void setTotalSeat(int totalSeat) {
         this.totalSeat = totalSeat;
     }

     public int getBookedSeat() {
         return bookedSeat;
     }

     public void setBookedSeat(int bookedSeat) {
         this.bookedSeat = bookedSeat;
     }
 }
