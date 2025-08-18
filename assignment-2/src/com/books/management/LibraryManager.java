package com.books.management;

import java.util.Scanner;

public class LibraryManager {
    private Library library;
    private static LibraryManager instance;

    private LibraryManager() {
        this.library = new Library();
    }

    //singleton practice - getInstance() method only one
    public static LibraryManager getInstance() {
        if (instance == null) {
            instance = new LibraryManager();
        }
        return instance;
    }

    //main options
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. Search book");
            System.out.println("4. List books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    removeBook(scanner);
                    break;
                case 3:
                    searchBook(scanner);
                    break;
                case 4:
                    listBooks();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    //adding books
    private void addBook(Scanner scanner) {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter available: ");
        boolean available = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Is this an eBook? (yes/no): ");
        String isEbook = scanner.nextLine();
        Book book;
        if (isEbook.equalsIgnoreCase("yes")) {
            System.out.print("Enter size (KB): ");
            int size = scanner.nextInt();
            scanner.nextLine();
            //redirected to book factory class
            book = BookFactory.createBook(title, author, isbn, available, "eBook", size);
        } else {
            book = BookFactory.createBook(title, author, isbn, available,"book", 0);
        }
        library.addBook(book);
    }

    //removing books
    private void removeBook(Scanner scanner) {
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        library.removeBookByIsbn(isbn);
        System.out.println("Book removed");
    }

    //listing books
    private void listBooks() {
        library.listAllBooks();
    }

    //searching books
    private void searchBook(Scanner scanner) {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        Book book = library.searchBookByTitle(title);
        if (book != null) {
            System.out.println(book.toString());
        } else {
            System.out.println("Book not found");
        }
    }

    //main method
    public static void main(String[] args) {
        LibraryManager manager = LibraryManager.getInstance();
        manager.run();
    }
}