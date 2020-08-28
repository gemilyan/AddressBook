package com.company;

public class Address {

    // Building number
    public String buildingNumber;

    //Street name
    public String streetName;

    //Apartment number
    public String aptNumber;

    //City
    public String cityName;

    //State
    public String stateName;

    //Zip
    public int zipCode;

    Address(String buildingNumber, String streetName, String aptNumber, String cityName, String stateName, int zipCode){
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.aptNumber = aptNumber;
        this.cityName = cityName;
        this.stateName = stateName;
        this.zipCode = zipCode;
    }

    public String getBuildingNumber() { return buildingNumber; }

    public void setBuildingNumber(String buildingNumber) { this.buildingNumber = buildingNumber; }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(String aptNumber) {
        this.aptNumber = aptNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName() { this.cityName = cityName; }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZip(int zipCode) {
        this.zipCode = zipCode;
    }
}

