package com.example.demo.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
public class UserLoginController {

    @RequestMapping("/login")
    public String hello(Map<String,Object> map) {
        map.put("msg", "Hello login");
        return "login";
    }
}
