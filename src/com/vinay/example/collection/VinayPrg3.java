package com.vinay.example.collection;

import java.util.List;
import java.util.function.Predicate;

public class VinayPrg3 {

    record Student(int RollNo, String name, String degree) {
    }

    public static void main(String[] args) {
        VinayPrg3 myObj = new VinayPrg3();
        myObj.myMethod();
    }

    public void myMethod() {
        Student stud1 = new Student(1, "Vipin", "MCA");
        Student stud2 = new Student(2, "Vinay", "MCA");
        Student stud3 = new Student(3, "Ram", "BTech");
        Student stud4 = new Student(4, "Shyam", "Msc");

        // Creating Student Data as List
        List<Student> studentList = List.of(stud1, stud2, stud3, stud4);

        // Predicate to filter Students with "MCA" degree
        Predicate<Student> isDegreeMCA = student -> "MCA".equals(student.degree());

        List<Student> studentFilteredList = studentList.stream()
                .filter(isDegreeMCA)
                .toList();

        System.out.printf("Student Filtered by Degree:- \n\t %s", studentFilteredList);
    }

}
