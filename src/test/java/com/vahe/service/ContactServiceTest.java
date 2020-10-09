package com.vahe.service;

import com.vahe.entity.Address;
import com.vahe.entity.Contact;
import com.vahe.util.Storage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

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

        firstName = "TestFirstName1";
        lastName = "TestLastName1";
        company = "TestCompany1";
        phoneNumber = 1234567890;
        email = "test@test.com";

        String buildingNumber = "TestBuildingNumber1";
        String streetName = "TestStreetName1";
        String aptNumber = "TestAptNumber1";
        String cityName = "TestCityName1";
        String stateName = "TestStateName1";
        int zipCode = 11111;
        address = new Address(buildingNumber, streetName, aptNumber, cityName, stateName, zipCode);
    }

    @Test
    void createContact_ShouldBeCreated() {
        Assertions.assertTrue(Storage.getContacts().isEmpty());
        contactService.createContact(firstName, lastName, company, phoneNumber, email, new Date(),address);
        Assertions.assertFalse(Storage.getContacts().isEmpty());
    }

    @Test
    void getContactByFirstName_ShouldFindContactByFirstName() {
        contactService.createContact(firstName, lastName, company, phoneNumber, email, new Date(),address);
        Contact contact = contactService.getContactByFirstName("TestFirstName1");
        Assertions.assertTrue(contact.getFirstName() == "TestFirstName1");
    }

    @Test
    void getContactByLastName_ShouldFindContactByLastName() {
        contactService.createContact(firstName, lastName, company, phoneNumber, email, new Date(),address);
        Contact contact = contactService.getContactByLastName("TestLastName1");
        Assertions.assertTrue(contact.getLastName() == "TestLastName1");
    }

    @Test
    void getContactByCityName_ShouldFindContactByCityName() {
        contactService.createContact(firstName, lastName, company, phoneNumber, email, new Date(),address);
        Contact contact = contactService.getContactByCityName("TestCityName1");
        Assertions.assertTrue(address.getCityName() == "TestCityName1");
    }

    @Test
    void getAllContacts() {
        contactService.createContact(firstName, lastName, company, phoneNumber, email, new Date(),address);
        contactService.getAllContacts();
        Assertions.assertFalse(Storage.getContacts().isEmpty());
    }

    @Test
    void sortContacts() {
        contactService.createContact(firstName, lastName, company, phoneNumber, email, new Date(),address);
        contactService.createContact(firstName, lastName, company, phoneNumber, email, new Date(),address);
        contactService.sortContacts();
        ArrayList<Contact> contacts = contactService.getAllContacts();
        assertTrue(contacts.get(0).getId() <= contacts.get(1).getId());
        tearDown();
    }

    @Test
    void deleteContact_ContactShouldBeDeleted() {
        contactService.createContact(firstName, lastName, company, phoneNumber, email, new Date(),address);
        Contact contact = contactService.getContactByLastName("TestLastName1");
        contactService.deleteContact(contact);
        assertTrue(contactService.getAllContacts().isEmpty());
    }

    @AfterEach
    void tearDown() {
        ArrayList<Contact> contacts = contactService.getAllContacts();
        for (int i = 0; i < contacts.size(); i++){
            contactService.deleteContact(contacts.get(i));
        }
    }
}