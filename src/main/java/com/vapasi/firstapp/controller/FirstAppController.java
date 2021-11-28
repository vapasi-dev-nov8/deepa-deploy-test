package com.vapasi.firstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class FirstAppController {

    @GetMapping("/")
    public String greet(){
        return "<h1>Hello World !!! </h1>";
    }
}
