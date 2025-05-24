/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.aggregator;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class LibraryTest {
    
    private Library library;
    private Book testBook;
    private Member testMember;
    
    @Before
    public void setUp() {
        library = new Library();
        testBook = new Book("123", "Test Book", "Test Author");
        testMember = new Member("M001", "Test Member", "test@example.com");
    }
    
    @Test
    public void testAddBook() {
        library.addBook(testBook);
        Book retrieved = library.findBookByIsbn("123");
        assertNotNull(retrieved);
        assertEquals("Test Book", retrieved.getTitle());
    }
    
    @Test
    public void testAddMember() {
        library.addMember(testMember);
        Member retrieved = library.findMemberById("M001");
        assertNotNull(retrieved);
        assertEquals("Test Member", retrieved.getName());
    }
    
    @Test
    public void testBorrowBook() {
        library.addBook(testBook);
        library.addMember(testMember);
        
        assertTrue(library.borrowBook("123", "M001"));
        assertFalse(testBook.isAvailable());
    }
    
    @Test
    public void testReturnBook() {
        library.addBook(testBook);
        testBook.setAvailable(false);
        
        assertTrue(library.returnBook("123"));
        assertTrue(testBook.isAvailable());
    }
    
    @Test
    public void testGetAvailableBooks() {
        Book availableBook = new Book("456", "Available Book", "Author");
        library.addBook(testBook);
        library.addBook(availableBook);
        testBook.setAvailable(false);
        
        List<Book> availableBooks = library.getAvailableBooks();
        assertNotNull(availableBooks);
        assertEquals(1, availableBooks.size());
        assertEquals("Available Book", availableBooks.get(0).getTitle());
    }
}