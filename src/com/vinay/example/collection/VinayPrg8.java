package com.vinay.example.collection;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Scenario :- To determine the customer who paid the second-highest expenses
 */
public class VinayPrg8 {

    record Customer(String name, double amount, LocalDate expenseDate) {

    }

    public static void main(String[] args) {
        Customer customer1 = new Customer("Vipin", 1000.0d, LocalDate.now());
        Customer customer2 = new Customer("Vinay", 800.0d, LocalDate.now().minusDays(2));
        Customer customer3 = new Customer("Ananya", 600.0d, LocalDate.now().minusDays(2));
        Customer customer4 = new Customer("Avyaan", 500.0d, LocalDate.now().minusDays(5));
        List<Customer> customerList = new java.util.ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);

        // Approach - 1 :-
        List<Customer> finalCustList = customerList.stream().filter(data -> data.amount() > 500)
                .sorted(Comparator.comparingDouble(Customer::amount).reversed()).toList();
        System.out.println("Customer @ Second-Highest Expenses :: " + finalCustList.get(2));

        // Approach - 2 :-
        Map<Double, List<Customer>> groupedByAmount = customerList.stream()
                .filter(data -> data.amount() > 500)
                .collect(Collectors.groupingBy(Customer::amount));
        Optional<Double> custAmount = groupedByAmount.keySet().stream()
                .sorted(Comparator.reverseOrder()).skip(2).findFirst();
        if (Objects.nonNull(groupedByAmount.get(custAmount.get()))) {
            List<Customer> customers = groupedByAmount.get(custAmount.get());
            System.out.print("Customer @ Second-Highest Expenses :: ");
            customers.forEach(System.out::println);
        }
    }
}