package com.vinay.example.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class VinayPrg1 {

    public static void main(String[] args) {
        VinayPrg1 myObj = new VinayPrg1();
        myObj.myMethod();
        System.out.println("Exiting :: Main Method");
    }

    public void myMethod() {
        System.out.println("Executing :: ExecutorService");
        // Define a fixed thread pool with 5 threads
        try (ExecutorService executorService = Executors.newFixedThreadPool(5)) {

            Map<Integer, Future<String>> futureMap = new HashMap<>();
            // Submit tasks to the executor and saving the result into Map
            for (int index = 1; index <= 10; index++) {
                int taskId = index;
                // Each submit call returns a Future object, which represents the result of the asynchronous computation.
                futureMap.put(index, executorService.submit(() -> invokeSomeAPI(taskId)));
            }

            // As soon as five Threads are completed, we have processed it further
            // Iterating the FutureMap
            futureMap.forEach((key, value) -> {
                try {
                    // The future.get() method blocks the main thread until the corresponding task is complete.
                    // This ensures the main thread waits for all tasks before proceeding.
                    System.out.println("Key : " + key + ", Value : " + value.get());
                } catch (ExecutionException | InterruptedException exception) {
                    throw new RuntimeException(exception);
                }
            });

            System.out.println("Shutting Down :: ExecutorService");
            // Shutdown the executor after all tasks are submitted
            executorService.shutdown();
        }
    }

    public String invokeSomeAPI(int taskId) throws InterruptedException {
        Thread.sleep(3000);  // Simulate delay in API call
        return "Task " + taskId + " : Invoking API on thread @ " + Thread.currentThread().getName();
    }

}
