package com.assignment;

import java.util.List;
/*
IContactOperations interface that contains the function for the Operation to be Performed
 */
public interface IContactOperations
{
    List<User> addContact();

    void editContact(String firstName);

    void showAll();

    void deleteContact(String firstName);

    List<User> contactList();

}
