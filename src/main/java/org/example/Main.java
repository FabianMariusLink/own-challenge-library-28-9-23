package org.example;

import org.example.book.Book;

public class Main {
    public static void main(String[] args) {
        User user1 = new User ("Fabian", "Link");
        User user2 = new User ("Medea", "Ernst");
        User user3 = new User ("Antonia", "Ott");
        System.out.println(user1);
        System.out.println(User.getTotalNumberOfUser());

        Book book1 = new Book ("Der Steppenwolf", "Hermann Hesse","978-3-596-90078-9");
        Book book2 = new Book ("Die Verwandlung", "Franz Kafka","978-3-596-90400-8");
        Book book3 = new Book ("Im Westen nichts Neues", "Erich Maria Remarque","978-3-499-22755-5");
        Book book4 = new Book ("Der Vorleser", "Bernhard Schlink","978-3-442-31056-7");
        Book book5 = new Book ("Das Parfum", "Patrick Süskind","978-3-257-23028-4");
    }
}