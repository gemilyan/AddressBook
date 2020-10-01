package com.vahe.service;

import com.vahe.entity.Contact;
import com.vahe.util.Storage;

import java.util.ArrayList;

public class StorageService {

    public void saveContact(Contact contact) {
        Storage.contacts.add(contact);
    }

    public ArrayList<Contact> getAllContacts() {
        return Storage.contacts;
    }

    public Contact getByFirstName(String firstName) {
        for (Contact contact : Storage.getContacts()) {
            if (contact.getFirstName().equals(firstName)) {
                return contact;
            }
        }
        return null;
    }

    public Contact getByLastName(String lastName) {
        for (Contact contact : Storage.getContacts()) {
            if (contact.getLastName().equals(lastName)) {
                return contact;
            }
        }
        return null;
    }

    public Contact getByCityName(String cityName) {
        for (Contact contact : Storage.getContacts()) {
            if (contact.getAddress().getCityName().equals(cityName)) {
                return contact;
            }
        }
        return null;
    }

    public void updateContact(Contact contact, int id) {
        Storage.contacts.set(id, contact);
    }

    public void deleteContact(Contact contact) {
        int index = getContactIndexByFirstName(contact.getFirstName());
        Storage.contacts.remove(contact);
    }

    private int getContactIndexByFirstName(String firstName) {
        int index = -1;

        for (int i = 0; i < Storage.contacts.size(); i++) {
            if (Storage.contacts.get(i).getFirstName().equals(firstName)) {
                index = i;
                break;
            }
        }
        return index;
    }

    private int getContactIndexByLastName(String lastName) {
        int index = -1;

        for (int i = 0; i < Storage.contacts.size(); i++) {
            if (Storage.contacts.get(i).getLastName().equals(lastName)) {
                index = i;
                break;
            }
        }
        return index;
    }

    private int getContactIndexByCityName(String cityName) {
        int index = -1;

        for (int i = 0; i < Storage.contacts.size(); i++) {
            if (Storage.contacts.get(i).getAddress().getCityName().equals(cityName)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void sortContacts(int len_arr){
        ArrayList<Contact> contacts = Storage.contacts;
        if (len_arr == 1)
            return;
        for (int i=0; i<len_arr-1; i++)
            if (contacts.get(i).getId() > contacts.get(i+1).getId()){
                Contact temp = contacts.get(i);
                updateContact(contacts.get(i+1), i);
                updateContact(temp, i+1);
            }
        sortContacts(len_arr-1);
    }
}
