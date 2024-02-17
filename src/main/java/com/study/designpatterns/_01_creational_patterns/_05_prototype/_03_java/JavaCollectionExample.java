package com.study.designpatterns._01_creational_patterns._05_prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student kadun = new Student("kadun");
        Student whitship = new Student("whitship");
        List<Student> students = new ArrayList<>();
        students.add(kadun);
        students.add(whitship);

        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
