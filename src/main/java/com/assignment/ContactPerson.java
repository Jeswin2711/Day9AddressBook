package com.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Class Contact Person that implements IAddressOperations Interface to Perform Operations to the List
 */
public class ContactPerson implements IContactOperations
{
    /*
    Contacts List to Store the List of Contacts
     */
    List<User> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    User addressBook;
    /*
    Adding a Person to the List
     */
    @Override
    public List<User> addContact()
    {
        System.out.println("Enter firstName");
        String firstName = scanner.next();
        /*
        Checking the List is not Empty if not checks the name entered already in the List
         */
        if(!contacts.isEmpty())
        {
            for(User contact : contacts)
            {
                if ( contact.getFirstName().equals(firstName))
                {
                    System.out.println("User Already Present");
                    break;
                }
                else
                {
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
                    User addressBook = new User(firstName,lastName,address,city,state,zip,phoneNumber,email);
                    contacts.add(addressBook);
                    System.out.println("Contact Added : " + contacts);
                    break;
                }
            }
        }
        else
        {
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
            User addressBook = new User(firstName,lastName,address,city,state,zip,phoneNumber,email);
            contacts.add(addressBook);
            System.out.println("Contact Added : " + contacts);
        }
        return contacts;
    }

    /*
    Editing a Person on the List
     */
    @Override
    public void editContact(String firstName)
    {
        for (User contact : contacts)
        {
            if(contact.getFirstName().equals(firstName))
            {
                System.out.println("Enter 1 for FirstName");
                System.out.println("Enter 2 for LastName");
                System.out.println("Enter 3 for IAddressOperations");
                System.out.println("Enter 4 for City");
                System.out.println("Enter 5 for State");
                System.out.println("Enter 6 for Zip");
                System.out.println("Enter 7 for Phone Number");
                System.out.println("Enter 8 for Email");
                int input = scanner.nextInt();
                switch (input)
                {
                    case 1:
                        System.out.println("Enter First Name");
                        contact.setFirstName(scanner.next());
                        break;
                    case 2:
                        System.out.println("Enter Last Name");
                        contact.setLastName(scanner.next());
                        break;
                    case 3:
                        System.out.println("Enter IAddressOperations");
                        contact.setAddress(scanner.next());
                        break;
                    case 4:
                        System.out.println("Enter City");
                        contact.setCity(scanner.next());
                        break;
                    case 5:
                        System.out.println("Enter State");
                        contact.setState(scanner.next());
                        break;
                    case 6:
                        System.out.println("Enter Zip");
                        contact.setZip(scanner.nextInt());
                        break;
                    case 7:
                        System.out.println("Enter Phone Number");
                        contact.setPhoneNumber(scanner.nextLong());
                        break;
                    case 8:
                        System.out.println("Enter Email");
                        contact.setEmail(scanner.next());
                        break;
                }
                System.out.println("Contact Updated " + contact);
            }
        }
    }
    /*
    Showing All the Contacts
     */
    @Override
    public void showAll()
    {
        if(contacts.isEmpty())
        {
            System.out.println("No Data Found \n ");
        }
        for(User contact : contacts)
        {
            System.out.println(contact);
        }
    }

    /*
    Deleting a Person from the List
     */
    @Override
    public void deleteContact(String firstName)
    {
        boolean flag = false;
        for (User contact : contacts)
        {
            if(contact.getFirstName().equals(firstName))
            {
                contacts.remove(contact);
                System.out.println("Contact Deleted Successfully");
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("Contacts Not Found");
        }
    }
    /*
    function contactList to return the Contacts
     */
    @Override
    public List<User> contactList()
    {
        return contacts;
    }
}
