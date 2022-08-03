package com.assignment;

import java.util.*;
import java.util.stream.Collectors;

/*
Class Book Operations to Perform Book Operation {for Ex : Adding a Address Book , Deleting a Address Book}
 */
class BookOperations implements IBookOperations
{
    Map<String, List<User>> book = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    /*
    Method to create a Address Book
     */
    @Override
    public void createAddressBook()
    {
        System.out.println("Enter a Book name");
        String bookName = scanner.next();
        AddressBookOperations contactPerson = new AddressBookOperations();
        book.put(bookName,contactPerson.BookOperations());
    }

    /*
    Method to Show a Address Book
     */
    @Override
    public void showAddressBook()
    {
        for (Map.Entry<String,List<User>> entry : book.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

    }

    /*
    Method to Search inside the Address Book
     */
    @Override
    public void search()
    {
        System.out.println("Enter book Name");
        String bookName = scanner.next();
        System.out.println("Enter City");
        String city = scanner.next();
        List<User> contacts = book.get(bookName);
        List<String> names = new ArrayList<>();
        /*
        Using Java Streams to Pick the User Objects which has the city that user Entered
         */
        List<User> nameOfContact = contacts.stream().filter(a -> a.getCity().equals(city)).collect(Collectors.toList());
        /*
        Advanced Forloop to loop through AddressBook

         */
        for(User contact : nameOfContact)
        {
            if(contact.getCity().equals(city))
            {
                names.add(contact.getFirstName());
            }
        }
        System.out.println("Names are - " + names);
    }

    /*
    View Person Function to View the Person on city and state
     */
    @Override
    public void viewPerson()
    {
        boolean exit = false;
        while (true) {
            System.out.println("Enter 1 for Search Person By City");
            System.out.println("Enter 2 for Search Person By State");
            int input = scanner.nextInt();
            /*
            Manual Driven code
             */
            switch (input) {
                case 1:
                    System.out.println("Enter book Name");
                    String bookName = scanner.next();
                    System.out.println("Enter City");
                    String city = scanner.next();
                    List<User> contacts = book.get(bookName);
                    /*
                    Using Java Streams to filter out the objects that are having city same as the user input
                     */
                    List<User> nameOfContact = contacts.stream().filter(a -> a.getCity().equals(city)).collect(Collectors.toList());
                    System.out.println("Person Details In the City " + city + " -> " + nameOfContact);
                    break;
                case 2:
                    System.out.println("Enter book Name");
                    bookName = scanner.next();
                    System.out.println("Enter State");
                    String state = scanner.next();
                    contacts = book.get(bookName);
                    /*
                    Using Java Streams to filter out the objects that are having State same as the user input
                     */
                    nameOfContact = contacts.stream().filter(a -> a.getState().equals(state)).collect(Collectors.toList());
                    System.out.println("Person Details In the State " + state + " -> " + nameOfContact);
                    break;
                default:
                    exit = true;
                    break;
            }
            /*
            Exit from the loop
             */
            if(exit == true)
            {
                break;
            }
        }
    }

    /*
    Function showCount to get number of contact persons i.e. count by City or State
     */
    @Override
    public void showCount()
    {
        boolean exit = false;
        while (true) {
            System.out.println("Enter 1 for Search Person By City");
            System.out.println("Enter 2 for Search Person By State");
            int input = scanner.nextInt();
            int count = 0;
            /*
            Manual Driven code
             */
            switch (input) {
                case 1:
                    System.out.println("Enter book Name");
                    String bookName = scanner.next();
                    System.out.println("Enter City");
                    String city = scanner.next();
                    List<User> contacts = book.get(bookName);
                    /*
                    Using Java Streams to filter out the objects that are having city same as the user input
                     */
                    List<User> nameOfContact = contacts.stream().filter(a -> a.getCity().equals(city)).collect(Collectors.toList());
                    /*
                    Advance For loop for Counting no of Contact in the city
                     */
                    for(User contact : nameOfContact)
                    {
                        count++;
                    }
                    System.out.println("Count of Person in the City " + city + " = " + count);
                    break;

                case 2:
                    System.out.println("Enter book Name");
                    bookName = scanner.next();
                    System.out.println("Enter State");
                    String state = scanner.next();
                    contacts = book.get(bookName);
                    /*
                    Using Java Streams to filter out the objects that are having State same as the user input
                     */
                    nameOfContact = contacts.stream().filter(a -> a.getState().equals(state)).collect(Collectors.toList());
                    /*
                    Advance For loop used for Counting no of Contact in the State
                     */
                    for(User contact : nameOfContact)
                    {
                        count++;
                    }
                    System.out.println("Count of Person in the City " + state + " = " + count);
                    break;

                default:
                    exit = true;
                    break;
            }
            /*
            Exit from the loop
             */
            if(exit == true)
            {
                break;
            }
        }
    }
}
