package com.shothosting.ShotHosting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/")
    public String print() {
        return "Hello world from vinay";
    }
}
