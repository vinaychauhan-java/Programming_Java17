package com.vinay.prg1.numberFormat;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * The CompactNumberFormat class is a subclass of NumberFormat class
 * in the java.text package. It is responsible for formatting a number
 * in compact form. A factory method is added to NumberFormat to format
 * numbers in compact, human-readable form. There are two styles of formats,
 * LONG and SHORT, as shown below :-
 */
public class VinayPrg1 {
    public static void main(String[] args) {
        NumberFormat numberFormatLong = NumberFormat
                .getCompactNumberInstance(Locale.forLanguageTag("EN"),
                        NumberFormat.Style.LONG);
        System.out.println(numberFormatLong.format(3000));
        System.out.println(numberFormatLong.format(30000));
        System.out.println(numberFormatLong.format(300000));

        System.out.println("=======================================");

        numberFormatLong = NumberFormat
                .getCompactNumberInstance(Locale.forLanguageTag("EN"),
                        NumberFormat.Style.SHORT);
        System.out.println(numberFormatLong.format(3000));
        System.out.println(numberFormatLong.format(30000));
        System.out.println(numberFormatLong.format(300000));
    }
}
