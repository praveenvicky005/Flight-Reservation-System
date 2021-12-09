package com.company;



public class Passenger {

    private String name;
    private String phoneNumber;
    private String email;
    private static int idCounter = 0;
    Contact contact;
    Address address;

    public Passenger() {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.idCounter = idCounter+1;
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

    public static int getPassengerCount() {
        return idCounter;
    }

   //
    //    public boolean isOldCustomer() {
    //        return isOldCustomer;
    //    }
    //
    //    public void setOldCustomer(boolean oldCustomer) {
    //        isOldCustomer = oldCustomer;
    //    }


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
    }

   private   static class Address {
        private String street;
        private String city;
        private String state;


        Address() {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        String getAddress() {
            return street + "," + city + "," + state;
        }
    }
}



