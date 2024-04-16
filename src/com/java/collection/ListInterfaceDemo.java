package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceDemo {

    public static void main(String[] args) {

        // List ordered collection

        // Maintains insertion order

        // Displays as in same order as insertions

        // Provides control to insert element at position index

        // Access element by Index

        //Allows adding duplicate elements

        // Allows to have null values

        // index starts at 0

        // Most Widely Used

        // Implementation classes are Linked List , Array List, Vector and Stack

        // Used based on Requirement
        List<String> myList = new ArrayList<>();

        //Allows to add Duplicate elements
        // List maintains insertion order
        myList.add("Element 1");
        myList.add("Element 2");
        myList.add("Element 1");
        System.out.println(myList);

        // Allows to add Null elements
        myList.add(null);
        myList.add(null);
        System.out.println(myList);

        // Access elements of the list
        System.out.println(myList.get(0));
        System.out.println(myList.get(3));


        // Whenever to represent same elements
        // Can be Duplicate
        // To maintain insertion order

        // Array List Class

        // Overview
        /// Re-sizable , Dynamic Array
        // Element Access by index
        // Allows to store null values and duplicate values
        // Cannot create list of primitive Data types , use Wrapper Classes
        ArrayList<String> arrayList = new ArrayList();

        // Adding Element To List
        arrayList.add("Hello");
        arrayList.add("I am Ram !");
        System.out.println(arrayList);

        arrayList.forEach((element)->{
            System.out.println(element);
        });


        System.out.println(arrayList.get(0));
        // Checking element is in the list or not
        System.out.println(arrayList.contains("Ram"));
        System.out.println(arrayList.contains("Hello"));




    }
}
