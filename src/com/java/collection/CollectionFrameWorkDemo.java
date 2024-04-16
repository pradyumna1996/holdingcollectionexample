package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionFrameWorkDemo {


    public static void main(String[] args) {


        //Collection Inerface
        // 1. List Interface
            // a. ArrayList
            // b. LinkedList
            // c. Vector --> Stack


        // 2. Queue Interface
            // a. PriorityQueue
            // b. Dequeue
            //  i. ArrayDequeue


        // 3. Set Interface
        // HashSet
        // LinkedHashSet

        //Sorted Set --> Tree Set



        //Map Hierarchy

        //HashMap --> Most Commonly Used
        // LinkedHashMap
        // hashTable -->Legacy
        //SortedMap --> Sort map Keys and Values
            // TreeMap Implements SortedMap

        // Located at java.util package



        //Collection Interface extends Iterable Interface to access and get data

        // Collection  interface has many interfaces

        //1. List Interface

        // Implemented by Many Classes -- > Array List Class , Linked List Class , Vector , Stack

       //2. Set Interface --> Hash Set Class , Linked Hash Set Class , Sorted Set (Interface)
        // Sorted Set --> TreeSet Class


        // 3. Queue Interface
        //


        Collection<String> fruitCollection = new ArrayList<>();

        //Adding Data
        //Using add API

        fruitCollection.add("Apple");
        fruitCollection.add("Mango");
        fruitCollection.add("Banana");

        System.out.println(fruitCollection);

        // Case Sensitive
        fruitCollection.remove("banana");
        System.out.println(fruitCollection);


        fruitCollection.remove("Banana");
        System.out.println(fruitCollection);

        // Check Whether Element is present or not

        // Use Contains API To Check
        // Return True or False
        System.out.println(fruitCollection.contains("Apple"));

        System.out.println(fruitCollection.contains("Banana"));



        // To Iterate we have for Each as Iterable

        fruitCollection.forEach((element) -> {
            System.out.println(element);
        });


        // Clear all Collections
        fruitCollection.clear();

        //Checking Whether Collection is empty or not
        System.out.println(fruitCollection.isEmpty());


        System.out.println(fruitCollection);


    }

}
