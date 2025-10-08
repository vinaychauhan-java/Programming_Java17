package com.vinay.prg1.instanceOf;

sealed class Vehicle permits Car, Truck {
    public void displayType() {
        System.out.println("This is a vehicle");
    }
}

/**
 * All sealed class subclasses must either be final, sealed or non-sealed
 */
// Permitted Subclass
final class Car extends Vehicle {
    @Override
    public void displayType() {
        System.out.println("This is a Car");
    }
}

// Permitted Subclass
non-sealed class Truck extends Vehicle {
    @Override
    public void displayType() {
        System.out.println("This is a Truck");
    }
}

class MiniTruck extends Truck {
    @Override
    public void displayType() {
        System.out.println("This is a MiniTruck");
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

        Vehicle vehicle = new MiniTruck();
        if (vehicle instanceof MiniTruck miniTruck) {
            miniTruck.displayType();
        }
    }
}
