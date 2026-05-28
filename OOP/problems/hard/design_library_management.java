// Problem: Design Library Management System
// Concept: Composition and Object Collaboration
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.ArrayList;

class Book {

    private String title;
    private String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {

        System.out.println(
            "Book: " + title + " | Author: " + author
        );
    }
}

class Library {

    private ArrayList<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {

        for (Book book : books) {
            book.displayBook();
        }
    }
}

public class Solution {

    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("Atomic Habits", "James Clear");
        Book b2 = new Book("Clean Code", "Robert Martin");

        library.addBook(b1);
        library.addBook(b2);

        library.displayBooks();
    }
}