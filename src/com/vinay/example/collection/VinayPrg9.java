package com.vinay.example.collection;

import java.util.Arrays;

/**
 * A simple Java program that demonstrates the use of Java Streams
 * to process an array of strings. The program converts each string
 * in the array to uppercase and prints them to the console.
 */

public class VinayPrg9 {

    public static void main(String[] args) {
        // Initialize an array of strings
        String[] strArr = {"Apple ", "Orange", "Pineapple", "Apple"};

        // Use Java Streams to convert each string to uppercase and print them
        Arrays.stream(strArr)
                .map(String::toUpperCase) // Convert each string to uppercase
                .forEach(System.out::println); // Print each string to the console
    }

}
