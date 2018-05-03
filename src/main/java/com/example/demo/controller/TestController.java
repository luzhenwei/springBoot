package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/helloworld")
    public String helloworld() {
        return "helloworld";
    }
    @GetMapping("/helloworld3")
    public String helloworld1() {
        return "helloworld3";
    }
}
