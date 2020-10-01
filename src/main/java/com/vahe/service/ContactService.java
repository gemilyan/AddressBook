package com.vahe.service;

import com.vahe.entity.Address;
import com.vahe.entity.Contact;
import com.vahe.util.Storage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import static com.vahe.util.Util.inputText;

public class ContactService {
    private StorageService storageService = new StorageService();

    public void createContact(String firstName, String lastName, String company, long phoneNumber, String email, Date date, Address address) {
        int id = (int) (Math.random() * 10000);
        Contact contact = new Contact(id, firstName, lastName, company, phoneNumber, email, date, address);
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

    public ArrayList<Contact> getAllContacts() {
        return storageService.getAllContacts();
    }

    public void sortContacts() {
        int len_arr = Storage.contacts.size();
        storageService.sortContacts(len_arr);
    }

    public void updateContact(Contact contact, int i) {
        storageService.updateContact(contact, i);
    }

    public void deleteContact(Contact contact) {
        storageService.deleteContact(contact);
    }

    public void inputContact() throws IOException {
        Contact contact = new Contact();

        System.out.println("Введите имя             ");
        contact.setFirstName(inputText());

        System.out.println("Введите фамилию         ");
        contact.setLastName(inputText());

        System.out.println("Введите номер телефона  ");
        contact.setPhoneNumber(Long.parseLong(inputText()));

        System.out.println("Адрес-------------------");
        System.out.println("Введите номер дома      ");
        contact.getAddress().setBuildingNumber(inputText());

        System.out.println("Введите улицу           ");
        contact.getAddress().setStreetName(inputText());

        System.out.println("Введите номер квартиры  ");
        contact.getAddress().setAptNumber(inputText());

        System.out.println("Введите город           ");
        contact.getAddress().setCityName(inputText());

        System.out.println("Введите штат            ");
        contact.getAddress().setStateName(inputText());

        System.out.println("Введите зип-код         ");
        contact.getAddress().setZipCode(Integer.parseInt(inputText()));

        saveContact(contact);
    }

    public void printContact(Contact contact) {
        System.out.println("=========================================================================================");
        System.out.println("Id                      " + contact.getId());
        System.out.println("Имя                     " + contact.getFirstName());
        System.out.println("Фамилия                 " + contact.getLastName());
        System.out.println("Номер телефона          " + contact.getPhoneNumber());
        System.out.println("Адрес ===================================================================================");
        System.out.println("Номер дома              " + contact.getAddress().getBuildingNumber());
        System.out.println("Улица                   " + contact.getAddress().getStreetName());
        System.out.println("Номер квартиры          " + contact.getAddress().getAptNumber());
        System.out.println("Город                   " + contact.getAddress().getCityName());
        System.out.println("Штат                    " + contact.getAddress().getStateName());
        System.out.println("Зип-код                 " + contact.getAddress().getZipCode());
        System.out.println("=========================================================================================");
    }

    public void printContacts(ArrayList<Contact> contacts) {
        for (Contact contact : contacts) {
            if (contact != null) {
                printContact(contact);
            }
        }
    }
}
