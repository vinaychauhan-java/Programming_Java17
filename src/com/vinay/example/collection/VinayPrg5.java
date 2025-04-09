package com.vinay.example.collection;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VinayPrg5 {
    record Student(int rollNo, String name, String degree) {
    }

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student(1, "Vipin", "Engineering"),
                new Student(2, "Avyaan", "Medical"),
                new Student(3, "Vinay", "Engineering"),
                new Student(4, "Ananya", "Law"),
                new Student(5, "Jerry", "Medical")
        );

        // Convert to List of AbstractMap.SimpleEntry<String, String> where key = degree, value = name
        List<AbstractMap.SimpleEntry<String, String>> entries = students.stream()
                .map(s -> new AbstractMap.SimpleEntry<>(s.degree(), s.name()))
                .collect(Collectors.toList());

        // Group by degree and map names using the entries list
        Map<String, List<String>> degreeToNamesMap = entries.stream()
                .collect(Collectors.groupingBy(
                        AbstractMap.SimpleEntry::getKey,
                        Collectors.mapping(AbstractMap.SimpleEntry::getValue, Collectors.toList())
                ));

        // Another way of accessing :- Map<String, List<String>> degreeToNamesMap
        // Map<String, List<String>> degreeToNamesMap = getDegreeToNamesMap(students);

        // Output the result
        degreeToNamesMap.forEach((degree, names) ->
                System.out.println(degree + " => " + names));
    }

    private static Map<String, List<String>> getDegreeToNamesMap(List<Student> students) {
        return students.stream()
                .map(s -> new AbstractMap.SimpleEntry<>(s.degree(), s.name()))
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.mapping(Map.Entry::getValue, Collectors.toList())
                ));
    }

}