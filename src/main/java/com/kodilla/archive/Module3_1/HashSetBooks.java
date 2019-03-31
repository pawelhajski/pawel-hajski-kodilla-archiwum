package com.kodilla.archive.Module3_1;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

public class HashSetBooks {

    public static void main(String[] args) {

        Book book1 = new Book("The Godfather", "Mario Puzo", 1969);
        Book book2 = new Book("Harry Potter and the Order of the Phoenix", "J. K. Rowling", 2003);
        Book book3 = new Book("The Lost Symbol", "Dan Brown", 2009);
        Book book4 = new Book("Origin", "Dan Brown", 2017);

        HashSet<Book> booksSet = new HashSet<Book>();
        booksSet.add(book1);
        booksSet.add(book2);
        booksSet.add(book3);
        booksSet.add(book4);

        for(Book position : booksSet) {
            if(position.getIssueYear() < 2010) {
                System.out.println(position);
            }
        }
    }
}
