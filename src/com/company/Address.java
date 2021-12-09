package com.company;

public class Address {
    String street;
    String city;
    String state;


    Address(String street,String city,String state){
        this.street = street;
        this.city = city;
        this.state = state;
    }
     String getAddress(){
        return street+","+city+","+state;
     }
}
