package com.vinay.prg1.switchPatterMatching;

public class VinayPrg3 {
    public static void main(String[] args) {
        VinayPrg3 obj = new VinayPrg3();
        obj.onShow(Country.INDIA);
    }

    // Switch Statement With the Return
    public void onShow(Country country) {
        String result = switch (country) {
            case CANADA, AMERICA -> "Western Country";
            case INDIA, NEPAL -> "Asian Country";
            default -> "No Data Found";
        };
        System.out.println(result);
    }
}
