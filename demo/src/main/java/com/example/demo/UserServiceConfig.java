package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserServiceConfig {

    @Bean
    @Lazy
    public UserService userService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return new UserService(userRepository, passwordEncoder);
    }
}


