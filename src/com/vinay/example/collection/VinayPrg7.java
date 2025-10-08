package com.vinay.example.collection;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * This method demonstrates the use of Java Stream operations to process and validate a collection.
 * - The map operation applies String::trim to remove leading and trailing whitespace from each fruit name in the list.
 * - The filter operation retains only those fruit names that exist in the predefined valid fruit set.
 * Together, these operations clean and validate the data before collecting the results into a set for output.
 */

public class VinayPrg7 {

    public static void main(String[] args) {
        Set<String> fruitSet = Set.of("Apple", "Orange", "Pineapple", "Banana");
        List<String> fruitList = List.of("Apple ", " Orange", " Pineapple ");
        Set<String> validFruitSet = fruitList.stream()
                .map(String::trim)
                .filter(fruitSet::contains)
                .collect(Collectors.toSet());
        System.out.printf("Valid Fruits : %s", validFruitSet);
    }

}