package com.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactPerson implements Address
{
    ArrayList<AddressBook> contact = new ArrayList<>();
    public void addContact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firstName");
        String firstName = scanner.next();
        System.out.println("Enter lastName");
        String lastName = scanner.next();
        System.out.println("Enter address");
        String address = scanner.next();
        System.out.println("Enter city");
        String city = scanner.next();
        System.out.println("Enter State");
        String state = scanner.next();
        System.out.println("Enter zip");
        int zip = scanner.nextInt();
        System.out.println("Enter phoneNumber");
        long phoneNumber = scanner.nextLong();
        System.out.println("Enter email");
        String email = scanner.next();
        AddressBook addressBook = new AddressBook(firstName,lastName,address,city,state,zip,phoneNumber,email);
        contact.add(addressBook);
        System.out.println("Contact Added : " + contact);
    }
}
