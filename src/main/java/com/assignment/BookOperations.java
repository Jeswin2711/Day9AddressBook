package com.assignment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
Class Book Operations to Perform Book Operation {for Ex : Adding a Address Book , Deleting a Address Book}
 */
public class BookOperations implements IBookOperations
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
}
