package com.vahe;

import com.vahe.entity.Contact;
import com.vahe.service.ContactService;
import com.vahe.util.Util;

import java.io.IOException;

import static com.vahe.util.Util.inputText;

public class AddressBook {

    private static ContactService contactService = new ContactService();
    private static Util util = new Util();

    public static void main(String[] args) throws IOException {

        util.initApp();

        System.out.println("=========================================================================================");
        System.out.println("                        Добро пожаловать в адресную книгу                                ");
        System.out.println("=========================================================================================");

        String command = "start";

        while (command.equals("start") || command.equals("continue")) {

            System.out.println("Подсказка по командам ================================================================");
            System.out.println("enter contact           - ввод нового контакта =======================================");
            System.out.println("delete contact          - удаление контакта ==========================================");
            System.out.println("search by name          - поиск по имени контакта ====================================");
            System.out.println("search by last name     - поиск по фамилии контакта ==================================");
            System.out.println("search by city name     - поиск по городу ============================================");
            System.out.println("sort by id              - сортирожка по Id ============================================");
            System.out.println("print all contacts      - вывод в консоль всех контактов==============================");
            System.out.println("======================================================================================");
            System.out.println("Введите команду");

            command = inputText();

            switch (command) {
                case "enter contact": {
                    contactService.inputContact();
                }
                break;
                case "delete contact": {
                    System.out.println("Введите фамилию");
                    String lastName = inputText();
                    Contact contactToDelete = contactService.getContactByLastName(lastName);
                    if(contactToDelete != null) {
                        contactService.deleteContact(contactToDelete);
                    }
                    else {
                        System.out.println("Contact not found");
                    }
                }
                break;
                case "search by name": {
                    System.out.println("Введите имя");
                    String firstName = inputText();
                    Contact contact = contactService.getContactByFirstName(firstName);

                    if(contact != null) {
                        contactService.printContact(contact);
                    }
                    else {
                        System.out.println("Contact not found");
                    }
                }
                break;
                case "search by last name": {
                    System.out.println("Введите фамилию");
                    String lastName = inputText();
                    Contact contact = contactService.getContactByLastName(lastName);

                    if(contact != null) {
                        contactService.printContact(contact);
                    }
                    else {
                        System.out.println("Contact not found");
                    }
                }
                break;
                case "search by city name": {
                    System.out.println("Введите город");
                    String cityName = inputText();
                    Contact contact = contactService.getContactByCityName(cityName);

                    if(contact != null) {
                        contactService.printContact(contact);
                    }

                    else {
                        System.out.println("Contact not found");
                    }
                }
                break;
                case "sort by id": {
                    contactService.sortContacts();
                    System.out.println("Контакты отсортированы");
                }
                break;
                case "print all contacts": {
                    System.out.println("Все контакты:");
                    contactService.printContacts(contactService.getAllContacts());
                }
                break;
                default: {
                    System.out.println("Вы ошиблись!!!");
                }
            }

            System.out.println('\n' + "Для продолжения введите continue");
            command = inputText();
        }
    }
}