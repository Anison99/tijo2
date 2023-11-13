package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AuthController {

    private final UserService userService;

    @Autowired
    public AuthController(@Lazy UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/api/register")
    public String registerUser(@RequestBody RegistrationRequest request, Model model) {
        userService.registerUser(request.getUsername(), request.getPassword());

        // Dodaj informację o udanej rejestracji
        model.addAttribute("registrationSuccess", true);

        return "redirect:/login";
    }
}
