package com.trustify.awsproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMain {

    @GetMapping("/")
    public String helllo(){
        return "Helle demo with aws";
    }

}
