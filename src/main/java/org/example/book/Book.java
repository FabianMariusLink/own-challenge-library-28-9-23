package org.example.book;

import org.example.User;

import java.util.Objects;

public class Book implements Borrowable{
    private static int totalBooks = 0;
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed = false;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    @Override
    public void borrow(User user) {
    user.addBookToBooksArray(this.title);
    }

    @Override
    public void returnBook() {

    }

    @Override
    public boolean isBorrowed() {
        return false;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public static void setTotalBooks(int totalBooks) {
        Book.totalBooks = totalBooks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean getBorrowedStatus() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isBorrowed == book.isBorrowed && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, isbn, isBorrowed);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
