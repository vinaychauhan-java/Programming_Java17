package com.vinay.prg1.switchPatterMatching;

/**
 * Pattern matching for switch enhances the traditional switch statement
 * by allowing patterns to be matched, making the code more expressive
 * and less error-prone.
 */
public class VinayPrg1 {

    public static void main(String[] args) {
        VinayPrg1 obj = new VinayPrg1();
        obj.onShow(Country.CANADA);
    }

    public void onShow(Country country) {
        switch (country) {
            case CANADA, AMERICA -> System.out.println("Western Country");
            case INDIA, NEPAL -> System.out.println("Asian Country");
            default -> System.out.println("No Data Found");
        }
    }
}