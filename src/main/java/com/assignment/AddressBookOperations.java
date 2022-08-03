package com.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AddressBookOperations
{
    /*
    Book Operations return List of User that are Created for a Instance
     */
    public List<User> bookOperations()
    {
        IContactOperations contactPerson = new ContactPerson();
        Scanner scanner = new Scanner(System.in);
        List<User> bookDetails = new ArrayList<>();
        boolean exit = false;
        /*
        Manual Driven Code for Permitting User to Do some Operation
         */
        while (true) {
            System.out.println("Enter 1 to Add Contact");
            System.out.println("Enter 2 to Edit Contact ");
            System.out.println("Enter 3 to View Contacts");
            System.out.println("Enter 4 to Delete Contact ");
            System.out.println("Enter 5 to Search");
            System.out.println("Enter 6 to exit ");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    /*
                    Adding Contact
                     */
                    contactPerson.addContact();
                    break;
                case 2:
                    /*
                    Editing a  Contact
                     */
                    System.out.println("\n Enter the Name of the Contact ");
                    String name = scanner.next();
                    contactPerson.editContact(name);
                    break;
                case 3:
                    /*
                    Showing All Contact
                     */
                    contactPerson.showAll();
                    break;
                case 4:
                    /*
                    Deleting a  Contact
                     */
                    name = scanner.next();
                    contactPerson.deleteContact(name);
                    break;
                default:
                    exit = true;
                    /*
                    Exiting from the Program
                     */
                    break;

            }
            /*
            getting the contacts
             */
            bookDetails = contactPerson.contactList();
            if(exit == true)
            {
                break;
            }
        }
        return bookDetails;
    }
}
