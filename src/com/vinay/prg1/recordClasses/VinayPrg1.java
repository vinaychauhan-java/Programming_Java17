package com.vinay.prg1.recordClasses;

/**
 * Records classes are immutable and used as data transfer objects
 * with zero boilerplate code. Record classes are defined with the
 * record keyword. It always extends the java.lang.Record class.
 * Example :- record Point(int x, int y) {}
 * The above line of code generates functionality automatically like
 * - All fields are private and final.
 * - A canonical constructor for all fields.
 * - Public accessor for all fields.
 * - equals, hashcode, and toString methods.
 * - Also, it can be defined locally either inside a class or method
 */

public class VinayPrg1 {

    public static void main(String[] args) {
        // Local Record Class
        record Point(int x, int y) {
        }

        Point pointObj = new Point(25, 50);
        System.out.println(pointObj);
    }

}
