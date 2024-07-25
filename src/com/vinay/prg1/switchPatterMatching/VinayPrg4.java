package com.vinay.prg1.switchPatterMatching;

public class VinayPrg4 {
    public static void main(String[] args) {
        Object obj = "Hello World @ Java 17";
        // Using Pattern Matching for Switch
        switch (obj) {
            case Integer intValue -> System.out.println("Integer: " + intValue);
            case String stringValue -> System.out.println("String: " + stringValue);
            case Double doubleValue -> System.out.println("Double: " + doubleValue);
            case null -> System.out.println("Null Object");
            default -> System.out.println("Unknown Type");
        }
    }
}
