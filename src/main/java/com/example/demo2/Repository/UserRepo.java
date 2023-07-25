package com.example.demo2.Repository;

import com.example.demo2.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {
    private static List<User> users= new ArrayList<>();

    public void save(User user) {
        users.add(user);
    }

    public List<User> getAll() {
        return users;
    }
}
