package com.blz.addressbook;

import java.util.*;

public class AddressBook {
     Contacts contacts = new Contacts();
     Scanner sc = new Scanner(System.in);

     public void addContacts(){
         System.out.println("enter the First name");
         contacts.setFirstName(sc.nextLine());
         System.out.println("enter the last name");
         contacts.setLastName(sc.nextLine());
         System.out.println("enter the address");
         contacts.setAddress(sc.nextLine());
         System.out.println("enter the city");
         contacts.setCity(sc.nextLine());
         System.out.println("enter the state");
         contacts.setState(sc.nextLine());
         System.out.println("enter the zip");
         contacts.setZip((sc.nextLine()));
         System.out.println("enter the phoneNumber");
         contacts.setPhoneNumber((sc.nextLine()));
         System.out.println("enter the Email");
         contacts.setEmail(sc.nextLine());
         System.out.println(contacts);

     }
}
