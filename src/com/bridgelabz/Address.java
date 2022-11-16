package com.bridgelabz;

public class Address {
    public static void main(String[] args){
        AddressBookEntry details = new AddressBookEntry();
        details.setFirstName("Rahul");
        details.setLastName("Ranjan");
        details.setAddress("Deoghar");
        details.setCity("Deoghar");
        details.setState("Jharkhand");
        details.setZipCode(814112);
        details.setMobileNumber(1213456987);
        details.setEmailAddress("rahul@gmail.com");
        System.out.println(details);
    }
}
