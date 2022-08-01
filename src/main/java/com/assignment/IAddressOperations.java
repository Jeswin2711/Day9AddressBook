package com.assignment;

/*
IAddressOperations interface that contains the function for the Operation to be Performed
 */
public interface IAddressOperations
{
    void addContact();

    void editContact(String firstName);

    void showAll();

    void deleteContact(String firstName);
}
