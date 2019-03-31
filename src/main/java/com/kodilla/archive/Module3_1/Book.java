package com.kodilla.archive.Module3_1;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

public class Book {

    private String title;
    private String author;
    private Integer issueYear;

    public Book(String title, String author, Integer issueYear) {
        this.title = title;
        this.author = author;
        this.issueYear = issueYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueYear, author, title);
    }

    @Override
    public boolean equals(Object o) {
        Book e = (Book) o;
        return  (title.equals(e.getTitle())) &&
                (author.equals(e.getAuthor())) &&
                (issueYear.equals(e.getIssueYear()));
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "; Author: " + this.author + "; Issue year: " + this.issueYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public Integer getIssueYear() {
        return this.issueYear;
    }
}
