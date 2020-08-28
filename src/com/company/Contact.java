package com.company;

import java.util.Date;

public class Contact {



    public Contact(String firstName, String lastName, String company, long phoneNumber,
                   String email, Date date, Address address){
        this.firstName=firstName;
        this.lastName=lastName;
        this.company=company;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.date=date;
        this.address=address;
    }
    // First name
    public String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Last name
    public String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Company
    public String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    // Phone number
    public long phoneNumber;

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Email
    public String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // DoB
    public Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Address
    public Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



}
