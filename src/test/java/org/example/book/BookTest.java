package org.example.book;

import org.example.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void getTotalBooks_when2InstancesOfClassBook_thenReturn2(){
        //GIVEN
        Book book1 = new Book("ExampleTitle1","ExampleAuthor1", "ExampleIsbn1");
        Book book2 = new Book("ExampleTitle2","ExampleAuthor2", "ExampleIsbn2");

        //WHEN
        int actual = Book.getTotalBooks();
        int expect = 2;
        //THEN
        assertEquals(expect, actual);
    }
}