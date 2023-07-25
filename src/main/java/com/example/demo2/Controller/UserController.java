package com.example.demo2.Controller;

import com.example.demo2.Dto.UserDTO;
import com.example.demo2.Entity.User;
import com.example.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public void save(@RequestBody UserDTO user) {

    }
    @GetMapping("/users")
    public List<User> getAll() {
        return null;
    }

    @GetMapping("/users/{id}")
    public UserDTO getById(@PathVariable int id) {
        return null;
    }

    @PutMapping("/users/{id}")
    public void update(@RequestBody UserDTO user, @PathVariable int id) {

    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable int id) {

    }
}
