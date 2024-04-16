package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AccessElementFromArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> myArrayList = new ArrayList<>();


        //Check list is empty or not
        //returns True and False
        System.out.println("Empty or Not : "+myArrayList.isEmpty());

        //Size of array list
        System.out.println("SIze : "+myArrayList.size());


        //Using For Loop To Add Elements
        for(int i=0 ; i<=5;i++){
            myArrayList.add(i);
        }

        //Printing List
        System.out.println("List: "+myArrayList);

        //Checking empty or not
        System.out.println("Empty or not: "+ myArrayList.isEmpty());

        //Size of array list
        System.out.println("size: "+ myArrayList.size());

        //Getting element form index
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.get(3));


        //Modifying Strings of index
        myArrayList.set(0,10);
        System.out.println(myArrayList);

        //Removing element from list

        myArrayList.remove(0);
        System.out.println(myArrayList);

        //Removing all elements
        myArrayList.removeAll(myArrayList);
        System.out.println(myArrayList);

        //Creating course List
        List<String> courses = new ArrayList<>();
        // Adding a List in Element
        courses.add("C");
        courses.add("Java");
        courses.add("C++");
        courses.add("Hibernate");
        //Displaying list
        System.out.println(courses);

        //Iterating over array list

        //Using For Loop
        System.out.println("---- Using For ------");
        for(int i=0 ; i <courses.size() ;i++ ){
            System.out.println(courses.get(i));
        }

        //Using Enhanced For
        System.out.println("-----Enhanced For-----");
        for(String course: courses){
            System.out.println(course);
        }


        // Basic Loop With Iterator
        System.out.println("---basic With Iterator---");
        for(Iterator iterator = courses.iterator();iterator.hasNext();){
            String course = (String) iterator.next();
            System.out.println(course);
        }

        //Iterator with while loop
        System.out.println("Using While and Iterator");
        Iterator iterator = courses.iterator();
        while (iterator.hasNext()){
            String course = (String)  iterator.next();

            System.out.println(course);
        }


        // Java 8 Streams + lambda Expression
        System.out.println("---- Java 8 Stream and Lambda ----- ");
        courses.stream().forEach(course-> System.out.println(course));

        // Java 8 forEach + Lambda
        System.out.println("---- Java 8 For Each and Lambda ----- ");
        courses.forEach((course)-> System.out.println(course));






    }




}
