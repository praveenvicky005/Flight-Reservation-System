package com.company;

public class TouristTicket extends Ticket{
    String[] selectedLocation = new String[5];
    TouristTicket() {
      HotelAddress hotelAddress;
        this.selectedLocation = selectedLocation;
    }

    public String[] getSelectedLocation() {
        return selectedLocation;
    }

    public void setSelectedLocation(String[] selectedLocation) {
        this.selectedLocation = selectedLocation;
    }

    public String  getHotelAddress(HotelAddress hotelAddress) {
        return "Street: "+hotelAddress.getStreet()+", city: "+hotelAddress.getCity()+", State: "+hotelAddress.getState()+", Pincode: "+hotelAddress.pinCode;
    }

       private static class  HotelAddress{
        private String Street ;
        private String city;
        private String state;
        private String pinCode;


          public String getStreet() {
              return Street;
          }

          public void setStreet(String street) {
              Street = street;
          }

          public String getCity() {
              return city;
          }

          public void setCity(String city) {
              this.city = city;
          }

          public String getState() {
              return state;
          }

          public void setState(String state) {
              this.state = state;
          }

          public String getPinCode() {
              return pinCode;
          }

          public void setPinCode(String pinCode) {
              this.pinCode = pinCode;
          }
      }

}






















































