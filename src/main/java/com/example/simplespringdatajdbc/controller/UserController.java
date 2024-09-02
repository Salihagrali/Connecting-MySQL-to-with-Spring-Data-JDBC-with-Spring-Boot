package com.example.simplespringdatajdbc.controller;

import com.example.simplespringdatajdbc.model.UserInfo;
import com.example.simplespringdatajdbc.model.Users;
import com.example.simplespringdatajdbc.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public void login(
            @RequestBody UserInfo userInfo
            ){
        LocalDateTime now = LocalDateTime.now();
        userService.login(userInfo.getName(),now, userInfo.getComment());
    }

    @GetMapping("/users")
    public Iterable<Users> getUsers() {
        return userService.getAllUsers();
    }
}
