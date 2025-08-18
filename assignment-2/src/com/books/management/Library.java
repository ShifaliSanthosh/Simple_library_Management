package com.books.management;

import java.util.ArrayList;

public class Library
{
    private final ArrayList<Book> books; //array of books

    //constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // adding book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // removing book by isbn
    public void removeBookByIsbn(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) { //equivalent to books[i].isbn in python
                System.out.println("Book removed: " + books.get(i).getTitle());
                books.remove(i);
                return;
            }
        }
        System.out.println("Book with ID " + isbn + " not found.");
    }

    // list all books
    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
            return;
        }
        System.out.println("\n--- All Books in Library ---");
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    //search by title
    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}


