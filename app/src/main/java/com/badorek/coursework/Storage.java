package com.badorek.coursework;

import java.util.ArrayList;

public class Storage {
    private ArrayList<User> users = new ArrayList<>();

    private static Storage storage = null;

    private Storage(){

    }

    public static Storage getInstance() {
        if(storage == null){
            storage = new Storage();
        }
        return storage;
    }

    public ArrayList<User> getUsers(){
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }
}
