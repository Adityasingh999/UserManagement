package com.sample;

import com.sample.models.User;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class UserManagerTest {



    @Test
    public void addUser() {
        UserManager userManager = new InMemoryStorageUserManager();
        userManager.addUser(new User(1,"aditya"));
        assertEquals(1, userManager.listUsers().size());
    }

    @Test
    public void updateUser(

    ) {
        UserManager userManager = new InMemoryStorageUserManager();
        userManager.updateUser(new User(1,"abhinav"));
        assertEquals(1, userManager.listUsers().size());

    }

    @Test
    public void listUsers() {
    }

    @Test
    public void deleteUser() {

    }

    @Test
    public void searchUsers() {
    }
}