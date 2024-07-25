package com.vinay.prg1.recordClasses;

public class VinayPrg1 {

    public static void main(String[] args) {
        // Local Record Class
        record Point(int x, int y) {
        }

        Point pointObj = new Point(25, 50);
        System.out.println(pointObj);
    }

}
