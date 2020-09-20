package com.util;

import com.company.Address;
import com.service.ContactService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Util {

    private final ContactService contactService = new ContactService();

    public void initApp() {
        contactService.createContact("John1", "Smith1", "Microhard1",
                6666666666L, "john1.smith@gmail.com", new Date(), new Address("7100b", "Shoreline ave",
                        "120-1", "San Diego", "CA", 92100));
        contactService.createContact("John2", "Smith2", "Microhard2",
                6666666666L, "john2.smith@gmail.com", new Date(), new Address("7100b", "Shoreline ave",
                        "120-2", "San Diego", "CA", 92100));
        contactService.createContact("John3", "Smith3", "Microhard3",
                6666666666L, "john3.smith@gmail.com", new Date(), new Address("7100b", "Shoreline ave",
                        "120-3", "San Diego", "CA", 92100));
    }

    public static String inputText() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        return text;
    }
}
