package com.example.demo2.Controller;

import com.example.demo2.Dto.UserDTO;
import com.example.demo2.Entity.User;
import com.example.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    public void save(UserDTO user) {

    }

    public List<User> getAll() {
        return null;
    }

}