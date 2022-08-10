package com.sample.models;

import com.sample.InMemoryStorageUserManager;

import java.util.*;

public class User {
    private String name;
    private int id;

    public User(int userId, String username) {
        this.id =userId;
        this.name =username;

    }
    public User() {

    }

    public User(User user) {
    }

    public String toString(){
        return name +""+ id;
    }
    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id =id;
    }
    public void setName(String n){
        this.name =n;
    }
}

