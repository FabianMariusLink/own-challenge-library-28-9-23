package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void getMemberShipNumber_whenToInstancesOfClassUserCreated_thenReturn2(){
        //GIVEN
        User user1 = new User("ExampleFirstName1","ExampleLastName1");
        User user2 = new User("ExampleFirstName2","ExampleLastName2");
        //WHEN
        int actual = User.getTotalNumberOfUser();
        int expect = 2;
        //THEN
        assertEquals(expect, actual);
    }
}