# Library Management System

A simple system for managing books in a library. Users can search for, borrow, and return books. The system also tracks which books are currently borrowed and by whom.

## Features

- **Search Functionality:** Users can search for books by title, author, or ISBN.
- **Borrowing & Returning:** Users can borrow available books and return them when done.
- **User Management:** Track registered users and their borrowed books.
- **Book Categories:** Differentiate between general books, academic books, and novels.

## Concepts Implemented

1. **Classes and Objects:**
    - `Book` class: Contains properties such as title, author, ISBN number, and status (borrowed or available).
    - `User` class: Contains user details like name, membership number, and borrowed books.

2. **Inheritance:**
    - `AcademicBook` class inherits from `Book`: A specialized book with additional properties like subject or difficulty level.
    - `Novel` class inherits from `Book`: A specialized book with additional properties like genre or main characters.

3. **Static Modifiers:**
    - In the `Library` class: A static method that returns the total number of books in the library.
    - In the `User` class: A static method that returns the total number of registered users.

4. **Interfaces:**
    - `Borrowable` interface: Contains methods like `borrow()`, `returnBook()`, and `isBorrowed()`. The `Book`, `AcademicBook`, and `Novel` classes implement this interface.
    - `Searchable` interface: Contains a `search()` method, implemented by the `Library` class to search for books based on various criteria.

## Additional Ideas

- Extend the system to calculate fines for overdue books.
- Add a feature to add and view book reviews and ratings.