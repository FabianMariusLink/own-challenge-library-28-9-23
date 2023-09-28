package org.example.book;

import org.example.User;

public interface Borrowable {
    void borrow(User user);
    void returnBook();
    boolean isBorrowed();
}
