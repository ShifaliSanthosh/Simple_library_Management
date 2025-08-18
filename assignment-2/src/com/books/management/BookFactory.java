package com.books.management;

//two different types of objects
public class BookFactory {
    public static Book createBook(String title, String author, String isbn, boolean available, String type, int size) {
        if (type.equalsIgnoreCase("ebook")) {
            return new eBook(title, author, isbn, available, size);
        } else {
            return new Book(title, author, isbn, available);
        }
    }
}