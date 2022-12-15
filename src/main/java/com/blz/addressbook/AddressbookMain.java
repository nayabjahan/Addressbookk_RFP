package com.blz.addressbook;

public class AddressbookMain {
    public static void main(String[] args) {
        System.out.println("welcome to addressbook program");
        Contacts contacts = new Contacts();
        AddressBook addressbook = new AddressBook();
        addressbook.addContacts();
    }
}
