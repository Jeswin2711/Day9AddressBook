package com.assignment;

import java.util.Scanner;

public class AddressBookMain extends ContactPerson
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book Program");
        Address contactPerson = new ContactPerson();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to Add Contact");
            System.out.println("Enter 2 to Edit Contact ");
            System.out.println("Enter 3 to View Contacts");
            System.out.println("Enter 4 to Delete Contact ");
            System.out.println("Enter 5 to exit ");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    contactPerson.addContact();
                    break;
                case 2:
                    System.out.println("\n Enter the Name of the Contact ");
                    String name = scanner.next();
                    contactPerson.editContact(name);
                    break;
                case 3:
                    contactPerson.showAll();
                    break;
                case 4:
                    name = scanner.next();
                    contactPerson.deleteContact(name);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
