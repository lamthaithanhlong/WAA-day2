package com.example.demo2.service;

import com.example.demo2.Entity.User;
import com.example.demo2.Repository.UserRepo;
import com.example.demo2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void save(User user) {
        if(user.getEmail().length() < 6) {
            throw new RuntimeException("email wrong");
        }
        if(user.getEmail().length() < 6) {
            throw new RuntimeException("password wrong");
        }
        userRepo.save(user);
    }
    @Override
    public List<User> getAll() {
        return null;
    }
}
