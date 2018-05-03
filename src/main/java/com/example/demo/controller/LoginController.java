package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping
public class LoginController {
    @RequestMapping("/login1")
    public String login(Map<String,Object> map){
        map.put("msg", "登录界面");
        return "login";
    }
}
