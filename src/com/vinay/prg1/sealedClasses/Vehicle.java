package com.vinay.prg1.sealedClasses;

/***
 * Sealed classes are a feature that allows you to control which classes can
 * extend or implement a particular class or interface. This feature is useful
 * for defining a fixed set of subclasses for a superclass, thereby providing
 * more control over inheritance.
 */
public sealed class Vehicle permits Car, Truck, Motorcycle {
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

// Permitted sSubclass
final class Truck extends Vehicle {
    @Override
    public void displayType() {
        System.out.println("This is a Truck");
    }
}

// Permitted Subclass
final class Motorcycle extends Vehicle {
    @Override
    public void displayType() {
        System.out.println("This is a Motorcycle");
    }
}

// Not Permitted as Subclass
// final class Jeep extends Vehicle {
//    @Override
//    public void displayType() {
//        System.out.println("This is a Car");
//    }
// }