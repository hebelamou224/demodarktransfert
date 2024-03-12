package com.trustify.awsproject.controller;

import com.trustify.awsproject.model.User;
import com.trustify.awsproject.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ControllerMain {

    UserService userService;

    @GetMapping("/")
    public String helllo(){
        return "Ma premiere application deployer sur le cloud";
    }

    @PostMapping("/user")
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/users")
    public Iterable<User> getUserAll(){
        return userService.getUsers();
    }

}
