package org.example;

public class Main {
    public static void main(String[] args) {
        User user1 = new User ("Fabian", "Link");
        User user2 = new User ("Medea", "Ernst");
        User user3 = new User ("Antonia", "Ott");
        System.out.println(user1);
        System.out.println(User.getTotalNumberOfUser());
    }
}