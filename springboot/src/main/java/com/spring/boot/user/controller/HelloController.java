package com.spring.boot.user.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/name/{myName}")
    public String demo(@PathVariable String myName) {
        return "Hello, " + myName + "!!!";
    }
}
