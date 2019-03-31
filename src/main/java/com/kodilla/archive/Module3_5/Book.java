package com.kodilla.archive.Module3_5;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.author, this.title);
    }

    @Override
    public boolean equals(Object o) {
        Book e = (Book) o;
        return  (this.author.equals(e.getAuthor())) &&
                (this.title.equals(e.getTitle()));
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "Author: a" + this.author + "; Title: t" + this.title;
    }
}
