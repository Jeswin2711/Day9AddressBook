package com.assignment;

import java.util.Scanner;

/*
Main Function to Call the Respective Function for the Address Book Operations
 */
public class BookMain
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IBookOperations bookOperations = new BookOperations();
        /*
        Manual Driven code to Prompt the User to Create a Address Book
        or View Book items
         */
        while (true)
        {
            System.out.println("Enter 1 to Add Address Book");
            System.out.println("Enter 2 to View Book");
            System.out.println("Enter 3 to Search in Address Book");
            System.out.println("Enter 4 to View a Person");
            System.out.println("Enter 5 to Show Count");
            System.out.println("Enter 6 to Sort the Book");
            int input = scanner.nextInt();
            switch (input)
            {
                case 1:
                    bookOperations.createAddressBook();
                    break;
                case 2:
                    bookOperations.showAddressBook();
                    break;
                case 3:
                    bookOperations.search();
                    break;
                case 4:
                    bookOperations.viewPerson();
                case 5:
                    bookOperations.showCount();
                case 6:
                    bookOperations.sortContacts();
                default:
                    System.exit(0);
            }
        }
    }
}
