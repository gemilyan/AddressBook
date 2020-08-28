package com.company;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

	        // To Do
            // Save contacts
            // First name
            // Last name
            // Company
            // Phone number
            // Email
            // DoB
            // Address

        Address address = new Address("7100b", "Shoreline ave",
                "120c", "San Diego", "CA", 92100);

        Contact contact = new Contact("John", "Smith","Microhard",
                6666666666L, "john.smith@gmail.com",
                new Date(1970, Calendar.JANUARY,19), address);

        System.out.println("The created contact is for " + contact.firstName + " " + contact.lastName);
    }
}
