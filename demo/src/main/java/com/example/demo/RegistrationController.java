package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

    private final UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password, Model model) {
        userService.registerUser(username, password);

        // Dodaj informację o udanej rejestracji
        model.addAttribute("registrationSuccess", true);

        return "redirect:/login";
    }
}

