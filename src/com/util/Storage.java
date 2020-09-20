package com.util;

import com.company.Contact;

import java.util.ArrayList;

public class Storage {

    public static ArrayList<Contact> contacts = new ArrayList<>();

    public static ArrayList<Contact> getContacts() {
        return contacts;
    }

}
