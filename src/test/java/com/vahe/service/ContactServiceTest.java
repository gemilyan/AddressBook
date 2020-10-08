package com.vahe.service;

import com.vahe.entity.Address;
import com.vahe.util.Storage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Date;

class ContactServiceTest {

    private static ContactService contactService;
    private static String firstName;
    private static String lastName;
    private static String company;
    private static long phoneNumber;
    private static String email;
    private static Address address;

    @BeforeAll
    static void setUp() {

        contactService = new ContactService();

        firstName = "TestName1";
        lastName = "TestLastName1";
        company = "TestCompany1";
        phoneNumber = 1234567890;

        String buildingNumber = "TestBuildingNumber1";
        String streetName = "TestStreet1";
        String aptNumber = "TestAptNumber1";
        String cityName = "TestCity1";
        String stateName = "TestState1";
        int zipCode = 11111;
        address = new Address(buildingNumber, streetName, aptNumber, cityName, stateName, zipCode);


    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createContact_ShouldBeCreated() {
        Assertions.assertTrue(Storage.getContacts().isEmpty());

        contactService.createContact(firstName, lastName, company, phoneNumber, email, new Date(),address);
        Assertions.assertFalse(Storage.getContacts().isEmpty());
    }

    @Test
    void saveContact() {
    }

    @Test
    void getContactByFirstName() {
    }

    @Test
    void getContactByLastName() {
    }

    @Test
    void getContactByCityName() {
    }

    @Test
    void getAllContacts() {
    }

    @Test
    void sortContacts() {
    }

    @Test
    void deleteContact() {
    }
}