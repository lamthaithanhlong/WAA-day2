package com.example.demo2.service;

import com.example.demo2.Dto.UserDTO;
import com.example.demo2.Entity.User;

import java.util.List;

public interface UserService {
    void save(UserDTO userDTO);
    List<UserDTO> getAll();
}
