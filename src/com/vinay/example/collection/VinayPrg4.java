package com.vinay.example.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class VinayPrg4 {

    public static void main(String[] args) {

        // Collection of Duplicate elements
        List<String> fruitList = List.of("Apple", "Orange", "Banana", "Apple");

        // Collection of Unique elements
        Set<String> fruitSet = fruitList.stream().collect(Collectors.toCollection(HashSet::new));

        // Map<String, Integer> fruitMap = fruitSet.stream().collect(
        //        Collectors.toMap(fruit -> fruit, fruit -> fruit.length(), (firstObj, secondObj) -> firstObj));

        // Function.identity() is a method in Java's java.util.function.Function functional interface
        // that returns a function that always returns its input argument unchanged. It can be thought
        // of as a "no-operation" function.
        // Therefore, with a usage of Function.identity(), we can replace above commented code snippet :: fruit -> fruit
        Map<String, Integer> fruitMap = fruitSet.stream().collect(
                Collectors.toMap(Function.identity(), String::length, (firstObj, secondObj) -> firstObj));

        System.out.println(fruitMap);
    }

}