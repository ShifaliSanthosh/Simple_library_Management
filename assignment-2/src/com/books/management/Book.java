package com.books.management;

public class Book
{
    // private initialisation of variables
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    //constructor method with 'this'
    public Book(String title, String author, String isbn, boolean available)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    //getter methods - only return the variables
    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }
    public String getIsbn()
    {
        return isbn;
    }
    public boolean getAvailable()
    {
        return available;
    }

    //setter methods - assign the parameters (rs) to variables (ls)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    //display of each book
    @Override
    public String toString()
    {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Availability: " + available;
    }
}
