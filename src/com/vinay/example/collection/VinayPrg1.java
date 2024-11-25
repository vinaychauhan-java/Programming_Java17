package com.vinay.example.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VinayPrg1 {

    public static void main(String[] args) {
        VinayPrg1 myObj = new VinayPrg1();
        myObj.myMethod();
    }

    public void myMethod() {
        Student stud1 = new Student(1, "Vipin", "MCA");
        Student stud2 = new Student(2, "Vinay", "MCA");
        Student stud3 = new Student(3, "Ram", "BTech");
        Student stud4 = new Student(4, "Shyam", "Msc");
        // Creating Student Data as List
        List<Student> studentList = Arrays.asList(stud1, stud2, stud3, stud4);

        // Iterating over StudentList Data
        studentList.forEach(System.out::println);

        // Creating Student Data as Map
        Map<Integer, Student> studentMap = studentList.stream()
                .collect(Collectors.toMap(
                        Student::getRollNo,
                        stud -> stud,
                        (existingValue, newValue) -> existingValue));

        // Iterating over StudentMap Data
        studentMap.forEach((key, value) ->
                System.out.println("Key :: " + key + ", Value :: " + value));
    }

    class Student {
        private int rollNo;
        private String name;
        private String degree;

        public Student(int rollNo, String name, String degree) {
            this.rollNo = rollNo;
            this.name = name;
            this.degree = degree;
        }

        public int getRollNo() {
            return rollNo;
        }

        public String getName() {
            return name;
        }

        public String getDegree() {
            return degree;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollNo=" + rollNo +
                    ", name='" + name + '\'' +
                    ", degree='" + degree + '\'' +
                    '}';
        }

    }

}

