package com.vinay.example.collection;

import java.util.List;
import java.util.function.Predicate;

/**
 * Class demonstrates filtering a list of fruits using Java Streams with three different approaches to predicates:
 * (1) Lambda Expression: Filters out fruits containing "Grapes" using an inline lambda.
 * (2) Predicate Functional Interface: Filters out "Banana" by applying a reusable Predicate<String> returned from the isNotBanana() method.
 * (3) Method Reference: Filters out "Orange" by referencing the static method isNotOrange.
 */
public class VinayPrg6 {

    public static void main(String[] args) {
        List<String> fruitList = List.of("Apple", "Orange", "Banana", "Grapes");
        List<String> filteredFruitList = fruitList.stream()
                .filter(fruit -> !fruit.contains("Grapes")) // Using Lambda
                .filter(isNotBanana()) // Using Predicate
                .filter(VinayPrg6::isNotOrange).toList(); // Using Method Reference
        System.out.println(filteredFruitList);
    }

    public static Predicate<String> isNotBanana() {
        return fruit -> !fruit.contains("Banana");
    }

    private static boolean isNotOrange(String fruit) {
        return !fruit.equals("Orange");
    }

}
