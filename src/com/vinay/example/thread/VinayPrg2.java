package com.vinay.example.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class VinayPrg2 {

    public static void main(String[] args) {
        VinayPrg2 myObj = new VinayPrg2();
        Map<Integer, Future<String>> futureMap = myObj.myMethod();
        System.out.println("********************************************");
        // Once all Threads are completed, we have processed it further
        futureMap.forEach((key, value) -> {
            try {
                // The future.get() method blocks the main thread until the corresponding task is complete.
                // This ensures the main thread waits for all tasks before proceeding.
                System.out.println("Key : " + key + ", Value : " + value.get());
            } catch (ExecutionException | InterruptedException exception) {
                System.err.println("Exception Occurred :: " + exception);
                Thread.currentThread().interrupt();
            }
        });
        System.out.println("Exiting :: Main Method");
    }

    public Map<Integer, Future<String>> myMethod() {
        System.out.println("Executing :: ExecutorService");
        Map<Integer, Future<String>> futureMap = new HashMap<>();
        // Define a fixed thread pool with 5 threads
        try (ExecutorService executorService = Executors.newFixedThreadPool(5)) {
            // Submit tasks to the executor and saving the result into Map
            for (int index = 1; index <= 20; index++) {
                int taskId = index;
                // Each submit call returns a Future object, which represents the result of the asynchronous computation.
                futureMap.put(index, executorService.submit(() -> invokeSomeAPI(taskId)));
            }
            System.out.println("Shutting Down :: ExecutorService");
            // Shutdown the executor after all tasks are submitted
            executorService.shutdown();
        }
        return futureMap;
    }

    public String invokeSomeAPI(int taskId) throws InterruptedException {
        Thread.sleep(3000);  // Simulate delay in API call

        // Creating an Exceptional Case Scenario
        if (taskId == 16) {
            throw new InterruptedException("Explicit Exception");
        }

        System.out.println("Task " + taskId + " : Invoking API on thread @ " + Thread.currentThread().getName());
        return "Task " + taskId + " : Invoking API on thread @ " + Thread.currentThread().getName();
    }

}
