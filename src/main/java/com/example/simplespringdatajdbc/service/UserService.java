package com.example.simplespringdatajdbc.service;

import com.example.simplespringdatajdbc.model.Users;
import com.example.simplespringdatajdbc.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void login(String name, LocalDateTime now,String comment){
        userRepo.insertNewLogIn(name,now,comment);
    }

    public Iterable<Users> getAllUsers(){
        return userRepo.findAll();
    }
}
