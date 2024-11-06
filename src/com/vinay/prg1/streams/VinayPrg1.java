package com.vinay.prg1.streams;

import java.util.stream.Stream;

/**
 * Previously, to convert a stream to a list, we needed to use the collect method
 * with Collectors.toList(). But now, in Java 17, we can directly call a toList()
 * method on stream object as seen below:-
 */
public class VinayPrg1 {
    public static void main(String[] args) {
        Stream<String> countryStream = Stream.of("Canada", "India", "America");

        // Usage of native way to print in Console
        System.out.println(countryStream.toList());

        // Usage of Lambda
        // countryStream.forEach(data -> System.out.println(data));

        // Usage of Lambda with method reference
        //countryStream.forEach(System.out::println);

        // Note For Reference:-
        // We can use the Stream only once, if tried again then we will get an exception :-
        // Exception in thread "main" java.lang.IllegalStateException : stream has already
        // been operated upon or closed
    }
}
