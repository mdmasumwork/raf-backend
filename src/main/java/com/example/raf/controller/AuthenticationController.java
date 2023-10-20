package com.example.raf.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
public class AuthenticationController {

    @PostMapping("/login")
    public ResponseEntity<String> login() {
        return new ResponseEntity<>("Login successful!", HttpStatus.OK);
    }
}
