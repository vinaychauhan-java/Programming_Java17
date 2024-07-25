package com.vinay.prg1.switchPatterMatching;

public class VinayPrg2 {
    public static void main(String[] args) {
        VinayPrg2 obj = new VinayPrg2();
        obj.onShow(Country.INDIA);
    }

    // Switch Statement With the Yield
    public void onShow(Country country) {
        String result = switch (country) {
            case CANADA, AMERICA -> {
                System.out.println("Western Country");
                yield "People Love Chocolates";
            }
            case INDIA, NEPAL -> {
                System.out.println("Asian Country");
                yield "People Love Traditional Sweets";
            }
            default -> "No Data Found";
        };
        System.out.println(result);
    }
}
