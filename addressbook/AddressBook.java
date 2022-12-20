package com.blz.addressbook;

import java.util.*;

public class AddressBook {
     static Contacts contacts = new Contacts();
     static Scanner sc = new Scanner(System.in);
    static ArrayList<Contacts> list = new ArrayList<>();

     public static void addContacts(){
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
         list.add(contacts);
         System.out.println(contacts);

     }
    public static void showContacts() {
        for (Contacts contacts : list) {
            System.out.println("Contacts{" +
                    "firstName='" + contacts.getFirstName() + '\'' +
                    ", lastName='" + contacts.getLastName() + '\'' +
                    ", city='" + contacts.getCity() + '\'' +
                    ", state='" + contacts.getState() + '\'' +
                    ", zipCode='" + contacts.getZip() + '\'' +
                    ", phNumber='" + contacts.getPhoneNumber()+ '\'' +
                    ", eMail='" + contacts.getEmail() + '\'' +
                    '}');
        }

    }
    public void editContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstName = scanner.next();

        boolean isFound = false;
        if (firstName.equalsIgnoreCase(contacts.getFirstName())) {
            System.out.println("Enter the New First Name");
            contacts.setFirstName(scanner.next());
            System.out.println("Enter the Last Name :");
            contacts.setLastName(scanner.next());
            System.out.println("Enter the City :");
            contacts.setCity(scanner.next());
            System.out.println("Enter the State :");
            contacts.setState(scanner.next());
            System.out.println("Enter the Zip Code :");
            contacts.setZip(scanner.next());
            System.out.println("Enter the Phone Number :");
            contacts.setPhoneNumber(scanner.next());
            System.out.println("Enter the EMail ID :");
            contacts.setEmail(scanner.next());
        }else if (!isFound) {
            System.out.println("Contact is Not found ");
        }
        System.out.println(contacts);
    }
    public void deleteContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstName = scanner.next();

        boolean isFound = false;
        if (firstName.equalsIgnoreCase(contacts.getFirstName())) {
            isFound = true;
            System.out.println("Contact Deleted ");
            contacts = null;
        }
        if (!isFound) {
            System.out.println("Contact  Not found ");
        }
    }


}
