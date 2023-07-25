package com.example.demo2.service;

import com.example.demo2.Entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> getAll();
}
