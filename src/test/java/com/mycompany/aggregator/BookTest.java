package com.mycompany.aggregator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {
    
    private Book instance;
    
    @Before
    public void setUp() {
        // Initialisation avant chaque test
        instance = new Book("1234567890", "Clean Code", "Robert C. Martin");
    }
    
    @Test
    public void testGetIsbn() {
        assertEquals("1234567890", instance.getIsbn());
    }

    @Test
    public void testGetTitle() {
        assertEquals("Clean Code", instance.getTitle());
    }

    @Test
    public void testGetAuthor() {
        assertEquals("Robert C. Martin", instance.getAuthor());
    }

    @Test
    public void testIsAvailable() {
        assertTrue(instance.isAvailable());
    }

    @Test
    public void testSetAvailable() {
        instance.setAvailable(false);
        assertFalse(instance.isAvailable());
    }
}