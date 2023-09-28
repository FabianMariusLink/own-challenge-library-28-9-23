package org.example;

import java.util.Arrays;
import java.util.Objects;

public class User {
    private static int totalNumberOfUser = 0;
    private String firstName;
    private String lastName;
    private int membershipNumber;
    private String[] books;

    public User(String firstName, String lastName) {
        totalNumberOfUser++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.membershipNumber = totalNumberOfUser;
    }

    public static int getTotalNumberOfUser() {
        return totalNumberOfUser;
    }

    public static void setTotalNumberOfUser(int totalNumberOfUser) {
        User.totalNumberOfUser = totalNumberOfUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(int membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return membershipNumber == user.membershipNumber && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Arrays.equals(books, user.books);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, membershipNumber);
        result = 31 * result + Arrays.hashCode(books);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", membershipNumber=" + membershipNumber +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
