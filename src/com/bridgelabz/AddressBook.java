package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> AddressBook1= new ArrayList<>();
    static Scanner scanner=new Scanner(System.in);

    Contact createContact(){
        Contact contact=new Contact();
        System.out.print("Enter First Name :");
        contact.setFirstName(scanner.next());
        System.out.print("Enter Last Name :");
        contact.setLastName(scanner.next());
        System.out.print("Enter Address :");
        contact.setAddress(scanner.next());
        System.out.print("Enter City :");
        contact.setCity(scanner.next());
        System.out.print("Enter State :");
        contact.setState(scanner.next());
        System.out.print("Enter ZipCode :");
        contact.setZipCode(scanner.nextInt());
        System.out.print("Enter Phone Number :");
        contact.setPhoneNumber(scanner.nextLong());
        System.out.print("Enter email :");
        contact.setEmail(scanner.next());
        return contact;
    }
    void addContact(){
        Contact contact=createContact();
        AddressBook1.add(contact);

        System.out.println(contact);
        System.out.println("Contact Added Successfully...");
    }
    
    void editContact(){
        boolean isContactFound=false;
        System.out.println(AddressBook1);
        System.out.println("Enter Name to edit Contact");
        String name=scanner.next();
        for (Contact contact : AddressBook1) {
            if (name.equalsIgnoreCase(contact.getFirstName())) {
                isContactFound=true;
                System.out.print("Enter First Name :");
                contact.setFirstName(scanner.next());
                System.out.print("Enter Last Name :");
                contact.setLastName(scanner.next());
                System.out.print("Enter Address :");
                contact.setAddress(scanner.next());
                System.out.print("Enter City :");
                contact.setCity(scanner.next());
                System.out.print("Enter State :");
                contact.setState(scanner.next());
                System.out.print("Enter ZipCode :");
                contact.setZipCode(scanner.nextInt());
                System.out.print("Enter Phone Number :");
                contact.setPhoneNumber(scanner.nextLong());
                System.out.print("Enter email :");
                contact.setEmail(scanner.next());
                System.out.println(contact);
                break;
            }
        }
        if (isContactFound){
            System.out.println("Contact Updated Successfully..");
        }else{
            System.out.println("Oops...Contact not found");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address-book");
        AddressBook addressBook=new AddressBook();

        boolean doExit=false;
        while (!doExit){
            System.out.println("******************\nSelect Option :");
            System.out.println("1.Add Contact\n2.Edit Contact\n3.Exit");
            int option=scanner.nextInt();
            switch (option){
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    doExit=true;
                    break;
                default:
                    System.out.println("Select valid option");
            }
        }

    }
}
