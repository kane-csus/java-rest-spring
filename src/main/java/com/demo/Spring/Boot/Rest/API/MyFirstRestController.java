package com.demo.Spring.Boot.Rest.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyFirstRestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }
}
