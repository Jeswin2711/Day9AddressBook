package com.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactPerson implements Address
{
    ArrayList<AddressBook> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void addContact()
    {

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
        contacts.add(addressBook);
        System.out.println("Contact Added : " + contacts);
    }

    @Override
    public void editContact(String firstName)
    {
        for (AddressBook contact : contacts)
        {
            if(contact.getFirstName().equals(firstName))
            {
                System.out.println("Enter 1 for FirstName");
                System.out.println("Enter 2 for LastName");
                System.out.println("Enter 3 for Address");
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
                        System.out.println("Enter Address");
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
    @Override
    public void showAll()
    {
        if(contacts.isEmpty())
        {
            System.out.println("No Data Found \n ");
        }
        for(AddressBook contact : contacts)
        {
            System.out.println(contact);
        }
    }

    @Override
    public void deleteContact(String firstName)
    {
        for (AddressBook contact : contacts)
        {
            if(contact.getFirstName().equals(firstName))
            {
                contacts.remove(contact);
                System.out.println(" Contact Deleted Successfully");
                break;
            }
        }
    }
}
