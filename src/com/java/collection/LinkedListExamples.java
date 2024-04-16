package com.java.collection;

import java.util.LinkedList;

public class LinkedListExamples {

    //Implements List and Deque
    // Doubly Linked List
    // Previous Node -- Data -- Next Node


    //Can contain Duplicate Elements
    // maintains insertion order

    public static void main(String[] args) {


        //Creating Linked List
        LinkedList<String> fruits = new LinkedList<>();

        // Adding element
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        // Display Linked List
        System.out.println(fruits);

        // adding at any index
        System.out.println("-- Adding in Between --");
        fruits.add(1,"Mango");
        System.out.println(fruits);

        // Adding at beginning
        fruits.addFirst("Watermelon");

        // Adding at last
        fruits.addLast("Pomegranate");
        System.out.println(fruits);



        // Getting the elements from linked List

        System.out.println("First element: "+fruits.getFirst());
        System.out.println("last element: "+fruits.getLast());
        System.out.println("Any Specif Position element: "+fruits.get(3));

        System.out.println("All Elements:" );
        for(String fruit: fruits){
            System.out.println(fruit);
        }



        // Removing the elements from linked List

        System.out.println("First element: "+fruits.removeFirst());
        System.out.println(fruits);

        System.out.println("last Deleted: "+fruits.removeLast());
        System.out.println(fruits);


        System.out.println("Any Specific Position element: "+fruits.get(2));
        System.out.println(fruits);
/*

        //Removing All
        fruits.removeAll(fruits); // or fruits.clearAll();
        System.out.println(fruits);
*/


        //Iterating and Searching element in Linked List

        System.out.println(fruits.contains("Orange"));

        // Index
        int index = fruits.indexOf("Orange");
        System.out.println(index);

        //

    }


}
