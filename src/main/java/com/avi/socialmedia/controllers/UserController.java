package com.avi.socialmedia.controllers;

import com.avi.socialmedia.models.User;
import com.avi.socialmedia.repositories.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserDaoService userDaoService;

    @GetMapping(path = "/users")
    public List<User> retrieveAllUsers(){
        return userDaoService.findAll();
    }

    @GetMapping(path = "/user/{id}")
    public User retrieveUser(@PathVariable int id){
        return userDaoService.findById(id);

    }

    @PostMapping(path = "/user", consumes = "application/json")
    public User addUser(@RequestBody User user){
        return userDaoService.save(user);
    }
}
