package com.blz.addressbook;

import java.util.*;

public class AddressbookMain {
    public static void main(String[] args) {
        final int ADD = 1;
        final int Show_contact = 2;
        int choice;
            while(true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Kindly Enter choice \n 1. Add new Contact \n 2. Show Contact");
                choice = scanner.nextInt();
                switch (choice){
                    case ADD:
                        AddressBook.addContacts();
                        break;
                    case Show_contact:
                        AddressBook.showContacts();
                        System.exit(2);
                        break;
                }
            }
    }
}
