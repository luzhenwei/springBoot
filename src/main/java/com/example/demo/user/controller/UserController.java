package com.example.demo.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/userSayHello")
    public String userSayHello(){
        return "userSayHello";
    }
}
