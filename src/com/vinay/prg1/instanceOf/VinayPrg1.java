package com.vinay.prg1.instanceOf;

sealed class Vehicle permits Car, Truck {
    public void displayType() {
        System.out.println("This is a vehicle");
    }
}

// Permitted Subclass
final class Car extends Vehicle {
    @Override
    public void displayType() {
        System.out.println("This is a Car");
    }
}

// Permitted Subclass
final class Truck extends Vehicle {
    @Override
    public void displayType() {
        System.out.println("This is a Truck");
    }
}

public class VinayPrg1 {

    public static void main(String[] args) {
        Object obj = new Car();

        // An enhanced instanceOf operator allows you to pattern match and
        // eliminates the extra line of code that was required earlier to perform casts
        if (obj instanceof Car carObj) {
            carObj.displayType();
        }
    }
}
