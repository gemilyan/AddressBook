package com;

import com.company.Contact;
import com.service.ContactService;
import com.util.Util;

import java.io.IOException;

import static com.util.Util.inputText;

public class AddressBook {

    private static ContactService contactService = new ContactService();
    private static Util util = new Util();

    /*
     * NOTE : =====================================================================================================
     * Задача   -   написать программу, которая будет решать проблему из реальной жизни.
     * Level 3  -   провести анализ предметной области
     *          -   записать сущности предметной области как классы программы
     *          -   записать поля классов
     * ============================================================================================================
     */

    public static void main(String[] args) throws IOException {

        util.initApp();

        System.out.println("=========================================================================================");
        System.out.println("                        Добро пожаловать в адресную книгу                                ");
        System.out.println("=========================================================================================");

        String command = "start";

        while (command.equals("start") || command.equals("continue")) {

            System.out.println("Подсказка по командам ==================================================================");
            System.out.println("enter contact           - ввод нового контакта ==========================================");
            System.out.println("print contacts          - вывод в консоль всех контактов ================================");
            System.out.println("search by name          - поиск по имени контакта =======================================");
            System.out.println("=========================================================================================");
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
                    contactService.deleteContact(contactToDelete);
                }
                break;
                case "print contacts": {
                    contactService.printContacts(contactService.getAllContacts());
                }
                break;
                case "search by name": {
                    System.out.println("Введите имя");
                    String firstName = inputText();
                    Contact contact = contactService.getContactByFirstName(firstName);

                    contactService.printContact(contact);
                }
                break;
                case "search by lastName": {
                    System.out.println("Введите фамилию");
                    String lastName = inputText();
                    Contact contact = contactService.getContactByLastName(lastName);

                    contactService.printContact(contact);
                }
                break;
                case "search by city name": {
                    System.out.println("Введите город");
                    String cityName = inputText();
                    Contact contact = contactService.getContactByCityName(cityName);

                    contactService.printContact(contact);
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