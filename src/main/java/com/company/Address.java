package com.company;

public class Address {

    // Building number
    private String buildingNumber;

    //Street name
    private String streetName;

    //Apartment number
    private String aptNumber;

    //City
    private String cityName;

    //State
    private String stateName;

    //Zip
    private int zipCode;

    public Address(String buildingNumber, String streetName, String aptNumber, String cityName, String stateName, int zipCode){
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.aptNumber = aptNumber;
        this.cityName = cityName;
        this.stateName = stateName;
        this.zipCode = zipCode;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

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

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}

