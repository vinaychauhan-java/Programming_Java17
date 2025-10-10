package com.vinay.example.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Demonstrates sorting a list of students using
 * both natural ordering (Comparable) and custom ordering (Comparator).
 */

public class VinayPrg10 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Vipin"));
        students.add(new Student(103, "Ananya"));
        students.add(new Student(102, "Vinay"));

        // 1. Using Comparable (natural order by id)
        students.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("============================================");

        // 2. Using Comparator (custom order by name)
        students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);

        System.out.println("============================================");

        // 3. Using Comparator with reverse order (by name)
        students.stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .forEach(System.out::println);

        System.out.println("============================================");
        // 4. Mix: First by name, then by ID (tie-breaker)
        students.add(new Student(103, "Avyaan"));
        students.stream()
                .sorted(Comparator.comparing(Student::getName)
                        .thenComparing(Student::getId))
                .forEach(System.out::println);
    }

}

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Performing Natural Order using Id
    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.id, student.id);
    }

    @Override
    public String toString() {
        return "Student : {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}