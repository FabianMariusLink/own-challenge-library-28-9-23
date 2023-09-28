package org.example.book;

import org.example.User;
import org.example.book.Book;
import org.example.book.Novel;
import org.example.book.SpecialistBook;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void getTotalBooks_when2InstancesOfClassBookBeenCreated_thenReturn2(){
        //GIVEN
        Book book1 = new Book("ExampleTitle1","ExampleAuthor1", "ExampleIsbn1");
        Book book2 = new Book("ExampleTitle2","ExampleAuthor2", "ExampleIsbn2");

        //WHEN
        int actual = Book.getTotalBooks();
        int expect = 2;
        //THEN
        assertEquals(expect, actual);
    }
    @Test
    void getTotalBooks_when2InstancesOfClassNovelBeenCreated_thenReturn2(){
        //GIVEN
        Novel novel1 = new Novel("ExampleTitle1","ExampleAuthor1", "ExampleIsbn1", "ExampleGenre1");
        Novel novel2 = new Novel("ExampleTitle2","ExampleAuthor2", "ExampleIsbn2", "ExampleGenre2");

        //WHEN
        int actual = Book.getTotalBooks();
        int expect = 2;
        //THEN
        assertEquals(expect, actual);
    }
    @Test
    void getTotalBooks_when2InstancesOfClassSpecialistBookBeenCreated_thenReturn2(){
        //GIVEN
        SpecialistBook specialistBook1 = new SpecialistBook("ExampleTitle1","ExampleAuthor1", "ExampleIsbn1", "ExampleGenre1", "ExampleDifficultyLevel1");
        SpecialistBook specialistBook2 = new SpecialistBook("ExampleTitle2","ExampleAuthor2", "ExampleIsbn2", "ExampleGenre2", "ExampleDifficultyLevel1");

        //WHEN
        int actual = Book.getTotalBooks();
        int expect = 2;
        //THEN
        assertEquals(expect, actual);
    }
    @Test
    void borrow_whenBorrowMethodIsExecutedOnInstanceOfBook_thenThisInstanceIsIncludedInUsersArrayBorrowedBooks() {
        //GIVEN
        Book book1 = new Book("ExampleTitle1","ExampleAuthor1", "ExampleIsbn1");
        Book book2 = new Book("ExampleTitle2","ExampleAuthor2", "ExampleIsbn2");
        User user1 = new User("ExampleFirstName1","ExampleLastName1");

        book1.borrow(user1);
        book2.borrow(user1);
        //WHEN
        String[] actual  = user1.getBorrowedBooks();
        //THEN
        String[] expect = {"ExampleTitle1","ExampleTitle2",null,null,null};
        assertTrue(Arrays.equals(actual, expect));
    }
}