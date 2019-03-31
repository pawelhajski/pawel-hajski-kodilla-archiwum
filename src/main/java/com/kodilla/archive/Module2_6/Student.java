package com.kodilla.archive.Module2_6;

public class Student {

    private String name;
    private String surname;
    private Integer numberInRegistry;

    public Student(Integer numberInRegistry, String name, String surname) {
        this.numberInRegistry = numberInRegistry;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        final Student s = (Student) o;
        return this.name.equals(s.name) && this.surname.equals(s.surname);
    }

    @Override
    public String toString() {
        return numberInRegistry + ": " + name + " " + surname;
    }

    @Override
    public int hashCode() {
        return numberInRegistry;
    }
}
