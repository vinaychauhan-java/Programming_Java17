package com.vinay.prg1.recordClasses;

public class VinayPrg3 {
    // Sealed record
    sealed interface Shape permits Circle, Rectangle { }

    record Circle(double radius) implements Shape { }

    record Rectangle(double length, double width) implements Shape { }

    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(3.0, 4.0);

        System.out.println("Circle :: " + circle);
        System.out.println("Rectangle :: " + rectangle);
    }

}
