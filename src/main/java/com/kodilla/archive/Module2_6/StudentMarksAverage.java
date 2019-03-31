package com.kodilla.archive.Module2_6;

import java.util.*;
import java.lang.*;
import java.io.*;

public class StudentMarksAverage {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Thomas", "Anderson");
        Student s2 = new Student(2, "Harry", "Potter");
        Student s3 = new Student(3, "Andrew", "Duffraine");
        Student s4 = new Student(4, "Bob", "Swagger");

        Marks m1 = new Marks(4, 3, 5, 5);
        Marks m2 = new Marks(4, 2, 3, 3);
        Marks m3 = new Marks(5, 5, 3, 3);
        Marks m4 = new Marks(3, 4, 5, 6);

        HashMap<Student, Marks> studentMarks = new HashMap<Student, Marks>();

        studentMarks.put(s1, m1);
        studentMarks.put(s2, m2);
        studentMarks.put(s3, m3);
        studentMarks.put(s4, m4);

        for(Map.Entry<Student, Marks> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().average());
        }
    }
}
