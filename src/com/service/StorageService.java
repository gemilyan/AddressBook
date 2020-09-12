package com.service;

import com.company.Contact;
import com.util.Storage;

import java.util.ArrayList;

public class StorageService {

    public void saveContact(Contact contact) {
        Storage.contacts.add(contact);
    }

    public ArrayList<Contact> getAllContacts() {
        return Storage.contacts;
    }

    public Contact getByFirstName(String firstName) {
        Contact contact = null;
        if(getContactIndexByFirstName(firstName) != -1) {
            contact = Storage.contacts.get(getContactIndexByFirstName(firstName));
        }

        return contact;
    }

    public Contact getByLastName(String lastName) {
        Contact contact = null;
        if(getContactIndexByLastName(lastName) != -1) {
            contact = Storage.contacts.get(getContactIndexByLastName(lastName));
        }
        return contact;
    }

    public Contact getByCityName(String cityName) {
        Contact contact = null;
        if(getContactIndexByCityName(cityName) != -1) {
            contact = Storage.contacts.get(getContactIndexByCityName(cityName));
        }
        return contact;
    }

    public void updateContact(Contact contact) {
        if(getContactIndexByFirstName(contact.firstName) != -1) {
            Storage.contacts.add(getContactIndexByFirstName(contact.firstName), contact);
        }
    }

    public void deleteContact(Contact contact) {
        int index = getContactIndexByFirstName(contact.firstName);
        Storage.contacts.remove(contact);
    }

    private int getContactIndexByFirstName(String firstName) {
        int index = -1;

        for (int i = 0; i < Storage.contacts.size(); i++) {
            if (Storage.contacts.get(i).firstName.equals(firstName)) {
                index = i;
                break;
            }
        }

        return index;
    }

    private int getContactIndexByLastName(String lastName) {
        int index = -1;

        for (int i = 0; i < Storage.contacts.size(); i++) {
            if (Storage.contacts.get(i).lastName.equals(lastName)) {
                index = i;
                break;
            }
        }

        return index;
    }

    private int getContactIndexByCityName(String cityName) {
        int index = -1;

        for (int i = 0; i < Storage.contacts.size(); i++) {
            if (Storage.contacts.get(i).getAddress().cityName.equals(cityName)) {
                index = i;
                break;
            }
        }

        return index;
    }
}
