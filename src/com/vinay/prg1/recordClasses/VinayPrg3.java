package com.vinay.prg1.recordClasses;

interface Area {
    public String getArea();
}

public class VinayPrg3 {
    // Sealed record
    sealed interface Shape permits Circle, Rectangle {
    }

    record Circle(double radius) implements Shape, Area {
        @Override
        public String getArea() {
            return "Area of the Circle";
        }
    }

    record Rectangle(double length, double width) implements Shape {
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(3.0, 4.0);

        Circle anotherCircle = new Circle(10.0);

        System.out.println("Circle :: " + circle);
        System.out.println("AnotherCircle :: " + anotherCircle);
        System.out.println("AnotherCircle Area :: " + anotherCircle.getArea());
        System.out.println("Rectangle :: " + rectangle);
    }

}
