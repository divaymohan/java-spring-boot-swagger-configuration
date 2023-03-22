package com.swagger.swagger.exapmle.controller;

import com.swagger.swagger.exapmle.dao.User;
import com.swagger.swagger.exapmle.service.UserService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping(path = "/user")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping(path = "/user/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PostMapping(path = "/user")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }



}
