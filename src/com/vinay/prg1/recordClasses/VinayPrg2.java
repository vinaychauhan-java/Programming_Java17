package com.vinay.prg1.recordClasses;

public class VinayPrg2 {

    // Record Class
    record Point(int x, int y) {
    }

    public static void main(String[] args) {
        Point pointObj = new Point(25, 50);
        System.out.println(pointObj);
    }

}
