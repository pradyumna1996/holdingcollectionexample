package com.java.collection;

public class NeedOfCollection {

    public static void main(String[] args) {

        int a=10;
        int b=20;
        int c =30;

        //To Create numbers of integers, we need more variables.

        //Array solve this problem , we can store a similar data
        //Array are fixed in size

        int[] arArray = new int[10000];

        //Limitations of an array

        // 1. No Chance to increase and Decrease
        // 2. Memory Wastage if all are not used
        // 3. Similar Data are only stored  i.e Storing only homogenous data

        Student[] students = new Student[10];
        students[0] = new Student();
        students[1] = new Student();
        // * Uncomment***
        // students[2] = new Book();

        //Super class of all classes
        //It can hold different type of object

        Object[] objects = new Object[10];

        objects[0] = new Book();
        objects[1] = new Student();

        // 4. Array concept is not implemented as standard
        // Does not provide API , No Ready Made API

        //Ready Made Support is Not available

        // To Overcome this , we have collection Frame.
        // From JDK 1.2
        //Also known as Holding Collection
        //Ready made API are provided
        //Widely used as Data Structure

    }

}


class Book{


}

class Student{


}