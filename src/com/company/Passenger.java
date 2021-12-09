package com.company;

public class Passenger {
    private static int idCounter = 0;
    Contact contact;
    Address address;

    public Passenger(String name,String street,String city,String state,String pinCode,String phoneNumber,String email){
        this.address = new Address(name,street,city,pinCode);
        this.contact = new Contact(name,phoneNumber,email);
        this.idCounter = idCounter++;
    }

    public static int getPassengerCount() {
        return idCounter;
    }

    private static class Contact {
        private String name;
        private String phoneNumber;
        private String email;

        Contact(String name, String phoneNumber, String email) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;

        }

        String getContactDetails() {
            return "name: " + name + ", phonenumber: " + phoneNumber + ", email: " + email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "name='" + name + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }

   private   static class Address {
        private String street;
        private String city;
        private String state;
        private String  pinCode;


        Address(String street,String city,String state,String pinCode) {
            this.street = street;
            this.city = city;
            this.state = state;
            this.pinCode = pinCode;
        }

        String getAddress() {
            return street + "," + city + "," + state;
        }

       @Override
       public String toString() {
           return "Address{" +
                   "street='" + street + '\'' +
                   ", city='" + city + '\'' +
                   ", state='" + state + '\'' +
                   ", pinCode='" + pinCode + '\'' +
                   '}';
       }
   }
}



