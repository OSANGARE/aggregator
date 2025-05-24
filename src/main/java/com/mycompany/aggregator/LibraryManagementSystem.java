/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aggregator;

import java.util.List;

/**
 *
 * @author Lenovo
 */
public class LibraryManagementSystem {
    private final Library library;

    public LibraryManagementSystem(Library library) {
        this.library = library;
    }

    public boolean addNewBook(String isbn, String title, String author) {
        Book book = new Book(isbn, title, author);
        library.addBook(book);
        return true;
    }

    public boolean registerMember(String memberId, String name, String email) {
        Member member = new Member(memberId, name, email);
        library.addMember(member);
        return true;
    }

    public boolean borrowBook(String isbn, String memberId) {
        return library.borrowBook(isbn, memberId);
    }

    public boolean returnBook(String isbn) {
        return library.returnBook(isbn);
    }

    public List<Book> searchAvailableBooks() {
        return library.getAvailableBooks();
    }
}
    

