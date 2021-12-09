package com.company;



public class Passenger {

    private String name;
    private String phoneNumber;
   private String email;
   boolean isOldCustomer;

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

    public boolean isOldCustomer() {
        return isOldCustomer;
    }

    public void setOldCustomer(boolean oldCustomer) {
        isOldCustomer = oldCustomer;
    }
}


