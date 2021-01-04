package com.andi;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts;

    public MobilePhone() {
        this.contacts = new ArrayList<Contact>();
    }

    public void printContacts() {
        System.out.println("Contacts list contains " + this.contacts.size() + " contacts");
        for(int i = 0; i < this.contacts.size(); i++){
            System.out.println(i+1 + ". " + this.contacts.get(i).getName() + " " + this.contacts.get(i).getPhoneNumber());
        }
    }

    public void store(String name, String phoneNumber){
        if(!onFile(name)){
            Contact newContact = new Contact(name, phoneNumber);
            this.contacts.add(newContact);
        } else {
            System.out.println("Contact already exists");
        }

    }

    private void modifyContact(int position, String newName, String newPhoneNumber){
        Contact modifiedContact = this.contacts.get(position);
        modifiedContact.setPhoneNumber(newPhoneNumber);
        modifiedContact.setName(newName);
        this.contacts.set(position, modifiedContact);
    }

    public void modifyContact(String name, String newName, String newPhoneNumber) {
        if(findContact(name) >= 0){
            modifyContact(findContact(name), newName, newPhoneNumber);
        } else{
            System.out.println("Contact " + name + " not found in the list");
        }
    }

    private void removeContact(int position){
        this.contacts.remove(position);
    }

    public void removeContact(String name){
        if(findContact(name) >= 0){
            System.out.println("Contact " + name + " was removed");
            removeContact(findContact(name));
        }
    }

    private int findContact(String name) {
        for(int i=0; i<contacts.size(); i++){
            if( this.contacts.get(i).getName().equals(name) ){
                return this.contacts.indexOf(this.contacts.get(i));
            }
        }
        return -1;

    }

    private void displayNumber(String name) {
        for(int i=0; i < this.contacts.size(); i++){
            if( this.contacts.get(i).getName().equals(name) ){
                System.out.println("Phone number is " + this.contacts.get(i).getPhoneNumber());
            }
        }

    }

    public boolean onFile(String name) {
        if(findContact(name) >= 0) {
            return true;
        }
        return false;
    }

    public void onFileDisplayPhone(String name) {
        if(findContact(name) >= 0) {
            displayNumber(name);
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
