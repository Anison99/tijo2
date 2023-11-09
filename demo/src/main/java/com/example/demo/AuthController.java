package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final UserService userService;

    @Autowired
    public AuthController(@Lazy UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/api/register")
    public User registerUser(@RequestBody RegistrationRequest request) {
        return userService.registerUser(request.getUsername(), request.getPassword());
    }
}
