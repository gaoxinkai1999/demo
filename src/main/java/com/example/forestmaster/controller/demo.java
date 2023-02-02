package com.example.forestmaster.controller;

import com.dtflys.forest.annotation.Post;
import com.example.forestmaster.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
    @Autowired
    public User user;

    @PostMapping("demo")
    public User a(){

        return user;
    }
}
