package com.university.lab_1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.university.lab_1.Book;
import com.university.lab_1.Library;
import com.university.lab_2.DVD;
import com.university.lab_2.Patron;

public class TestLibrary {
    private Library library;
    private Book book;
    private Patron patron;
    private DVD dvd;
    
    @BeforeEach
    public void setUp(){
        library = new Library();
        book = new Book("I Am Legend", "IDB00001", "Richard Matheson", 0);
        dvd = new DVD("Oppenheimer", "IDD00001", 180);
        patron = new Patron("Sara Lloyd", "PN00001");
    }
    @Test
    public void testAddItem(){
        library.addItem(book);
        library.addItem(dvd);
        Assertions.assertEquals(2, library.listAvailable().size());
    }

    @Test
    public void testListAvailableItems(){
        library.addItem(book);
        library.addItem(dvd);
        Assertions.assertEquals(2, library.listAvailable().size());
    }
    @Test
    public void testListBorrowedItems(){
        library.addItem(book);
        library.addItem(dvd);
        library.registerPatron(patron);

        library.lendItem(patron, book);
        library.lendItem(patron, dvd);
        Assertions.assertEquals(2, patron.get_borrowedItems().size());
    }
}
