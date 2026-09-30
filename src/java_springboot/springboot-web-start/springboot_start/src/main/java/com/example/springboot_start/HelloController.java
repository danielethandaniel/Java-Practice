package com.example.springboot_start;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String name) {
        System.out.println("name : " + name);
        return "hello"+name;
    }
}
