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
            System.out.println("Enter 1 to add Contact");
            System.out.println("Enter 2 to exit ");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    contactPerson.addContact();
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        }
    }
}
