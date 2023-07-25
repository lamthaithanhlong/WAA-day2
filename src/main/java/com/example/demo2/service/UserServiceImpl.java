package com.example.demo2.service;

import com.example.demo2.Dto.UserDTO;
import com.example.demo2.Entity.User;
import com.example.demo2.Repository.UserRepo;
import com.example.demo2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public void save(UserDTO user) {
        if(user.getEmail().length() < 6) {
            throw new RuntimeException("email wrong");
        }
        if(user.getEmail().length() < 6) {
            throw new RuntimeException("password wrong");
        }
        var entity = new User();
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());
        userRepo.save(entity);
    }
    @Override
    public List<UserDTO> getAll() {
        List<User> entityList = userRepo.getAll();
        List<UserDTO> dtoList = new ArrayList<>();
        entityList.forEach(entity -> {
            var dto = new UserDTO();
            dto.setEmail(entity.getEmail());
            dto.setPassword(entity.getPassword());
            dtoList.add(dto);
        });
        return dtoList;
    }
}
