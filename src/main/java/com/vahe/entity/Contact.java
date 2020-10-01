package com.vahe.entity;

import java.util.Date;

public class Contact {

    private int id;
    private String firstName;
    private String lastName;
    private String company;
    private long phoneNumber;
    private String email;
    private Date date;
    private Address address;

    public Contact() {

    }

    public Contact(int id, String firstName, String lastName, String company, long phoneNumber,
                   String email, Date date, Address address){
        this.id = id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.company=company;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.date=date;
        this.address=address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
