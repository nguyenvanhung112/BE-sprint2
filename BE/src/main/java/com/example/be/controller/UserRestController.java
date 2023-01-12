package com.example.be.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/users")
public class UserRestController {

    @GetMapping("/test")
    @Secured({"ROLE_MEMBER"})
    public String test1() {
        return "test1";
    }

}
