package com.kodilla.archive.Module3_5;

import java.util.*;
import java.lang.*;
import java.io.*;

public class BooksApp {

    public static void main(String[] args) {

        LinkedList<Book> booksList = new LinkedList<Book>();
        for(int i=0; i<250000; i++) {
            booksList.add(new Book("" + i, "" + i));
        }

        /*
        System.out.println(booksList.size());
        System.out.println(booksList.get(20));
        */

        //Usuwanie okietu z końca listy
        long begin = System.currentTimeMillis();
        booksList.remove(new Book("249999", "249999"));
        long end = System.currentTimeMillis();

        System.out.println("Deleting the last object of the booksList took: " + (end - begin) + "ms.");
		/*
		System.out.println(booksList.size());
        System.out.println(booksList.get(booksList.size() - 1));
        */

        //Usuwanie obiektu z początku listy
        begin = System.currentTimeMillis();
        booksList.remove(new Book("0", "0"));
        end = System.currentTimeMillis();

        System.out.println("Deleting the first object of the booksList took: " + (end - begin) + "ms.");
		/*
		System.out.println(booksList.size());
        System.out.println(booksList.get(0));
		*/

        // Dodawanie obiektu na końcu listy
        begin = System.currentTimeMillis();
        booksList.add(new Book("" + (booksList.size() + 1), "" + (booksList.size() + 1)));
        end = System.currentTimeMillis();

        System.out.println("Adding a new object at the booksList's end took: " + (end - begin) + "ms.");
		/*
		System.out.println(booksList.size());
        System.out.println(booksList.get(booksList.size() - 1));
		*/

        //Dodawanie obiektu na początku listy
        begin = System.currentTimeMillis();
        booksList.add(0, new Book("0", "0"));
        end = System.currentTimeMillis();

        System.out.println("Adding a new object at the booksList's front took: " + (end - begin) + "ms.");
		/*
		System.out.println(booksList.size());
        System.out.println(booksList.get(0));
        */

        //Cz. 2

        HashMap<Book, Integer> booksMap = new HashMap<Book, Integer>();
        for(int j=0; j<300000; j++) {
            booksMap.put(new Book("" + j, "" + j), j);
        }

        /*
        System.out.println(booksMap.size());
        */

        begin = System.currentTimeMillis();
        booksMap.get(new Book("1534", "1534"));
        end = System.currentTimeMillis();

        System.out.println("Searching for an object in the booksList took: " + (end - begin) + "ms.");

        begin = System.currentTimeMillis();
        booksMap.remove(new Book("1534", "1534"));
        end = System.currentTimeMillis();

        System.out.println("Removing an object from the booksList took: " + (end - begin) + "ms.");

        begin = System.currentTimeMillis();
        booksMap.put(new Book("1534", "1534"), 1533);
        end = System.currentTimeMillis();

        System.out.println("Adding an object to the booksList took: " + (end - begin) + "ms.");
    }
}
