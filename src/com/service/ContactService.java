package com.service;

import com.company.Address;
import com.company.Contact;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import static com.util.Util.inputText;

public class ContactService {
    private StorageService storageService = new StorageService();

    public void createContact(String firstName, String lastName, String company, long phoneNumber,
                              String email, Date date, Address address) {
        Contact contact = new Contact(firstName, lastName, company, phoneNumber,
                email, date, address);
        saveContact(contact);
    }

    public void saveContact(Contact contact) {
        storageService.saveContact(contact);
    }

    public Contact getContactByFirstName(String firstName) {
        return storageService.getByFirstName(firstName);
    }

    public Contact getContactByLastName(String lastName) {
        return storageService.getByLastName(lastName);
    }

    public Contact getContactByCityName(String cityName) {
        return storageService.getByCityName(cityName);
    }

    public Contact[] getAllContacts() {
        return storageService.getAllContacts();
    }

    public void updateContact(Contact contact) {
        storageService.updateContact(contact);
    }

    public void deleteContact(Contact contact) {
        storageService.deleteContact(contact);
    }

    public void inputContact() throws IOException {
        Contact contact = new Contact("John", "Smith","Microhard",
                6666666666L, "john.smith@gmail.com",
                new Date(), new Address("7100b", "Shoreline ave",
                "120-1", "San Diego", "CA", 92100));
        System.out.println("Введите имя             ");
        contact.firstName = inputText();

        System.out.println("Введите фамилию         ");
        contact.lastName = inputText();

        System.out.println("Введите номер телефона  ");
        contact.phoneNumber = Long.parseLong(inputText());

        System.out.println("Адрес-------------------");
        System.out.println("Введите номер дома      ");
        String buildingNumber = inputText();

        System.out.println("Введите улицу           ");
        String streetName = inputText();

        System.out.println("Введите номер квартиры  ");
        String aptNumber = inputText();

        System.out.println("Введите город           ");
        String cityName = inputText();

        System.out.println("Введите штат            ");
        String stateName = inputText();

        System.out.println("Введите зип-код         ");
        int zipCode = Integer.parseInt(inputText());

        saveContact(contact);
    }

    public void printContact(Contact contact) {
        System.out.println("=========================================================================================");
        System.out.println("Имя                     " + contact.firstName);
        System.out.println("Фамилия                 " + contact.lastName);
        System.out.println("Номер телефона          " + contact.phoneNumber);
        System.out.println("Адрес ===================================================================================");
        System.out.println("Номер дома              " + contact.getAddress().getBuildingNumber());
        System.out.println("Улица                   " + contact.getAddress().getStreetName());
        System.out.println("Номер квартиры          " + contact.getAddress().getAptNumber());
        System.out.println("Город                   " + contact.getAddress().getCityName());
        System.out.println("Штат                    " + contact.getAddress().getStateName());
        System.out.println("Зип-код                 " + contact.getAddress().getZipCode());
        System.out.println("=========================================================================================");
    }

    public void printContacts(Contact[] contacts) {
        for (Contact contact : contacts) {
            if (contact != null) {
                printContact(contact);
            }
        }
    }
}
