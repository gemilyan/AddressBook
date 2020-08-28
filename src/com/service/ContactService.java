package com.service;

import com.company.Contact;

import java.io.IOException;

import static com.util.Util.inputText;

public class ContactService {
    private StorageService storageService = new StorageService();

    public void createContact(String firstName, String lastName, long phoneNumber) {
        Contact contact = new Contact();
        contact.firstName = firstName;
        contact.lastName = lastName;
        contact.phoneNumber = phoneNumber;

        saveContact(contact);
    }

    public void saveContact(Contact contact) {
        storageService.saveContact(contact);
    }

    public Contact getContactByFirstName(String firstName) {
        Contact contact = storageService.getByFirstName(firstName);

        return contact;
    }

    public Contact[] getAllContacts() {
        return storageService.getAllContact();
    }

    public void updateContact(Contact contact) {

        storageService.updateContact(contact);
    }

    public void deleteContact(Contact contact) {

        storageService.deleteContact(contact);
    }

    public void inputContact() throws IOException {
        Contact contact = new Contact();
        System.out.println("Введите имя             ");
        contact.firstName = inputText();

        System.out.println("Введите фамилию         ");
        contact.lastName = inputText();

        System.out.println("Введите номер телефона  ");
        contact.phoneNumber = Long.parseLong(inputText());

        saveContact(contact);
    }

    public void printContact(Contact contact) {
        System.out.println("=========================================================================================");
        System.out.println("Имя                     " + contact.firstName);
        System.out.println("Фамилия                 " + contact.lastName);
        System.out.println("Номер телефона          " + contact.phoneNumber);
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
