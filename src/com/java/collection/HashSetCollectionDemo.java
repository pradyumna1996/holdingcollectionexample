package com.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashSetCollectionDemo {

    public static void main(String[] args) {




        // Cannot contain duplicate value


        //Allows Null Value
        // Unordered collection --> Does not maintain order of insertion
        //Uses Hash Map to store

        Map<Integer,String> courseMap = new HashMap<Integer, String>();
        // Map as key and value
        // Adding Data in Map
        courseMap.put(1,"Apple");
        courseMap.put(2,"Ball");
        courseMap.put(3,"Cat");
        courseMap.put(4,"Dog");
        courseMap.put(5,"Elephant");

        System.out.println(courseMap);

        //Iterate  Using Iterator
        Iterator<Map.Entry<Integer,String>> iterator=  courseMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer ,String> entry= iterator.next();
            System.out.println(entry.getKey() + " Value: "+ entry.getValue());
        }


        // Through HashMap keySet using Iterator
        System.out.println("---Using hashMap KeySet and Iterator");
        Iterator<Integer> iterator1 = courseMap.keySet().iterator();
        while(iterator1.hasNext()){
            Integer key = iterator1.next();
            System.out.println(" Key "+ key + " Value "+courseMap.get(key));
        }

        // Using HashMap forEach Loop
        System.out.println("---- Using For Each loop ----");
        for(Map.Entry<Integer,String> entry : courseMap.entrySet()){
            System.out.println("Key "+ entry.getKey() +" Value: "+entry.getValue());
        }

        //Using lambda Expression
        System.out.println("--Using Lambda ------");
        courseMap.forEach((key,value)->{
            System.out.println(" Key :" + key + " Value: "+value);
        });



        //Using Stream API
        System.out.println("---Using Stream API ----");
        courseMap.entrySet().stream().forEach((entry)->{
            System.out.println(" Key : "+ entry.getKey() +" Value: "+entry.getValue());
        });


    }
}
