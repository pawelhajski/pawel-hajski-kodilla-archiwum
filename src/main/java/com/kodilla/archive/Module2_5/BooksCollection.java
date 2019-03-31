package com.kodilla.archive.Module2_5;

public class BooksCollection {

    public void booksCollection() {

        LinkedList<Book> books = new LinkedList<Book>();

        books.add(new Book("The Lost Symbol", 2010));
        books.add(new Book("The Godfather", 1995));
        books.add(new Book("Harry Potter and the Chamber of Secrets", 1999));
        books.add(new Book("Warcraft Chronicles: Volume 1", 2017));

        for(Book book: books) {
            if(book.getYear() >= 2000) {
                System.out.println(book.makeString());
            }
        }
    }
}
