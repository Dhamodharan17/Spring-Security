package com.springsecurity.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/test")
    public String testInitialSecurity(){
        return "I'm the first contoller";
    }
}
