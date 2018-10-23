package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloGit {

    @RequestMapping("/hello")
    public String say(){
        return "Hello GitDemo2!";

    }
}
