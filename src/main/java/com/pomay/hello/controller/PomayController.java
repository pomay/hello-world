package com.pomay.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PomayController {

    @GetMapping("/test")
    public String hello(){
        return "Hello pomay~";
    }
}
