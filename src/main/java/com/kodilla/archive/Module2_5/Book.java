package com.kodilla.archive.Module2_5;

public class Book {

    private String title;
    private Integer year;

    public Book(String title, Integer year) {
        this.title = title;
        this.year = year;
    }

    public Integer getYear() {
        return this.year;
    }

    public String makeString() {
        return "Title: " + this.title + "; year: " + this.year;
    }
}
