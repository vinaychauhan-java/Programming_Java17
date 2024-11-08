package com.vinay.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VinayPrg2 {
    record Student(int RollNo, String name, String degree) {
    }

    public static void main(String[] args) {
        VinayPrg2 myObj = new VinayPrg2();
        myObj.myMethod();
    }

    public void myMethod() {
        Student stud1 = new Student(1, "Vipin", "MCA");
        Student stud2 = new Student(2, "Vinay", "MCA");
        Student stud3 = new Student(3, "Ram", "BTech");
        Student stud4 = new Student(4, "Shyam", "Msc");

        // Creating Student Data as List
        List<Student> studentList = List.of(stud1, stud2, stud3, stud4);

        Map<String, List<String>> studentNameByDegree = studentList.stream().collect(
                Collectors.groupingBy(Student::degree, // Grouping by Degree
                        Collectors.mapping(Student::name, Collectors.toList())));// Collecting names into List
        System.out.println("Student Names By Degree :: " + studentNameByDegree);

        Map<String, List<Student>> studentObjByDegree = studentList.stream().collect(
                Collectors.groupingBy(Student::degree, // Grouping by Degree
                        Collectors.mapping(studObj -> studObj, Collectors.toList())));// Collecting names into List
        System.out.println("Student Object By Degree ::" + studentObjByDegree);
    }

}
