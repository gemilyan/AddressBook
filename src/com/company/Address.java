package com.company;

public class Address {

    // Building number
    int buildingNumber;

    //Street name
    String streetName;

    //Apartment number
    int aptNumber;

    //City
    String city;

    //State
    String state;

    //Zip
    int zip;

    Address(int buildingNumber, String streetName, int aptNumber, String city, String state, int zip){
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.aptNumber = aptNumber;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(int aptNumber) {
        this.aptNumber = aptNumber;
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

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
