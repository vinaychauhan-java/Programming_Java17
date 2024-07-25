package com.vinay.prg1.sealedClasses;

public class VinayPrg1 {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Vehicle motorcycle = new Motorcycle();

        car.displayType();        // This is a Car
        truck.displayType();      // This is a Truck
        motorcycle.displayType(); // This is a Motorcycle
    }

}
