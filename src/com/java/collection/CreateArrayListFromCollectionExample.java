package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {

    public static void main(String[] args) {

        //Creating arrayList object
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        // adding element in list
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);

        System.out.println(firstFivePrimeNumbers);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
        firstTenPrimeNumbers.add(7);

        System.out.println(firstTenPrimeNumbers);


        List<Integer> nextFivePrimeNumbers= new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        System.out.println(nextFivePrimeNumbers);

        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

        System.out.println(firstTenPrimeNumbers);


    }
}
