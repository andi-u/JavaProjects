package com.andi;

import java.util.Scanner;

public class Main {
    private static MobilePhone contacts = new MobilePhone();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contacts.printContacts();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print contacts.");
        System.out.println("\t 2 - To add a contact.");
        System.out.println("\t 3 - To update a contact.");
        System.out.println("\t 4 - To remove a contact.");
        System.out.println("\t 5 - To search a contact.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void addItem() {
        System.out.print("Please enter the new contact name: ");
        String name = scanner.nextLine();
        System.out.println();
        System.out.print("Please enter the phone number of the contact: ");
        String phoneNumber = scanner.nextLine();

        contacts.store(name, phoneNumber);
    }

    private static void modifyItem() {
        System.out.print("current contact name: ");
        String crtName = scanner.nextLine();
        System.out.print("Enter the new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter the new phone number: ");
        String newPhoneNumber = scanner.nextLine();
        contacts.modifyContact(crtName, newName, newPhoneNumber);
    }

    private static void removeItem() {
        System.out.print("Enter contact name: ");
        String contactName = scanner.nextLine();
        contacts.removeContact(contactName);

    }

    private static void searchForItem() {
        System.out.print("Contact name to search for: ");
        String searchName = scanner.nextLine();
        if (contacts.onFile(searchName)) {
            System.out.println("Found contact " + searchName + " in  contacts list");
            contacts.onFileDisplayPhone(searchName);
        } else {
            System.out.println("Contact " + searchName + " is not in the shopping list");
        }
    }

}


// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.
