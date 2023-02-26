package com.example.SRM.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController
{
    @GetMapping("/hello")
    public ResponseEntity<String> sayHello()
    {
        return ResponseEntity.ok("Hello from our app");
    }
    @GetMapping("/bye")
    public ResponseEntity<String> GoodBye()
    {
        return ResponseEntity.ok("Good bye and see you later");
    }
}
