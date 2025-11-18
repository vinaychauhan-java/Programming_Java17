package com.vinay.example.collection;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Demonstrates filtering fruits by color using Predicate functional interface.
 */

public class VinayPrg11 {
    record Fruit(String name, String color) {
    }

    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", "Red");
        Fruit strawberry = new Fruit("Strawberry", "Red");
        Fruit banana = new Fruit("Banana", "Yellow");
        long totalCount = Stream.of(apple, strawberry, banana)
                .filter(getFruitByColor("Red")).count();
        System.out.printf("Total Fruits : %d", totalCount);
    }

    private static Predicate<Fruit> getFruitByColor(String pColor) {
        return fruit -> fruit.color.equalsIgnoreCase(pColor);
    }

    /*
     * Reference of Format Specifiers :-
     * %s — string or any object (uses toString, prints null for null)
     * %c — character
     * %b — boolean (prints true/false)
     * %d — decimal integer (byte, short, int, long, BigInteger)
     * %o — octal integer
     * %x — hexadecimal integer
     * %f — decimal floating (float, double, BigDecimal)
     * %e — scientific notation
     * %g — general floating (chooses %f or %e)
     * %a — hexadecimal floating-point
     * %h — hash code of argument (calls hashCode)
     * %t / \%T — date/time (combined with a suffix like F, T, R, e.g. \%tF)
     * %% — literal percent sign
     */

}
