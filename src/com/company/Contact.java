package com.company;

public class Contact {
    String name;
    String phoneNumber;
    String email;

    Contact(String name,String phoneNumber,String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }
    String getContactDetails(){
        return "name: "  +name+", phonenumber: "+phoneNumber+", email: "+email;
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
