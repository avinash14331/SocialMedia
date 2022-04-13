package com.avi.socialmedia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {
    @GetMapping(path = "/helloWorld")
    public String helloWorld( ){
        return "Hello World";
    }
}
