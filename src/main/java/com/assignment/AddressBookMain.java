package com.assignment;

import java.util.Scanner;

public class AddressBookMain
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book Program");
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
        int phoneNumber = scanner.nextInt();
        System.out.println("Enter email");
        String email = scanner.next();
        AddressBook addressBook = new AddressBook(firstName,lastName,address,city,state,zip,phoneNumber,email);
        System.out.println(addressBook);
    }
}
