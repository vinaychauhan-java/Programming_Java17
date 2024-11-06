package com.vinay.prg1.time;

import java.time.Duration;
import java.time.Instant;

public class VinayPrg1 {

    public static void main(String[] args) throws InterruptedException {
        Instant startTime = Instant.now();
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        Instant endTime = Instant.now();
        Duration finalTime = Duration.between(startTime, endTime);
        System.out.println("Time Elapsed :: " +
                finalTime.toHours() + ":" +
                finalTime.toMinutes() % 60 + ":" +
                finalTime.toSeconds() % 60);
    }

}
