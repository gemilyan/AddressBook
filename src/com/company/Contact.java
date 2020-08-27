package com.company;

import java.util.Date;

public class Contact {

    // First name
    String firstName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Last name
    String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Company
    String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    // Phone number
    long phoneNumber;

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Email
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // DoB
    Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Address
    Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    Contact(String firstName, String lastName, String company, long phoneNumber,
            String email, Date date, Address address){
        this.firstName=firstName;
        this.lastName=lastName;
        this.company=company;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.date=date;
        this.address=address;
    }

}
